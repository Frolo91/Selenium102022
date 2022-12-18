package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slenium_Explicitwait {

	public static void main(String[] args) {
		
		String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
		System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/"); 
		
		
		WebElement userName = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.name("username")));

	}

}
