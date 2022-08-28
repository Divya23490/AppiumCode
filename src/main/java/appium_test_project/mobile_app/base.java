package appium_test_project.mobile_app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base 
{
    public static AndroidDriver capabilities() throws MalformedURLException
    {
    
    DesiredCapabilities cap= new DesiredCapabilities();
    File appDir = new File("src");
    File app = new File(appDir, "ApiDemos-debug.apk");
    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
    //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
    cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.TIMEOUTS, 2000);
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	return driver;

    }
}
