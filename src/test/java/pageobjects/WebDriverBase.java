package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Glauco Machado
 * @date 2 de jul de 2019 14:27:03
 * 
 */
public class WebDriverBase {

    static protected WebDriver driver;
    private static final String BASE_URL = "https://google.com";

    @BeforeClass
    public static void setup() {

	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions();

	chromeOptions.addArguments("--headless");
	driver = new ChromeDriver(chromeOptions);

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicit
	//WebDriverWait wait = new WebDriverWait(driver, 10); // explicit
	driver.get(BASE_URL);
    }

    @AfterClass
    public static void tearDown() {
	if (driver != null) {
	    driver.quit();
	}
    }
//    public static void main(String[] args) {
//	WebDriverBase.setup();
//	driver.get("https://www.testingexcellence.com");
//	System.out.println(driver.getTitle());
//    }
}
