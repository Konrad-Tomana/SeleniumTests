import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class displayedItem {
    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
        if (topSecretElement.isDisplayed()) {
            System.out.println("Item is displayed");
            System.out.println("Text for Iteam: " + topSecretElement.getText());
        } else {
            System.out.println("Item is not displayed");
            System.out.println("But contains text: " + topSecretElement.getAttribute("textContent"));
        }

        driver.quit();
    }
}
