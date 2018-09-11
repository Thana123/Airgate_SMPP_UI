package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LinkConnection2SP {
 	public static void linkconnection(WebDriver driver){	 		
		driver.findElement(By.xpath("//*[@id=\"appnavlist\"]/li[1]/a[2]")).click(); 				
 		String SPname = "//a[contains(text(),'"+ "Modica" +"')]"; 		
 		driver.findElement(By.xpath(SPname)).getAttribute("href");
 		driver.get(driver.findElement(By.xpath(SPname)).getAttribute("href"));
 		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/fieldset[8]/table/tbody/tr[1]/td/a")).click();
 		driver.findElement(By.xpath(SPname)).getAttribute("href");
 		}
}

