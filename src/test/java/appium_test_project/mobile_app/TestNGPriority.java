package appium_test_project.mobile_app;

import org.testng.annotations.Test;
public class TestNGPriority {
	@Test (groups = { "demo2" })
	public void b_method() {
		System.out.println("This is B method");
	}
		
	@Test (groups = { "demo1" })	
	public void a_method() {
		System.out.println("This is A method");
	}
		
	@Test (priority = -1)
	public void d_method() {
		System.out.println("This is D Method");
	}
		
	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}
}
