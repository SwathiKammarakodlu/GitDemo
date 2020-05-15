package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {
	private static Logger Log = LogManager.getLogger(Act.class.getClass());

	public static void main(String[] args) {
		Log.info("Setting up the properties of chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Log.debug("opening the Google site");
			driver.get("https://www.google.com");
			Log.info("Getting the title of the site");
			driver.getTitle();
			
			Log.info("Getting the current URL");
			driver.getCurrentUrl();
			
			Log.debug("Navigate to the TUI site");
			driver.get("https://www.tui.co.uk");
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("[aria-label ='Search']")).sendKeys("Lion");
			driver.close();//close the current window
			driver.quit();//closes all the windows parent+child opened by selenium test- 
			

	}
}
