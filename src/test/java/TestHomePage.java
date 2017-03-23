import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by alex on 23.03.2017.
 */
public class TestHomePage {
    WebDriver driver;
    HomePage homepage;
    BasePage basePage;


    @BeforeClass
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C://gecko/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        homepage = new HomePage(driver);
        basePage = new BasePage(driver);
        driver.get("http://localhost:3000");
    }

    //СURD test
    @Test(priority = 0)
    //Create
    public void addTextToNote() {
        homepage.getTitleField().sendKeys("Bob's telephone Number");
        homepage.getTakeANoteField().sendKeys("(093) 464-40-85");
        homepage.getButton().click();
    }

    @Test(priority = 1)
    public void CheckTheTextMatchWithInitial() {
        Assert.assertEquals(homepage.getFourthNoteTitleCurrentInput(), "Bob's telephone Number", "The Created title is not match, it have to be: Bob's telephone Number ");
    }

    //.col-xs-4:nth-child(1) div:nth-child(1) .title

    @Test(priority = 2)
    public void deleteFourthNote() {
        basePage.hoverAndClick(driver, homepage.deleteNoteIcon(), homepage.deleteNoteIcon());
    }

    public void maxNotesToFail() {
        int i;
        for (i = 0; i < 30; i++) {
            addTextToNote();
        }
    }

    @AfterClass
    public void cleanUp() {
        try {
            driver.close();
            driver.quit();
        } catch (Exception e) {
            System.out.println("some errors occured during closing driver: \n" + e);
        }
    }
}
