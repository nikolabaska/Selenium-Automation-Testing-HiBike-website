package Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.FooterObjects;

public class Footer extends FooterObjects{
	
	WebDriver driver= new ChromeDriver();
	
	//constructor
	
	public Footer(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Facebook() {
		driver.findElement(Facebook).click();
	}
  public void childfb() {
	WebElement childfb = driver.findElement(By.xpath("//*[@id=\\\"footer_wht\\\"]/div[2]/div[2]/div[2]/div[2]/div/span[1]/a/img"));
   childfb.click();
  }
   public void Insta() {
	   WebElement childfb = driver.findElement(Insta);
	      childfb.click();
   }
   public void InstagramHome() {
	   driver.findElement(InstagramHome).click();
   }
public void Newsletter() {
	driver.findElement(Newsletter).sendKeys("Nikola@yahoo.com");
	
}
public void Submit() {
	driver.findElement(Submit).click();
}
	
	public void Newsletter1 () {
		driver.findElement(Newsletter1).sendKeys("Nikola1#");
		
	}
public void RetailStore() {
	driver.findElement(RetailStore).click();
}

public void JobRad() {
	driver.findElement(JobRad).click();
}
	
}




  
   


