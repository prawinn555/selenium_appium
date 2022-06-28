package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCart {

	@FindBy(xpath ="//a[.='Proceed to Checkout']")
	WebElement item;
	
	public PagePaymentInfo continueToPay(WebDriver driver) {
		
		item.click();
		
		return PageFactory.initElements(driver, PagePaymentInfo.class);

	}
}
