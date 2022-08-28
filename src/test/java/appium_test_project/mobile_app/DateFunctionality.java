package appium_test_project.mobile_app;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DateFunctionality extends BaseTest{
	
	@Test
	public void Date(){
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Dialog")).click();
	driver.findElement(AppiumBy.accessibilityId("change the date")).click();
	driver.findElement(AppiumBy.accessibilityId("30 July 2022")).click();
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(AppiumBy.accessibilityId("change the time")).click();
	driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"4\"]")).click();
	driver.findElement(By.id("android:id/button1")).click();
	}
}
