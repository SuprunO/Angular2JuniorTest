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

    private String FIRSTNOTECOLORATTR = ".col-xs-4:first-child>div";
    private String SECONDNOTECOLORATTR = ".col-xs-4:nth-child(2)>div";
    private String THIRDNOTECOLORATTR = ".col-xs-4:nth-child(3)>div";
    private String FORTHNOTECOLORATTR = ".col-xs-4:nth-child(4)>div";


    private String FORTHNOTETITLE = ".col-xs-4:nth-child(4) div:nth-child(1) .title";
    private String FORTHNOTEVALUE = ".col-xs-4:nth-child(4) div:nth-child(1) .value";

    private String FIFTHNOTETITLE = ".col-xs-4:nth-child(5) div:nth-child(1) .title";
    private String FIFTHNOTEVALUE = ".col-xs-4:nth-child(5) div:nth-child(1) .value";

    public void addTextToNote() {
        getTitleField().sendKeys(TITLEINPUT);
        getTakeANoteField().sendKeys(NOTEVALUE);
        getButton().click();
    }


    public void addTextToNoteWithExtendedLength() {
        getTitleField().sendKeys(TITLEINPUTEXTENDED65);
        getTakeANoteField().sendKeys(NOTEVALUEEXTENDED200);
        getButton().click();
    }


    //COLOR ATTRIBUTES
    private WebElement getFNColorAttribute() {
        return driver.findElement(By.cssSelector(FIRSTNOTECOLORATTR));
    }

    public Boolean getFirstNoteColorAttribute() {
        return getFNColorAttribute().getAttribute("style").isEmpty();
    }

    private WebElement getSNDColorAttribute() {
        return driver.findElement(By.cssSelector(SECONDNOTECOLORATTR));
    }

    public Boolean getSNDNoteColorAttribute() {
        return getSNDColorAttribute().getAttribute("style").isEmpty();
    }

    private WebElement getTRDColorAttribute() {
        return driver.findElement(By.cssSelector(THIRDNOTECOLORATTR));
    }

    public Boolean getTRDNoteColorAttribute() {
        return getTRDColorAttribute().getAttribute("style").isEmpty();
    }

    private WebElement getFRTHColorAttribute() {
        return driver.findElement(By.cssSelector(FORTHNOTECOLORATTR));
    }

    public Boolean getFRTHNoteColorAttribute() {
        return getFRTHColorAttribute().getAttribute("style").isEmpty();
    }



    public WebElement getTitleField() {
        waiter(TITLE);
        return driver.findElement(By.cssSelector(TITLE));
    }

    public WebElement getTakeANoteField() {
        return driver.findElement(By.cssSelector(TAKEANOTE));
    }

    public WebElement getButton() {
        return driver.findElement(By.cssSelector(BUTTON));
    }

    public WebElement getFourthNoteTitle() {
        return driver.findElement(By.cssSelector(FORTHNOTETITLE));
    }

    public String getFourthNoteTitleText(){
        return getFourthNoteTitle().getText();
    }



    public Boolean getFourthNoteTitleCurrentInputLength() {
        int a = getFourthNoteTitle().getText().length();
        if (a < 40) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }


    public WebElement getFourthNoteValue() {
        return driver.findElement(By.cssSelector(FORTHNOTEVALUE));
    }

    public String getFourthNoteValueText(){
        return getFourthNoteValue().getText();
    }

    public Boolean getFourthNoteValueCurrentInputLength() {
        int a = getFourthNoteTitle().getText().length();
        if (a < 150) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public WebElement getFIFTHNoteTitle(){
        return driver.findElement(By.cssSelector(FIFTHNOTETITLE));
    }

    public Boolean getFifthNoteTitleCurrentInputLength() {
        int a = getFIFTHNoteTitle().getText().length();
        if (a < 40) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public WebElement getFIFTHNoteValue(){
        return driver.findElement(By.cssSelector(FIFTHNOTEVALUE));
    }

    public Boolean getFifthNoteValueCurrentInputLength() {
        int a = getFIFTHNoteValue().getText().length();
        if (a < 200) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}



