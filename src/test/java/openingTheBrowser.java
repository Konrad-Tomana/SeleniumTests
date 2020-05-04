import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openingTheBrowser {

    @Test
    public void googleOpenTest(){
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3SchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));
        WebElement firstLink = driver.findElement(By.tagName("a"));


    }
}
