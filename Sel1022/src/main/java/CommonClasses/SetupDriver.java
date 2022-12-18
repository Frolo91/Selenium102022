package CommonClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	
	public static WebDriver setupDriver() {
	String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
	System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	return driver;
	}

}
