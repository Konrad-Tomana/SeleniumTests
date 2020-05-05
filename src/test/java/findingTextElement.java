import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findingTextElement {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        if(firstNameInput.isEnabled()) {
            System.out.println("This field is Enabled");
            firstNameInput.sendKeys("Tomek");
            System.out.println("I typed first name: " + firstNameInput.getAttribute("value"));
        } else {
            System.out.println("This field is disabled, you can't enter any letters");
        }

        driver.quit();
    }
}
