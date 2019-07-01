package dummy_test;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DummyTest {

    private final String BASE_URL = "https://buildyourprofile.netlify.com/";
    private WebDriver driver;

    @BeforeClass
    public void setup() {
	System.setProperty("webdriver.gecko.driver", "/home/glauco/opt/webdriver/geckodriver");
	driver = new FirefoxDriver();
    }

    @Test
    public void dummyTestCase() {
	driver.get(BASE_URL);
	assertThat(driver.getTitle()).isEqualTo("Build Your Profile");
	// assertEquals("Título ", "Build Your Profile", driver.getTitle());
    }

    @AfterClass
    public  void tear() {
	if (driver != null) {
	    driver.quit();
	}
    }
}
