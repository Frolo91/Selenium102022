package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_test {
//*************** Prueba inicial de muestra para abrir pantalla de google ********************
	/*public static void main(String[] args) {
		//********---Clase para prueba de google *********
		String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
		System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");  */
	
	//********************* Prueba para otras paginas de preubas **********
public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
		System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/"); 
		
		// Se declaran los objetos de login 
		
		WebElement inputUsername = driver.findElement(By.name("username"));
		WebElement inputPassword = driver.findElement(By.name("password"));
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		
		
		Thread.sleep(2000);
		inputUsername.sendKeys("cooltesters102022");
		Thread.sleep(2000);
		inputPassword.sendKeys("cooltesters102022");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);
		

	}

}
