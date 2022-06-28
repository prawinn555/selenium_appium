package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePaymentConfirm {
	
	@FindBy(xpath ="//a[.='Confirm']")
	WebElement item;
	
	public PagePaymentDone confirm(WebDriver driver) {
		
		item.click();
		
		return PageFactory.initElements(driver, PagePaymentDone.class);

	}

}
