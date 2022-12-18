package CommonClasses;

import org.openqa.selenium.WebElement;

// Esta clase tiene todas las implemetaciones de selenium 
public class WrapClass {

	public static void click (WebElement webE) {
		
		webE.click();
		
	}
	
	public static void sendKeys (WebElement webE, String testToSend) {
	
		webE.sendKeys(testToSend);
		
	}
}
