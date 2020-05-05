import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class jumpBetweenWindows {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver,currentWindowName);
        System.out.println("Tytul strony to: " + driver.getTitle());
        System.out.println("Obecny URL to: " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName); //powrót na pierwszą stronę
        driver.findElement(By.name("username")).sendKeys(" Mouse");

    }

    private void switchToNewWindow (WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to: " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki: " + windows.size());

        for (String window: windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }
}
