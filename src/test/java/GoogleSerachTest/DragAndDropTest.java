package GoogleSerachTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseSeleniumTest {

    @Test
    public void dragAndDropTest () {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement dropZone = driver.findElement(By.id("droptarget"));

        Actions action = new Actions (driver); /* Actions (- klasa) action (- obiekt) = new Actions (driver) -
             parametr konstruktora, pobierany z klasy nadrzednej BaseSeleniumTest w ktorej jest inicjalizowany; */
        action.dragAndDrop(elementToDrag,dropZone).build().perform(); /* build, perform, standardowo na końcu
        dla tej klasy.*/
        WebElement youDidGreat = driver.findElement(By.xpath("//*[@id=\"droptarget\"]"));
    }
}
