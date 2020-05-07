package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseSeleniumTest{

    @Test
    public void mouseHover() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Actions action = new Actions(driver);
        // action.contextClick().build().perform(); // right click
        action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.id("navbtn_exercises"))).build().perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.partialLinkText("LEARN HTML"))).build().perform();
        Thread.sleep(3000);
    }
}
