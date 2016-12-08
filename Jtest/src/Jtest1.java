import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Jtest1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 File D = new File("/Users/bellamkondar/Documents/Dictionary.app");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM, "iOS");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	    capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.0-beta3");
	    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
	    capabilities.setCapability(MobileCapabilityType.APP,D.getAbsolutePath());
	    IOSDriver<MobileElement> driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	  
	   
	   driver.switchTo().alert().accept();
	   MobileElement popUp = driver.findElementByAccessibilityId("close_button");
	   if(popUp.isDisplayed())
	   {
		   popUp.click();
	   }
	   else
	   {
		   return;
	   } 
	   //driver.findElementByAccessibilityId("close_button").click();
	   driver.findElementByAccessibilityId("tutorialSkipButton").click();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   driver.findElementByAccessibilityId("containerTextField").click();
	   driver.findElementByAccessibilityId("containerTextField").sendKeys("why");
	   driver.findElementByAccessibilityId("dictionaryToggle").click();
	   Thread.sleep(2000);
	   driver.findElementByAccessibilityId("textFieldClearButton").click();
	 //driver.close();
	}

}
