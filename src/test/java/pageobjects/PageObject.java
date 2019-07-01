package pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * @author glauco at @date 15:11:00
 * 
 */
public class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver driver) {
	this.driver = driver;
    }
}
