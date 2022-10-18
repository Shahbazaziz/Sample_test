package rahulshettyacadmy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IosBaseTest3 {
	public IOSDriver driver;
	public AppiumDriverLocalService service;
	
@BeforeClass
	public void configureAppium() throws MalformedURLException 
	{
		
	/*	service=new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/bin/appium"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start(); */
		
		 
		XCUITestOptions option=new XCUITestOptions();
	//This is for emulator
		 System.out.println("Taimoor tt is new change");
		option.setDeviceName("iPhone 12 Pro ");
	//This is for real devices	
		option.setDeviceName("Android Device");
		//For UIKitCatalog.app
	//	option.setApp("/Users/apple/Library/Developer/Xcode/DerivedData/UIKitCatalog-gosndtpbolzofydclxfgdsvnobyp/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		//For TestApp
	//	option.setApp("/Users/apple/Documents/Important/Eclipse Workspace/Appium/src/test/java/resources/TestApp 3.app");
		//For tappedN
	//	option.setApp("/Users/apple/Documents/Important/Eclipse Workspace/Appium/src/test/java/resources/tappedN.app");
		//For Retailo
	//	option.setApp("/Users/apple/Documents/Important/Eclipse Workspace/Appium/src/test/java/resources/retailo_go.app");
		option.setPlatformVersion("16.0");
		option.setCapability("udid", "6202D762-DF36-4B81-A1FA-02B6271EDFD7"); 
		
	//For Real devices
		
	/*
		option.setCapability("xcodeOrgId","xxxxxxxx"); 					// provided by team 
		option.setCapability("xcodeSigningId","iPhone Developer");		//same
		option.setCapability("udid","xxxxxxxx");     					//Device Tied
		option.setCapability("updateWDABundleId","xxxxxxx"); 			//Provided by team
    */
		
		
		//Appium--->Webdriver agent--->iOS apps
	//	option.setWdaLaunchTimeout(Duration.ofSeconds(20));




		driver=new IOSDriver(new URL("http://localhost:4723/wd/hub"), option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
//Below code can perform long press

public void touchAndHold(WebElement ele) 
{
	Map <String,Object>params=new HashMap<>();
	params.put("element", ((RemoteWebElement)ele).getId());
	params.put("duration", 5);
	driver.executeScript("mobile:touchAndHold", params);
}
















@AfterClass
	
public void teardown() {
  
		driver.quit();
		service.stop(); 
	}
}
