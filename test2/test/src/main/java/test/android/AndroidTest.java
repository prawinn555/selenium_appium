package test.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest {

	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "8.1");
	    desiredCapabilities.setCapability("deviceName", "Nexus 5X API 27");
	    desiredCapabilities.setCapability("appPackage", "com.simplemobiletools.contacts");
	    desiredCapabilities.setCapability("appActivity", ".activities.MainActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() throws InterruptedException {
		  
		  
		  System.out.println("starting appli");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  
		  MobileElement el2 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		  el2.click();
		    WebDriverWait wait = new WebDriverWait(driver, 3);
		    // Ex : attendre qu’un élément soit cliquable
		    
		  WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.packageinstaller:id/permission_allow_button")));
		    	
		  MobileElement el2a = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		  el2a.click();

		  MobileElement el3 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/fragment_fab");
		  el3.click();
		  
		  MobileElement el6 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_first_name");
		  el6.sendKeys("hello5");
		  MobileElement el7 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_surname");
		  el7.sendKeys("Paul2");
		  MobileElement el8 = (MobileElement) driver.findElementById("com.simplemobiletools.contacts:id/contact_number");
		  el8.sendKeys("1234567892");

		  MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Save");
		  el10.click();
		  System.out.println("END");
	  }

	  @org.junit.After
	  public void tearDown() {
	    driver.quit();
	  }
	
}
