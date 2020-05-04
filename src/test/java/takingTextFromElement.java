import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class takingTextFromElement {
    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");
        Select carSelect = new Select (driver.findElement(By.tagName("select")));
        carSelect.selectByVisibleText("Audi");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Konrad");
        System.out.println("Wartość to " + firstNameInput.getText());
        System.out.println("Wartość to " + firstNameInput.getAttribute("value")); //pobieranie testu z inputa

        driver.quit();

    }
}

