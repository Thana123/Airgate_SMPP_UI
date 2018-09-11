package Browser;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import Properties.PropertiesFile;

public class SelChromeDriver {
	static WebDriver driver;
	@Given ("launch \"(.*)\" browser$")
	public static WebDriver getdriver(String BrowserPath){
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