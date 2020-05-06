package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

// ("arguments[0].click();", element); - instead of "driver.click"
// ("arguments[0].setAttribute ('value', '" +longstring + "')", element); - "instead of sendKeys",
//

public class JavascriptExecution extends BaseSeleniumTest {

    @Test
    public void javascriptExecution() {
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute ('value', 'Selenium')",searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.partialLinkText("Selenium Test Automation"));
        executor.executeScript("arguments[0].click();", seleniumLink);
        Assert.assertEquals(driver.getTitle(), "Automated Selenium Testing - Ghost Inspector");
    }
}
