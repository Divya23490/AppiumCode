package appium_test_project.mobile_app;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class TestApp extends base{
	
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver=capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	  //xpath id className, androidUIautomator
	     /*    xpath Syntax
	      *    //tagName[@attribute='value']
	    
	      * 
	      */
	     driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	     driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
	     driver.findElement(By.id("android:id/checkbox")).click();
	     driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	     driver.findElement(By.className("android.widget.EditText")).sendKeys("hello");
	     driver.findElements(By.className("android.widget.Button")).get(1).click();
	}

}
