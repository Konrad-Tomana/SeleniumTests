package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClick extends BaseSeleniumTest{

    @Test
    public void rightClick()   {
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        action.contextClick().build().perform(); // right click
        executor.executeScript("arguments[0].setAttribute ('value', 'Selenium')", searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.partialLinkText("Selenium Test Automation"));
        executor.executeScript("arguments[0].click();", seleniumLink);
        Assert.assertEquals(driver.getTitle(), "Automated Selenium Testing - Ghost Inspector");

    }
}
