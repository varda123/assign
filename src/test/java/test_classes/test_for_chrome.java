package test_classes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import action_classes.action_demo;
import base_classes.Driver;
public class test_for_chrome {
Driver driverObject;
action_demo actionObject;
	@Test
	public void testingForChrome()
	{
		driverObject=new Driver();
		WebDriver driver=driverObject.getDriver();
		System.out.println(driver);
		actionObject=new action_demo(driver);
		System.out.println("successfully passed");
	}
}
