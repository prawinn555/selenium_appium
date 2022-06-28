package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFish {

	@FindBy(xpath ="//a[.='FI-SW-01']")
	WebElement item;
	
	public PageFishDetail select(WebDriver driver) {
		
		item.click();
		
		return PageFactory.initElements(driver, PageFishDetail.class);

	}
}
