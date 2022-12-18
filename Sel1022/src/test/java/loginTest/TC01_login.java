package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonClasses.GlobalVariables;
import CommonClasses.SetupDriver;
import NavigarionPAges.LoginPages;

public class TC01_login {
	//Declarar e inicializar el webdriver
	WebDriver driver = SetupDriver.setupDriver();
	
	//Page Object
	
	LoginPages loginPage = new LoginPages(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
  @Test
  public void TC01() {
	  
	  loginPage.login(GlobalVariables.STANDAR_USER,GlobalVariables.ALL_USER_PWD);
  }
  
  @AfterTest
  
  public void closeDriver() {
	  driver.quit();
  }
  
  
}
