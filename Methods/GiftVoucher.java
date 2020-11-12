package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Objects.GiftvouherObject;

public class GiftVoucher extends GiftvouherObject{
	
	WebDriver driver=new ChromeDriver();
	
	//constructor
	public GiftVoucher(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Gift() {
		driver.findElement(Gift).click();
	}
  public void Dropdown(){
	  Select dr=new Select(driver.findElement(Dropdown));
	  dr.selectByIndex(2);

  }
 public void AddtoCart() {
	 driver.findElement(AddtoCart).click();
	 
 }
 public void GotoCart() {
	 driver.findElement(GotoCart).click();
 }
}
