package base_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import fileReader.configFileReader;
public class Driver {
configFileReader configFileReader ;
String driverPath;
public static WebDriver driver;
@BeforeClass
@Parameters({ "browser"})
	public WebDriver getDriver()
	{
		configFileReader =new configFileReader ();
	/*	if(Browser.equalsIgnoreCase("firefox"))
		{
			driverPath=configFileReader.getDriverPathForMozilla();
			System.out.println(driverPath);
			System.setProperty("webdriver.gecko.driver", driverPath);
			  driver = new FirefoxDriver();
			
		}*/
	//	if(Browser.equalsIgnoreCase("chrome"))
	//	{
		String driverPath=configFileReader.getDriverPathForChrome();
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);
		  driver = new ChromeDriver();
		  System.out.println(driver);
	
//	}
		return driver;
	}
}
