import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownSelect {
    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");
        Select carSelect = new Select (driver.findElement(By.tagName("select")));
        carSelect.selectByIndex(1); // z listy
       // carSelect.selectByVisibleText("Mercedes"); // po widocznym tekście
       // carSelect.selectByValue("audi"); //po value


    }
}
