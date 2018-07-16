package action_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrisTimesheet {
	WebDriver driver;
	public hrisTimesheet(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("driver is"+driver.getTitle());
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(id = "engTimeSearch")
     WebElement searchbarElement;
	 
	 public void search()
	 {
		 System.out.println("varda");
		 System.out.println(searchbarElement);
		 searchbarElement.sendKeys("Varda Saxena");
	//	return new hrisSearchPage(driver);
	 }
        
	
}
