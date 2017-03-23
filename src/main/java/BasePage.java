import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alex on 23.03.2017.
 */
public class BasePage {


    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void waiter(String SomeLocatorByCSSSelector) {
        WebDriverWait waitForOne = new WebDriverWait(driver, 30);
        waitForOne.until(ExpectedConditions.elementToBeClickable(By.cssSelector(SomeLocatorByCSSSelector)));
    }

    public void hoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
        Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

}
