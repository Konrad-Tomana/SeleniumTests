import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class existingItem {
    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\chesh\\IdeaProjects\\TestySelenium\\src\\main\\resources\\executables\\executables.drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D://CP//Files//test.html");
        checkIfElementExist(By.tagName("a"),driver);
        checkIfElementExist(By.tagName("aaaa"),driver);

        checkIfElementExist(driver,By.tagName("a"));
        checkIfElementExist(driver,By.tagName("aaaa"));
    }

    public boolean checkIfElementExist (By locator,WebDriver driver)    {
        if(driver.findElements(locator).size()>0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Brak elementu na stronie");
        return false;
    }

    public void checkIfElementExist(WebDriver driver,By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        }catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }

}
