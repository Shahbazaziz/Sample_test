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

public class IOSSlider extends IosBaseTest {
	
	@Test
	public void iOSSliderTest () throws InterruptedException  {
		 
		//Actual automation script is written here
		
		WebElement slider=driver.findElement(By.xpath("//XCUIElementTypeSlider[@name=\"AppElem\"]"));
		slider.sendKeys("0%");
		Assert.assertEquals("0%", slider.getAttribute("value"));
		
		slider.sendKeys("1%");
		Assert.assertEquals("100%", slider.getAttribute("value"));

		slider.sendKeys("0.5%");
		Assert.assertEquals("43%", slider.getAttribute("value"));
	
		
	}

} 