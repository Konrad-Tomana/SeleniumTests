import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class picturesCapture {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement picture = driver.findElement(By.id("smileImage"));
        System.out.println(picture.getAttribute("naturalHeight"));
        System.out.println(picture.getSize().getWidth());//jeżeli wysokość obrazka jest 0 to znaczy, ze nie ywswietlil sie prawidlowo.
        System.out.println(picture.getSize().getHeight());
        driver.quit();
    }
}
