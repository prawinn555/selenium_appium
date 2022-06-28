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

public class AndroidTest2 {

	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "8.1");
	    desiredCapabilities.setCapability("deviceName", "Nexus 5X API 27");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", ".Calculator");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() throws InterruptedException {
		  
		  
		  System.out.println("starting appli");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
		  el5.click();
		  MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
		  el6.click();
		  MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("plus");
		  el7.click();
		  MobileElement el8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("equals");
		  el9.click();

		  System.out.println("END");
	  }

	  @org.junit.After
	  public void tearDown() {
	    driver.quit();
	  }
	
}
