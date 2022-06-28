package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username_field;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_field;
	@FindBy(xpath = "//*[@id='Catalog']/form/input")
	private WebElement submit_button;

	@FindBy(xpath = "//*[@id='sdsdsdd']/form/input")
	private WebElement test;
	
	
	public PageAccueil logIn(WebDriver driver, String username, String password) {
		username_field.clear();
		username_field.sendKeys(username);
		password_field.clear();
		password_field.sendKeys(password);
		submit_button.click();
		return PageFactory.initElements(driver, PageAccueil.class);

	}
}