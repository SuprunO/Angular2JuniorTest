import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by alex on 23.03.2017.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private String TITLE = ".row>input:nth-child(1)";
    private String TAKEANOTE = ".row>input:nth-child(2)";
    private String BUTTON = ".btn-light";
    private String FORTHNOTE = ".col-xs-4:nth-child(4) div:nth-child(1) .title";

    public WebElement getTitleField() {
        waiter(TITLE);
        return driver.findElement(By.cssSelector(TITLE));
    }

    public String getTitleCurrentInput(){
        return getTitleField().getText();
    }

    public WebElement getTakeANoteField() {
        return driver.findElement(By.cssSelector(TAKEANOTE));
    }


    public WebElement getButton() {
        return driver.findElement(By.cssSelector(BUTTON));
    }

    public WebElement getFourthNoteTitle(){
        return driver.findElement(By.cssSelector(FORTHNOTE));
    }

    public String getFourthNoteTitleCurrentInput(){
        return getFourthNoteTitle().getText();
    }

    public WebElement deleteNoteIcon(){
        return driver.findElement(By.cssSelector(".icon"));
    }






}


