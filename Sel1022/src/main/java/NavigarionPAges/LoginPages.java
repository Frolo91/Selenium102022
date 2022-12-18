package NavigarionPAges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonClasses.WrapClass;

public class LoginPages extends WrapClass {
	
	public LoginPages(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	
	//Login PAge WebElements
	
	@FindBy (id = "user-name") 
	private WebElement userNameimput;
	@FindBy (name = "password") 
	private WebElement pwdimput;
	@FindBy (id = "login-button") 
	private WebElement loginBtn;
	
	//Login Methods
	
	public void login (String user, String pwd) {
		
		sendKeys(userNameimput, user);
		sendKeys(pwdimput, pwd);
		click(loginBtn);
		
	}

}
