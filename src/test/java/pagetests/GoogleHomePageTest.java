package pagetests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import pageobjects.GoogleHomePage;
import pageobjects.WebDriverBase;

/**
 * @author Glauco Machado
 * 
 */
public class GoogleHomePageTest extends WebDriverBase {

    @Test
    public void simpleSearch() {
	GoogleHomePage googleHomePage = new GoogleHomePage(driver);
	googleHomePage.searchFor("Torresmo");

	assertThat(driver.getTitle()).isEqualTo("Torresmo - Pesquisa Google");
    }
}
