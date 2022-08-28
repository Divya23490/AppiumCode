package appium_test_project.mobile_app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

//options.setDeviceName("RahulPhone"); //emulator
public class BaseTest{
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{
		Map<String, String> env = new HashMap<String, String>(System.getenv());
        env.put("PATH", "C://Users//2194740//AppData//Local//Android//sdk:%ANDROID_HOME%/emulator:%ANDROID_HOME%/tools:%ANDROID_HOME%/platform-tools:%ANDROID_HOME%/build-tools/33.0.0:" + env.get("PATH"));
		 service = new AppiumServiceBuilder().withEnvironment(env).usingDriverExecutable(new File("C://Program Files//nodejs//node.exe")).withAppiumJS(new File("C://Users//2194740//node_modules//appium//build//lib//main.js"))
				 .withIPAddress("0.0.0.0").usingPort(4723).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub").build();
			service.start();
			
								
			UiAutomator2Options options = new UiAutomator2Options();
			
			options.setDeviceName("emulator-5554");
			
			
			options.setChromedriverExecutable("C://Users//2194740//Downloads//chromedriver_win32");
			
			options.setApp("C://Users//2194740//workspace//mobile_app//src//ApiDemos-debug.apk");	
//			options.setApp("C://Users//2194740//workspace//mobile_app//src//General-Store.apk");
			options.setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(50));
			options.setAdbExecTimeout(Duration.ofMillis(30000));
			options.getAdbExecTimeout();
			options.getUiautomator2ServerInstallTimeout();
//			
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			    
			));
		}while(canScrollMore);
	}

	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));
		
		
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
        service.stop();
		}
	


}
