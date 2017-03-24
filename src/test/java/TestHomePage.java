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
        driver.manage().window().maximize();
    }

    //СURD test
    @Test(priority = 0)
    //Create
    public void addTextToNote() {
        homepage.addTextToNote();
    }

    @Test(priority = 1)
    public void addExtendedTextToNote() {
        homepage.addTextToNoteWithExtendedLength();
    }

    @Test(priority = 2)
    public void CheckForthNoteTextMatchWithInput() {
        Assert.assertEquals(homepage.getFourthNoteTitleText(), Boolean.TRUE, "The Created title is not match with input");
        Assert.assertEquals(homepage.getFourthNoteValueText(), Boolean.TRUE, "The Created note value is not match with input");
    }

    @Test (priority =  3)
    public void getFourthNoteTitleCurrentInputLength() {
        System.out.println(homepage.getFourthNoteTitleCurrentInputLength());
        Assert.assertTrue(homepage.getFourthNoteTitleCurrentInputLength(), "The text length is more than 40 symbols");
        System.out.println(homepage.getFourthNoteValueCurrentInputLength());
        Assert.assertTrue(homepage.getFourthNoteValueCurrentInputLength(), "The text length is more than 200 symbols");
    }


    @Test (priority =  4)
    public void getFifthNoteValueCurrentInputLength() {
        System.out.println(homepage.getFifthNoteTitleCurrentInputLength());
        Assert.assertTrue(homepage.getFifthNoteTitleCurrentInputLength(), "The text length is more than 40 symbols: ");
        System.out.println(homepage.getFifthNoteValueCurrentInputLength());
        Assert.assertTrue(homepage.getFifthNoteValueCurrentInputLength(), "The text length is more than 200 symbols");
    }

//    @Test(priority = 2)
//    public void deleteFourthNote() {
//        basePage.hover(".col-xs-4:nth-child(4) .note-card");
//        basePage.clickOn(".col-xs-4:nth-child(4) .note-card>.icon");
//    }


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
