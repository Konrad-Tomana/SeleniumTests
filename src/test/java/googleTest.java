import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        // WebElement searchButton = driver.findElement(By.name("btnK")); - problem z kliknięciem an searchbutton
        searchInput.sendKeys(Keys.ENTER);
        // searchInput.sendKeys(Keys.ESCAPE);
        // searchButton.click();
        WebElement seleniumPageLink = driver.findElement(By.partialLinkText("Selenium Test Automation"));
        seleniumPageLink.click();

        driver.quit();

    }

}
