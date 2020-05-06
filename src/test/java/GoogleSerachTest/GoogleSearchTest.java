package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void googleSearchTest()   {
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        //Thread.sleep(1000);
        searchInput.sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Selenium Test Automation")).click();
        Assert.assertEquals(driver.getTitle(), "Automated Selenium Testing - Ghost Inspector");
        //Thread.sleep(3000);
    }
}