package appium_test_project.mobile_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSkip {

	
		

		@Test (priority = 0)
		public void CloseBrowser() {
			
			System.out.println("Closing Google Chrome browser");
			Reporter.log("Driver Closed After Testing");
		}

		@Test (priority = -1)
		public void OpenBrowser() {
			System.out.println("Launching Google Chrome browser"); 	        
			Reporter.log("Launching Google Chrome Driver for this test"); 
		}

		@Test (enabled = false)
		public void AccountTest(){
			System.out.println("Some tests for Customer Account");
		}
	}

