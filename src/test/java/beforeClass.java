import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeClass    {

        private WebDriver driver;

        @BeforeClass
        public void setUp ()    {
            String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void beforeclass() throws InterruptedException {
            System.out.println("Before class");
            driver.get("https://www.google.com");
            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys("Selenium");
            Thread.sleep(1000);
            searchInput.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            driver.findElement(By.partialLinkText("Selenium Test Automation")).click();
            Assert.assertEquals(driver.getTitle(), "Automated Selenium Testing - Ghost Inspector");
            Thread.sleep(3000);

        }
        @AfterClass
        public void tearDown ()  {
            System.out.println("After class");
            driver.quit();
        }
}
