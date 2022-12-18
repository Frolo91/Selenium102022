package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void TestCase01() {
	  
	//********---Clase para prueba de google *********
		String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
		System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/"); 
		
		String actualiTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		
		Assert.assertEquals(actualiTitle, expectedTitle); //7 VAlida que sena iguales el test si falla se detiene la ejecucion 
		
		
  }
}
