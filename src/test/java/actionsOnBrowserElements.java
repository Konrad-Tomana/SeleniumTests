import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class actionsOnBrowserElements {

    @Test
    public void googleOpenTest(){
        String driverPath = "C:\\Users\\toman\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Konrad");
        firstNameInput.clear();
        firstNameInput.sendKeys("Jan");



    }
}