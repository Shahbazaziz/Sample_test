package rahulshettyacadmy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IosAppiumBasic extends IosBaseTest {
	
	@Test
	public void Appiumtest() throws MalformedURLException {
		 
		
		//Actual automation script is written here
		//Type of locators in iOS Xpath, classname, IOS ,iOSclassChain,iOSpredicateString,accessibility id,id
		
	driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Text Entry")).click();
	//Xpath is very slow in ios that's why ios guys brought this iOSclassChain 
	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField")).sendKeys("Tech Verticks");
	driver.findElement(AppiumBy.accessibilityId("OK")).click();
	//here we are using iOSpredicateString 
	// 1 Way of doing
	//driver.findElement(AppiumBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText'AND value=='Confirm / Cancel'"));
	// 2 Way of doing 	
	driver.findElement(AppiumBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText'AND value BEGINSWITH[c] 'Confirm'")).click(); 
	//Also
	//driver.findElement(AppiumBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText'AND value ENDSWITH[c] 'Cancel'"));
	
	String text=driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
	System.out.println(text);
	
	driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Confirm'")).click();
	
	
	
	
	
	
	
	}

}
 