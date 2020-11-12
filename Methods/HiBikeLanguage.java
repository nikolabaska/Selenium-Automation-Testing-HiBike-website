package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.HiBikeLanguageOobjects;

public class HiBikeLanguage extends HiBikeLanguageOobjects{
	
	WebDriver driver=new ChromeDriver();
	
	//constructor
	
	public HiBikeLanguage(WebDriver driver){
		this.driver=driver;
	}
public void German() {
	driver.findElement(German).click();
}
public void Spanish() {
	driver.findElement(Spanish).click();
}

}
