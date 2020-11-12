package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.Footer;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HiBikeInfoSteps extends Enviroment {
	
	WebDriver driver= browsersetup();{}
	
	
	@Given("^User is on HiBike page$")
	public void user_is_on_HiBike_page() throws Throwable {
	    String url=Url;
	    Signin Cookie=new  Signin(driver);
	    Cookie.Cookiebutton();
	    
	}

	@When("^User click on HiBike Retail Store$")
	public void user_click_on_HiBike_Retail_Store() throws Throwable {
	   Footer Retail=new Footer(driver);
	   Retail.RetailStore();
	}

	@Then("^User should be navigate to retail store page$")
	public void user_should_be_navigate_to_retail_store_page() throws Throwable {
	   String Actualtxt="Retail Store";
	   String Expecttxt= driver.findElement(By.xpath("//*[@id=\"container_mainarea\"]/main/div[1]/h1")).getText();
      Assert.assertEquals(Actualtxt, Expecttxt);
      driver.close();
	}

@Given("^User clicks on JobRad Leasing title$")
public void user_clicks_on_JobRad_Leasing_title() throws Throwable {
    Footer JobRad=new Footer(driver);
    JobRad.JobRad();
}

@Then("^User should be navigate to Brands overview page$")
public void user_should_be_navigate_to_Brands_overview_page() throws Throwable {
    String ExpectText= "Brands Overview";
    String ActualText = driver.findElement(By.xpath("//*[@id=\"container_mainarea\"]/main/div[1]/h1")).getText();
    Assert.assertEquals(ExpectText, ActualText);
    driver.close();
}
}
