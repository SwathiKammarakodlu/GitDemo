package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJava {

	private static Logger Log = LogManager.getLogger(SampleJava.class.getClass());
	// you should pass the path of the class to this logger
//	Use log. Error() to log when elements are not displayed in the page or if any validations fail
//  Use Log. Debug()
//  When each Selenium action is performed like click, SendKeys, getText()
//  Use log.info()
//  When operation is successfully completed ex: After loading page, or after any successful validations
//  It’s just counterpart to log. Error()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Log.info("Setting the chrome driver");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Log.debug("Opening the google site");
		driver.get("www.google.com");
		Log.info("Google site is opened");
		driver.manage().window().maximize();
		Log.info("The window size is maximized");
		
		Log.error("error message Alpha");
		Log.fatal("fatal message Alpha");
		
	}

}
