package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageIndex {
	@FindBy(xpath = "//a[.='Sign In']")
	WebElement bouton_signin;

	public PageLogin clicSignInButton(WebDriver driver) {
		bouton_signin.click();
		return PageFactory.initElements(driver, PageLogin.class);
	}
	
	
	
	
}
