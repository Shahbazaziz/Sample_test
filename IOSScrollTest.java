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

public class IOSScrollTest extends IosBaseTest {
	
	@Test
	public void iOSScroll() throws MalformedURLException, InterruptedException {
		 
		//Actual automation script is written here
		
		
		WebElement scr=driver.findElement(AppiumBy.id("Web View"));
		Map<String,Object>params=new HashMap<>();
		params.put("element", ((RemoteWebElement)scr).getId());
		params.put("direction", "down");
		driver.executeScript("mobile:scroll", params);
		
		
		driver.findElement(AppiumBy.accessibilityId("Web View")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("105");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("250");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Blue color component value'")).sendKeys("170");
		Thread.sleep(3000);

		
		
	
		
	}

} 