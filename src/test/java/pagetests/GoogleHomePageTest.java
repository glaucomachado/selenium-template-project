package pagetests;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import pageobjects.GoogleHomePage;

/**
 * @author glauco at @date 10:57:26
 * 
 */
public class GoogleHomePageTest extends BaseTest {

    @Test
    public void simpleSearch() {
	GoogleHomePage googleHomePage = new GoogleHomePage(driver);
	googleHomePage.searchFor("Torresmo");
	
	assertThat(driver.getTitle()).isEqualTo("Torresmo - Pesquisa Google");
    }
}
