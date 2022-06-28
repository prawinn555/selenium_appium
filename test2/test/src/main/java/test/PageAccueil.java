package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageAccueil {
	
	@FindBy(xpath ="//a[contains(@href,'FISH')]")
	WebElement fish;
	
	@FindBy(xpath ="//a[contains(.,'My Account')]")
	WebElement myAccount;
	
	
	
	@FindBy(xpath ="//select[contains(@name,'account.languagePreference')]")
	WebElement lang;
	
	
	@FindBy(xpath ="//input[contains(@name,'account.listOption')]")
	WebElement listOption;
	
	
	
	
	public PageFish goToFish(WebDriver driver) {
		
		fish.click();
		
		return PageFactory.initElements(driver, PageFish.class);

	}

	public void goToAccount(WebDriver driver) {
		myAccount.click();
		
	}
	
	public void showInput(WebDriver driver) {
		Select s = new Select(lang);
		System.out.println("options" +
				s.getOptions().stream()
				.map( o -> toString(o)).reduce(( s1,  s2) ->  s1+", " +s2)
				
				);
		
		System.out.println("selected " +toString(s.getFirstSelectedOption()));
		s.selectByIndex(1);
		System.out.println("new selected " +toString(s.getFirstSelectedOption()));
	}

	private String toString(WebElement o) {
		
		return o.getTagName() +" " 
				+o.getAttribute("value")
				+" "
				+o.getText();
	}

}
