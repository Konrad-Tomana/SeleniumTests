import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openingTheBrowser {

    @Test
    public void googleOpenTest(){
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }
}
