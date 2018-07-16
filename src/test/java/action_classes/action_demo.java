package action_classes;
import org.openqa.selenium.WebDriver;

public class action_demo {
WebDriver driver;
	public  action_demo(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("driver has initialized in action class");
	}
}
