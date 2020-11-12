package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.CreateAccount;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateaccountSteps extends Enviroment{
	WebDriver driver = browsersetup();{
	}
	
	@Given("^User navigate to HIbike home page$")
	public void user_navigate_to_HIbike_home_page() throws Throwable {
	    String url=Url;
	    Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
		
	}

	@Given("^User clicks on MyAccount$")
	public void user_clicks_on_MyAccount() throws Throwable {
	   Signin Myaccount=new Signin(driver);
	   Myaccount.Myaccount();
	}

	@Given("^User navigate to new account form and type valid email and password$")
	public void user_navigate_to_new_account_form_and_type_valid_email_and_password() throws Throwable {
	    CreateAccount Newacc=new CreateAccount(driver);
	    Newacc.Email();
	    Newacc.Password();
	    
	    
	}

	@Then("^User Repeat his password and procced by clicking on Create new account button$")
	public void user_Repeat_his_password_and_procced_by_clicking_on_Create_new_account_button() throws Throwable {
		 CreateAccount Newacc=new CreateAccount(driver);
		 Newacc.Repeatpass();
		 Newacc.Submit();
		 driver.close();
	}

}
