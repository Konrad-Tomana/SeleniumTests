import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checkboxAndRadiobuttons {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");


        WebElement firstNameInput = driver.findElement(By.id("fname"));
        Thread.sleep(2000);
        firstNameInput.sendKeys("Konrad");
        Thread.sleep(1000);
        Select carSelect = new Select (driver.findElement(By.tagName("select")));
        carSelect.selectByVisibleText("Mercedes");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(1000);
        checkbox.click();
        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='male']"));
        Thread.sleep(1000);
        radiobutton.click();


        // driver.quit();

    }
}
