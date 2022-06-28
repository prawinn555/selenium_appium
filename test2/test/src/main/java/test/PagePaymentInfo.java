package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePaymentInfo {
	
	
	@FindBy(xpath ="//input[@value='Continue']")
	WebElement item;
	
	public PagePaymentConfirm continueToConfirm(WebDriver driver) {
		
		item.click();
		
		return PageFactory.initElements(driver, PagePaymentConfirm.class);

	}

}
