package initializer_classes;
import action_classes.hrisHomePage;
import action_classes.hrisSearchPage;
import action_classes.hrisTimesheet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import base_classes.Driver;

public class object_initailizer {
	public hrisHomePage home;
    public	hrisSearchPage search;
	public hrisTimesheet timesheet;
	public Driver driverObject;
@BeforeSuite
public void actionClass_objects()
{
	System.out.println("step a");
	driverObject=new Driver();
	System.out.println("step b");
	WebDriver driver=driverObject.getDriver();
	System.out.println("step c");
	driver.get("https://hris.qainfotech.com/login.php"); 
}
public void object_home() {
	System.out.println("step d");
	home=new hrisHomePage(driverObject.driver);
}

public void object_timesheet() {
	System.out.println("step e");
	 timesheet=new hrisTimesheet(driverObject.driver);
}

public void object_search_page() {
	System.out.println("step f");
	 search=new hrisSearchPage(driverObject.driver);
}


}
