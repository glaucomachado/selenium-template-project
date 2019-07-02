package pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * @author Glauco Machado
 * 
 */
public class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver driver) {
	this.driver = driver;
    }
}
