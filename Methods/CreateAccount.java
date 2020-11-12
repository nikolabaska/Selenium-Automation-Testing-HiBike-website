package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.CreateAccountObjects;

public class CreateAccount extends CreateAccountObjects {
	
	WebDriver driver= new ChromeDriver();
	
	//constructor
	
	public CreateAccount (WebDriver driver) {
		this.driver=driver;
	}
	
	public void  Email() {
		driver.findElement( Email).sendKeys("milevskinikola@gmail.com");
	}
	
	public void Password() {
		driver.findElement(Password).sendKeys("nikolabaska");
	}
  
	public void Repeatpass() {
		driver.findElement(Repeatpass).sendKeys("nikolabaska");
	}
	
	public void Submit() {
		driver.findElement(Submit).click();
	}
}
