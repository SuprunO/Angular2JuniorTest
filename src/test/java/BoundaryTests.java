import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by alex on 24.03.2017.
 */
public class BoundaryTests {
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


    @Test
    public void maxNotesToFail() {
        int i;
        for (i = 0; i < 30; i++) {
            homepage.addTextToNote();
            }
        }
    }





