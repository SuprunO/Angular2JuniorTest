import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alex on 23.03.2017.
 */
public class BasePage {

    //
    public static String TITLEINPUT = "Bob's telephone Number";
    public static String NOTEVALUE = "(093) 464-40-85";

    //
    public static String TITLEINPUTEXTENDED65 = "Inhabit hearing perhaps on ye do no. It maids decay as there he. ";
    public static String NOTEVALUEEXTENDED200 = "Inhabit hearing perhaps on ye do no. It maids decay as there he. Smallest on suitable disposed do although blessing he juvenile in. Society or if excited forbade. Here name off yet she long sold easy.";

    //WIERD CHARS
    public static String TITLEINPUTWIERDCHARS = "%^#%&%@#&$^*^&$*%#^";
    public static String NOTEVALUEWIERDCHARS = "^&$($^&#%$(*&T(*%(*&$^#%";


    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void waiter(String SomeLocatorByCSSSelector) {
        WebDriverWait waitForOne = new WebDriverWait(driver, 30);
        waitForOne.until(ExpectedConditions.elementToBeClickable(By.cssSelector(SomeLocatorByCSSSelector)));
    }

    public void clickOn(String CSSSelector) {
        driver.findElement(By.cssSelector(CSSSelector)).click();
    }

    public void hover(String CSSLocator) {
        String mouseoverJS = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover'," +
                "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject)" +
                "{ arguments[0].fireEvent('onmouseover');}";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(mouseoverJS, driver.findElement(By.cssSelector(CSSLocator)));
    }

}
