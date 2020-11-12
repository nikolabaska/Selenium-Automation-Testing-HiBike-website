package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.SigninObjects;

public class Signin extends SigninObjects {
	
	WebDriver driver= new ChromeDriver();
	
	//constructor
	
	public Signin (WebDriver driver)
	{
		this.driver=driver;
	}
public void Cookiebutton() {
	driver.findElement(Cookiebutton).click();
}
	public void Myaccount() {
		
		driver.findElement(Myaccount).click();
	}
	
	public void Email()
	{
		driver.findElement(Email).sendKeys("milevskinikola@gmail.com");
	}
	
	public void Password()
	{
		driver.findElement(Password).sendKeys("nikolabaska");
	}
	
	public void Submit()
	{
		driver.findElement(Submit).click();
	}
	
	public void InvalidEmail()
	{
		driver.findElement(InvalidEmail).sendKeys("nikola1@yahoo.com");
	}
	public void InvalidPassword() {
		driver.findElement(InvalidPassword).sendKeys("nikola124");
	}
	
}
