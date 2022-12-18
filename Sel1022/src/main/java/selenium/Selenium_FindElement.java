package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElement {
	
	public static void main(String[] args) {
	//********---Clase para prueba de google *********
	String exePath = "./driver/chromedriver.exe"; // the folder esta dentro de la direccion que agregue 
	System.setProperty("webdriver.chrome.driver", exePath); // le indica a la propiedad de de donde lo va a sacar
	WebDriver driver = new ChromeDriver();
	driver.get("https://mercadolibre.com/"); 
	
	List<WebElement> countryList = driver.findElements(By.className("ml-site-link"));
	System.out.println("El numero de paises es : "+ countryList.size()); //Imprime el numero de paises 
	
	String primerPais = countryList.get(0).getText();
	System.out.println(primerPais); //Imprime el Pais
	
	String QuintoPais = countryList.get(4).getText();
	System.out.println(QuintoPais); //Imprime el Pais
	
	
	for (int i =0; i < countryList.size();i++) {
		
		System.out.println(" Los paises son : "+ countryList.get(i).getText()); //Imprime la lista de paises 
		
		if(countryList.get(i).getText().contains("Dominicana")) {
			
			countryList.get(i).click();
			
		}
	}
	
	}
	
	

}
