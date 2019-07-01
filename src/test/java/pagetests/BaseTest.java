package pagetests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author glauco at @date 15:06:04
 * 
 */
public class BaseTest {

    protected static WebDriver driver;
    private static final String BASE_URL = "https://google.com";

    @BeforeClass
    public static void setUp() {
	System.setProperty("webdriver.chrome.driver", "/home/glauco/opt/webdriver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(BASE_URL);
    }

    @AfterClass
    public static void tearDown() {
	if (driver != null) {
	    BaseTest.driver.close();
	    BaseTest.driver.quit();
	}
    }
}
