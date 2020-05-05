import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkingCheckbox {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is checked");
        } else {
            System.out.println("Checkbox unchecked");
        }
        driver.quit();
    }
}
