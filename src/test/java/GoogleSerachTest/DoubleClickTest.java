package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest  extends BaseSeleniumTest {

    @Test
    public void doubleClickTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("file:///D:/CP/Files/DoubleClick.html");
        Actions action = new Actions (driver); /* Actions (- klasa) action (- obiekt) = new Actions (driver) -
             parametr konstruktora, pobierany z klasy nadrzednej BaseSeleniumTest w ktorej jest inicjalizowany; */

        // WebElement button = driver.findElement(By.id("bottom")); // Znajduje element
        // action.doubleClick(button).build().perform(); // odwołuję się do elementu metoda doubleClick
        // action.moveToElement(button).doubleClick().build().perform(); // odwołuję się do elementu metodą movieToElement

        action.doubleClick(driver.findElement(By.id("bottom"))).build().perform(); /* metoda doubleClick klasy action w której odwołuję
        się do metody konstruktora klasy nadrzędnej z którego pomocą odnajduję element na stronie.*/
        helper.takeScreenshot();
        Assert.assertTrue(driver.getWindowHandles().size()>1); //sprawdzenie czy mamy więcej niż 1 okno otwarte

    }
}
