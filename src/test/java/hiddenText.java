import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenAtribute {
    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("mój tekst to: " + paragraph.getText()); // intuicyjnie nie podzialamy
        System.out.println("mój tekst to: " + paragraph.getAttribute("value")); // tu też, zwróci nam null
        System.out.println("mój tekst to: " + paragraph.getAttribute("textContent")); // use getAttribute string name "testcontent" for hidden text




    }
}
