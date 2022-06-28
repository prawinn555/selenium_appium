package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFishDetail {

	@FindBy(xpath ="//a[.='Add to Cart']")
	WebElement item;
	
	public PageCart addToCart(WebDriver driver) {
		
		item.click();
		
		return PageFactory.initElements(driver, PageCart.class);

	}
}
