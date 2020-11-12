package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.BoundaryValueObjects;

public class BoundaryValue extends BoundaryValueObjects {
	
	WebDriver driver=new ChromeDriver();
	
	//constructor
	
	public BoundaryValue(WebDriver driver){
		this.driver=driver;
	}
	
	public void Quantity() {
		driver.findElement(Quantity).sendKeys("-1");
	
}
	public void Quantity1() {
		driver.findElement(Quantity1).sendKeys("1111");
	}
	
	public void Quantity$() {
		driver.findElement(Quantity$).sendKeys("$$&");
	}

}
