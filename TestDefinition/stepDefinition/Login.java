package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Properties.PropertiesFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login {
	static WebDriver driver;
	//@When ("Open driver and \"(.*)\" and \"(.*)\" and \"(.*)\" login$")
	@When ("Open\"(.*)\" and \"(.*)\" and \"(.*)\" login$")
	//When Open "www.google.com" and "" and "" login
	 
 	public static void loginmavenir( String url, String username, String password ){	 		
		 driver.get(url);
		 driver.findElement(By.name("j_username")).sendKeys(username);
		 driver.findElement(By.name("j_password")).sendKeys(password);
		 driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"appnavlist\"]/li[3]/a[2]")).click();
	}
}
