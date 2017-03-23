import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by alex on 23.03.2017.
 */
public class TestHomePage {
    WebDriver driver;
    HomePage homepage;


    @BeforeClass
    public void startUp() {
        System.setProperty("webdriver.gecko.driver", "C://gecko/geckodriver.exe");
        driver = new FirefoxDriver();
        homepage = new HomePage(driver);
        driver.get("http://localhost:3000");
    }

    //СURD test
    @Test
    //Create
    public void addTextToNote() {
        homepage.getTitleField().click();
        homepage.getTitleField().sendKeys("Bob's telephone Number");
        homepage.getTakeANoteField().click();
        homepage.getTakeANoteField().sendKeys("(093) 464-40-85");
        homepage.getButton().click();
    }

    @AfterClass
    public void closeUp() {
        driver.close();
        driver.quit();
    }


}
