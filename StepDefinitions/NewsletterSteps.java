package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.Footer;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsletterSteps extends Enviroment {
	WebDriver driver = browsersetup();{}
	
	
	@Given("^User nagivate open HiBike home page and navigate to Newsletter field$")
	public void user_nagivate_open_HiBike_home_page_and_navigate_to_Newsletter_field() throws Throwable {
	   String url=Url;
	   Signin Cookie=new Signin(driver);
	   Cookie.Cookiebutton();
	}

	@When("^User type valid email address and click on subscribe button$")
	public void user_type_valid_email_address_and_click_on_subscribe_button() throws Throwable {
	    Footer Newsletter=new Footer(driver);
	    Newsletter.Newsletter();
	    Newsletter.Submit();
	}

	@Then("^User should be navigate to new confirmatation text page$")
	public void user_should_be_navigate_to_new_confirmatation_text_page() throws Throwable {
		String expectedText = "Welcome to the HIBIKE newsletter";
		String pageText = driver.findElement(By.xpath("//*[@id=\"container_mainarea\"]/main/div/div[2]/h2")).getText();
		assertEquals( expectedText, pageText); 
		System.out.println(pageText);
		driver.close();
	}
	
	//Invalid email address
	@When("^User type invalid simbols an characters and clicks on subscribe button$")
	public void user_type_invalid_simbols_an_characters_and_clicks_on_subscribe_button() throws Throwable {
	   Footer Newsletter=new Footer(driver);
	   Newsletter.Newsletter1();
	}
	  
	   @Then("^User should be navigate to new text page with eror info$")
	   public void user_should_be_navigate_to_new_text_page_with_eror_info() throws Throwable {
	       String Expecttext= "The supplied mail address is invalid\r\n" ;
	       String Actualtext= driver.findElement(By.xpath("//*[@id=\"container_mainarea\"]/main/div/div[2]/div[2]/div/center/b")).getText();
	        assertEquals(Expecttext, Actualtext);
	   }
	}


