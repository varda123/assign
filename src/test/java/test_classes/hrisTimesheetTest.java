package test_classes;
import org.testng.annotations.Test;

import action_classes.hrisTimesheet;
import initializer_classes.object_initailizer;
public class hrisTimesheetTest extends object_initailizer  {
	@Test
	public void testing_timesheetPage()
	{
		object_timesheet();
		System.out.println("step 2");
		System.out.println(driverObject.driver.getTitle());
		timesheet.search();
	}

}
