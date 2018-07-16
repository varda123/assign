package action_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrisHomePage {
	WebDriver driver;
	public hrisHomePage(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 WebElement userNameEntry;
     
     @FindBy(id="txtUserName")
     WebElement usernameElement;
        
     @FindBy(id="txtPassword")
     WebElement passwordElement;
     
     @FindBy(css=".alert-error")
     WebElement ErrorMessageElement;
       
    
    public  void login(String username, String password){
    	usernameElement.clear();
    	usernameElement.sendKeys(username);
    	passwordElement.clear();
    	passwordElement.sendKeys(password);
    	System.out.println(usernameElement + "((((((((((((");

    	passwordElement.submit();
	//	 return new hrisTimesheet(driver);	 
    }
    	    

}
