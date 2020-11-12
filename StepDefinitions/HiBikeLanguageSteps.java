package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.HiBikeLanguage;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HiBikeLanguageSteps extends Enviroment{
	WebDriver driver= browsersetup();{
	}
	
	
	@Given("^User naviagte to Hibike page$")
	public void user_naviagte_to_Hibike_page() throws Throwable {
	    String url=Url;
	    Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
	    
	}

	@When("^User select German flag from HIBIKE INTERNATIONAL$")
	public void user_select_German_flag_from_HIBIKE_INTERNATIONAL() throws Throwable {
	   HiBikeLanguage German=new HiBikeLanguage(driver);
	   German.German();
	}

	@Then("^HiBike website should refresh and shoul be on Germa language$")
	public void hibike_website_should_refresh_and_shoul_be_on_Germa_language() throws Throwable {
		Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
	    driver.getPageSource().contains("HIBIKE Ladengeschäft");
	}
	
	//Spansih language
	@When("^User select Spanish flag from HIBIKE INTERNATIONAL$")
	public void user_select_Spanish_flag_from_HIBIKE_INTERNATIONAL() throws Throwable {
		HiBikeLanguage Spanish=new  HiBikeLanguage(driver);
		Spanish.Spanish();
		
	}

	@Then("^HiBike website should refresh and shoul be on Spanish language$")
	public void hibike_website_should_refresh_and_shoul_be_on_Spanish_language() throws Throwable {
		Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
	    
	}



}
