package rahulshettyacadmy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class iOSLongPress extends IosBaseTest {
	
	@Test
	public void iOSlongPressGestures() throws MalformedURLException, InterruptedException {
		 
		//Actual automation script is written here
		
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
	WebElement ele=driver.findElement(AppiumBy.iOSClassChain("**XCUIElementTypeButton[`label=='Increment'`][3]"));
	touchAndHold(ele);
		
		
	
		
	}

} 