package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.CreateOrderObjects;

public class CreateOrder extends CreateOrderObjects {
	
	WebDriver driver=new ChromeDriver();
	
	public CreateOrder(WebDriver driver){
		this.driver=driver;
	}

	public void Checkout() {
		driver.findElement(Checkout).click();
	}
	
	public void Save() {
		driver.findElement(Save).click();
	}
}
