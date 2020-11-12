package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Enviroment.Enviroment;
import Methods.Footer;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SoccialMediaSteps extends Enviroment {
	WebDriver driver= browsersetup(); {
		
	}
	
	
	@Given("^User is on HiBike homePage$")
	public void user_is_on_HiBike_homePage() throws Throwable {
		String url=Url;
		Signin Cookie =new Signin(driver);
		Cookie.Cookiebutton();
	    
	}

	@When("^User navigate and click on FB button$")
	public void user_navigate_and_click_on_FB_button() throws Throwable {
	    Footer Facebook=new Footer(driver);
	    Facebook.Facebook();
	    Set<String> WindowId=  driver.getWindowHandles();
	    Iterator<String> it =WindowId.iterator();
	    String mainwindow= it.next();
	    String childfb = it.next();
	    driver.switchTo().window(childfb);
	    
	   
	   
	}

	@Then("^User should see HiBike facebook fan page$")
	public void user_should_see_HiBike_facebook_fan_page() throws Throwable {
		driver.getPageSource().contains("@hibike.de  · Bicycle Shop");
	}
	
	

	@When("^User navigate and click on Instagram button$")
	public void user_navigate_and_click_on_Instagram_button() throws Throwable {
		Footer insta= new Footer(driver);
		insta.Insta();
		

			   Set<String> WindowId=  driver.getWindowHandles();
			    Iterator<String> it =WindowId.iterator();
			    String mainwindow= it.next();
			    String childfb1 = it.next();
			    driver.switchTo().window(childfb1);
			    insta.InstagramHome();
	}

	@Then("^User should see HiBike Instagram fan page$")
	public void user_should_see_HiBike_Instagram_fan_page() throws Throwable {
		driver.getPageSource().contains("hibike.de\r\n" + "\r\n" + "");

	}

}
