package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SigninSteps extends Enviroment{
	
	WebDriver driver = browsersetup();  {
	
	}
	
	//Login with valid credentials
	
	@Given("^User is on HiBike home page$")
	public void user_is_on_HiBike_home_page() throws Throwable {
	    Signin Cookie = new Signin(driver);
	    Cookie.Cookiebutton();
	    String url = Url;
	    Assert.assertTrue(driver.getCurrentUrl().contains(url));
	    
	}

	@When("^User navigate to Sign in$")
	public void user_navigate_to_Sign_in() throws Throwable {
		Signin Account= new Signin(driver);
		Account.Myaccount();
	    
	}

	@When("^User type his valid email and valid password$")
	public void user_type_his_valid_email_and_valid_password() throws Throwable {
	    Signin emailandpass = new Signin(driver);
	    emailandpass.Email();
	    emailandpass.Password();
	    
		
	}

	@When("^User procced by clicking on Login  button$")
	public void user_procced_by_clicking_on_Login_button() throws Throwable {
	    Signin Submit=new Signin(driver);
	    Submit.Submit();
		
	}

	@Then("^User is succesfull loged in$")
	public void user_is_succesfull_loged_in() throws Throwable {
		
		driver.getPageSource().contains("Welcome, milevskinikola@gmail.com!");
		
		driver.close();
		
	}
	
	//Login with invalid email and valid password
	@When("^user navigate to Sign in form$")
	public void user_navigate_to_Sign_in_form() throws Throwable {
		Signin Account= new Signin(driver);
		Account.Myaccount();
	}

	@When("^User type invalid email and valid password$")
	public void user_type_invalid_email_and_valid_password() throws Throwable {
	    Signin InvalidEmail=new Signin(driver);
	    InvalidEmail.InvalidEmail();
	    Signin Password=new Signin(driver);
	    Password.Password();
	}

	@When("^usser procced by clicking on Login button$")
	public void usser_procced_by_clicking_on_Login_button() throws Throwable {
		Signin Submit=new Signin(driver);
	    Submit.Submit();
	    
	}

	@Then("^User should not be able to log in$")
	public void user_should_not_be_able_to_log_in() throws Throwable {
	    driver.getPageSource().contains("The sign-in failed");
	    driver.close();
	}
	
	//Login with valid email and invalid password

 @When("^User type valid email and invalid password$")
public void user_type_valid_email_and_invalid_password() throws Throwable {
	 Signin emailandpass = new Signin(driver);
	 emailandpass.Email();
	 Signin InvalidPass = new Signin(driver);
	 InvalidPass.InvalidPassword();
    
}
 
     

}
