import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by alex on 24.03.2017.
 */
public class UIAttributesCheck {
    WebDriver driver;
    HomePage homepage;
    BasePage basePage;


    @BeforeClass
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C://gecko/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        homepage = new HomePage(driver);
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    //Create
    public void addTextToNote() {
        homepage.addTextToNote();
    }

    @Test
    public void checktheFirstBlockColorified() {
        System.out.println(homepage.getFirstNoteColorAttribute());
        Assert.assertFalse(homepage.getFirstNoteColorAttribute(), "The color attribute is empty, kindly fix");
    }


    @Test
    public void checktheSecondBlockColorified() {
        System.out.println(homepage.getSNDNoteColorAttribute());
        Assert.assertFalse(homepage.getSNDNoteColorAttribute(), "The color attribute is empty, kindly fix");
    }

    @Test
    public void checktheThirdBlockColorified() {
        System.out.println(homepage.getTRDNoteColorAttribute());
        Assert.assertFalse(homepage.getTRDNoteColorAttribute(), "The color attribute is empty, kindly fix");
    }

    @Test
    public void checktheForthBlockColorified() {
        System.out.println(homepage.getFRTHNoteColorAttribute());
        Assert.assertFalse(homepage.getFRTHNoteColorAttribute(), "The color attribute is empty, kindly fix");
    }


}

