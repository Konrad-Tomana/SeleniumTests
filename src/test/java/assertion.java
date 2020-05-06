import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {

    @Test
    public void assertion() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.partialLinkText("Selenium Test Automation"));
        seleniumPageLink.click();

        String expectedTitle = "Automated Selenium Testing - Ghost Inspector";
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),expectedTitle);
        Assert.assertNotEquals("TEST1", "TEST2");
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        Assert.assertTrue(driver.getTitle().equals("Automated Selenium Testing - Ghost Inspector"), "titles are not equal");

        driver.quit();

    }
}
