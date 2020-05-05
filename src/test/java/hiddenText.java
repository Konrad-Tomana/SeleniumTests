import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenText {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");

        WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Mój tekst to: " + paragraph.getText()); // intuicyjnie nie zadziala
        System.out.println("Mój tekst to: " + paragraph.getAttribute("value")); // to też,
        System.out.println("Mój tekst to: " + paragraph.getAttribute("textContent") + " Solution: for hidden text use getAttribute string name \"testContent\"");
        // for hidden text use getAttribute string name "testContent"
        driver.quit();

    }
}
