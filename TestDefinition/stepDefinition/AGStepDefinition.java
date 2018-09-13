package stepDefinition;

import java.io.IOException;
import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browser.SelChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import excel.ReadExcel;

public class AGStepDefinition {
		private static Logger Log = Logger.getLogger(AGStepDefinition.class);	
		static WebDriver driver;
		
		//@When ("Open\"(.*)\"$")
		@When ("Open \"(.*)\" and \"(.*)\" and \"(.*)\" login$")
	 	public void loginmavenir( String url, String username, String password ){	 		
			 driver = SelChromeDriver.getdriver("C:\\testdata\\SMSC Override\\Browser\\chromedriver.exe");
			 driver.get(url);
			 driver.findElement(By.name("j_username")).sendKeys(username);
			 driver.findElement(By.name("j_password")).sendKeys(password);
			 driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
			 driver.findElement(By.xpath("//*[@id=\"appnavlist\"]/li[3]/a[2]")).click();
		}
		 
		public static void linkconnection(){	 		
			driver.findElement(By.xpath("//*[@id=\"appnavlist\"]/li[1]/a[2]")).click(); 				
	 		String SPname = "//a[contains(text(),'"+ "Modica" +"')]"; 		
	 		driver.findElement(By.xpath(SPname)).getAttribute("href");
	 		driver.get(driver.findElement(By.xpath(SPname)).getAttribute("href"));
	 		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/fieldset[8]/table/tbody/tr[1]/td/a")).click();
	 		driver.findElement(By.xpath(SPname)).getAttribute("href");
	 		}

}
