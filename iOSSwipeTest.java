package rahulshettyacadmy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
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

public class iOSSwipeTest extends IosBaseTest {
	
	@Test
	public void iOSSwipeTestDemo() throws MalformedURLException, InterruptedException {
		 
		//Actual automation script is written here
		Map<String,Object> params=new HashMap<>();
		params.put("bundleId","com.apple.mobileslideshow");
		driver.executeScript("mobile:launchApp", params);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"All Photos\"]")).click();
		//To get the count of the pictures
		List<WebElement> allphotos=driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeCell"));
		System.out.println(allphotos.size());
		
		driver.findElement(By.xpath("//XCUIElementTypeCell[1]")).click();
		
		for(int i=0;i<allphotos.size();i++)
		{
		//Below code can make a single swipe to the left for swipe till the count we use for loop
		System.out.println(driver.findElement(By.xpath("//XCUIElementTypeNavigationBar")).getAttribute("name"));
		Map<String,Object> param1=new HashMap<String,Object>();
		param1.put("direction", "left");
		driver.executeScript("mobile:swipe", param1);
		}
		//Below line of code can navigate back to previous screen
		driver.navigate().back();
		
		//To make the app return to initial state
		driver.findElement(AppiumBy.accessibilityId("Albums")).click(); //cleanup
	
		
	
		
	}

} 