package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class oftAssert {
	

	SoftAssert ssofteassert = new SoftAssert();
	
  @Test
  public void testcase01() {
	  
		//********---Clase para prueba de google *********
		String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
		System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/"); 
		
		String actualiTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		String badTitle = "ParaBank | Welcome |";
		
		ssofteassert.assertEquals(actualiTitle, badTitle);
		ssofteassert.assertEquals(actualiTitle, expectedTitle);
		
  }
}
