import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openingTheBrowser {

    @Test
    public void googleOpenTest(){
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(1300,800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.get("D://CP//Files//test.html");
        driver.findElement (By.id("newPage")).click();
        driver.quit(); //zamyka wszystkie okna
        //driver.close(); //zamyka pierwotne okno

    }
}
