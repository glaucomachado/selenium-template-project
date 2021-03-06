package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Glauco Machado
 * 
 */
public class GoogleHomePage extends BasePage {

    private WebElement q = driver.findElement(By.name("q"));
    
    private WebElement btnSearch = driver.findElement(By.name("btnK"));
    
    public GoogleHomePage(WebDriver driver) {
	super(driver);
    }

    public void searchFor(String word) {
	this.q.clear();
	this.q.sendKeys(word);
	this.btnSearch.click();
    }
}
