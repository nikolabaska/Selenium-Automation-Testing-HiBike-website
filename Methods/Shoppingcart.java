package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Objects.ShoppingcartObejcts;

public class Shoppingcart extends ShoppingcartObejcts{
	
	WebDriver driver = new ChromeDriver();
	//constructor
	public Shoppingcart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Bicycles(){
		
		Actions action = new Actions(driver);
		WebElement Bicycles =driver.findElement(By.xpath("//a[text()='Bicycles']"));
		action.moveToElement(Bicycles).build().perform();
		
	}
	
	public void MTBFullSuspension() {
		
	Actions action = new Actions(driver);
	WebElement MTBFullSuspension = driver.findElement(By.xpath("//*[@id=\"mainmenu_h\"]/li[1]/ul/div[1]/ul/li[1]/a"));
	action.moveToElement(MTBFullSuspension).click().build().perform();
	}
	
	public void TourFull() {
		driver.findElement(TourFull).click();
	}
	
	public void SantaCruz() {
		driver.findElement(SantaCruz).click();
	}
	
	public void Dropdown() {
		
		//driver.findElement(Dropdown).click();
		Select dropdown =new Select(driver.findElement(By.id("select_var")));
		dropdown.selectByIndex(2);
	}
	
	public void Addtocart() {
		driver.findElement(Addtocart).click();
	}
	
	public void Gotocart() {
		driver.findElement(Gotocart).click();
	}

}
