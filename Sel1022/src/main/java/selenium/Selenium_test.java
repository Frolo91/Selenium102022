package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


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
		
		/*
		
		Thread.sleep(2000);
		inputUsername.sendKeys("cooltesters102022");
		Thread.sleep(2000);
		inputPassword.sendKeys("cooltesters102022");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);
		*/
		
		//Metodos de navegacion 
		
		//driver.navigate().refresh(); // refresca la pagina 
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().back();// Atras 
		
		//Metodo del explorador 
		
		String title = driver.getTitle(); // extrae el titulo de la pagina 
		// para validar el titulo de la pagina 
		System.out.println("El titulo de la pagina es: "+title);
		
		// Para validar la Url 
		
		String urldashboard = driver.getCurrentUrl(); // extrae la Url de la pagina 
		// para validar la url de la pagina  
		System.out.println("El titulo de la pagina es: "+ urldashboard);
		
		// Verificar elemento desplegado en Pagina 
		
		Boolean homeDisplayer = driver.findElement(By.className("home")).isDisplayed();
		
		if(homeDisplayer) {
			System.out.println("El boton home esta desplegado ");
			
		}
		
		// Verificar texto de un objeto en pantalla 
		String textslogan = driver.findElement(By.className("caption")).getText(); // extrae el texto 
		Boolean menssageDisplayer = textslogan.contains("Experience the difference"); // asignamos a una variable boolena para validar que si trajo el texto 
		if(menssageDisplayer) {                                                        // ademas la comparamos con un metodo constains() que es nativo de java  
			System.out.println("El nombre del header es el esperado ");
		}else {
			System.out.println("Error el nombre del header no cuenta con lo esperado ");
		}
		
		//Dropdowns para validar los cobos desplegables y seleccionar un elemento que conforme el combo 
		WebElement adminPageLink = driver.findElement(By.xpath("//*[contains(text(),'Admin Page')]")); //Buscamos el elemento por el texto que contiene para avanzar ya que solo tiene una propiedad 
		adminPageLink.click();
		Thread.sleep(2000);
		
		Select drpdwnLoanProvider = new Select (driver.findElement(By.id("loanProvider"))); // usamos el metodo para seleccionar 
		
		drpdwnLoanProvider.selectByVisibleText("Local"); // Se selecciona por nombre del elemento 
		
		
		

	}

}
