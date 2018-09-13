package Browser;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.en.Given;
import stepDefinition.AGStepDefinition;
import Properties.PropertiesFile;

public class SelChromeDriver {
	static WebDriver driver;
	private static Logger Log = Logger.getLogger(AGStepDefinition.class);
	
	public enum Browsers		{ Firefox, Chrome, InternetExplorer, Android, Ipad, Iphone, Opera, Safari };
	public void SeleniumWebdriver( Browsers browser, String appURL ) throws Exception {
		switch ( browser ) {		//check our browser
			case Firefox:		{ driver = new FirefoxDriver(); 		break; }
			case Chrome:		{ driver = new ChromeDriver();  		break; }
			case InternetExplorer:	{ driver = new InternetExplorerDriver();  	break; }
			//case Android:		{ driver = new AndroidDriver(); 		break; }
			//case Iphone:		{ driver = new IPhoneDriver();  		break; }
			case Safari:		{ driver = new SafariDriver();  		break; }
			//if our browser is not listed, throw an error
			default:		{ throw new Exception();	}
		}
		//open a new driver instance to our application URL
		driver.get( appURL );
	}

	//a method to allow retrieving our driver instance
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static WebDriver getdriver(String BrowserPath){
			PropertyConfigurator.configure("Resources/log4j.properties");
			PropertiesFile prop = new PropertiesFile();
			//String driverPath = prop.GeneralProperties("DriverPath");
			System.setProperty("webdriver.chrome.driver",BrowserPath);
			ChromeOptions maxWindow = new ChromeOptions();
			maxWindow.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(maxWindow);		
		    return driver;
	   }
	public static void quitdriver() {
			driver.close();
		
	   }
}