package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author glauco at @date 10:53:51
 * 
 */
public class GoogleHomePage extends PageObject {

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
