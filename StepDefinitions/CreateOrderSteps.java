package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.CreateOrder;
import Methods.Shoppingcart;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateOrderSteps extends Enviroment {
	WebDriver driver= browsersetup();{}
	
	@Given("^User is on HiBike hpage$")
	public void user_is_on_HiBike_hpage() throws Throwable {
		Signin Cookie = new Signin(driver);
	    Cookie.Cookiebutton();
	    String url = Url;
	}

	@When("^User sign in with valid credentials$")
	public void user_sign_in_with_valid_credentials() throws Throwable {
		Signin Account= new Signin(driver);
		Account.Myaccount();
		Account.Email();
		Account.Password();
		Account.Submit();
	}

	@When("^User select his product from Bicycle menu and submenu$")
	public void user_select_his_product_from_Bicycle_menu_and_submenu() throws Throwable {
		 Shoppingcart Mainmenu= new Shoppingcart(driver);
		   Mainmenu.Bicycles();
		   Mainmenu.MTBFullSuspension();
		   Mainmenu.TourFull();
		   Mainmenu.SantaCruz();
		   Mainmenu.Dropdown();
		   Mainmenu.Addtocart();
	}

	@When("^User select product options  and clicks on add to cart$")
	public void user_select_product_options_and_clicks_on_add_to_cart() throws Throwable {
		Shoppingcart Gotocart=new Shoppingcart(driver);
		   Gotocart.Gotocart();
	}

	@When("^User procced by clicking on Go to cart btn$")
	public void user_procced_by_clicking_on_Go_to_cart_btn() throws Throwable {
		Shoppingcart Gotocart=new Shoppingcart(driver);
		   Gotocart.Gotocart();
	}

	@Then("^User product is succesful added to his cart$")
	public void user_product_is_succesful_added_to_his_cart() throws Throwable {
		 driver.getPageSource().contains("Your shopping cart");
		    driver.close();
	}

	@Then("^User click on checkout button and procced to Invoice address$")
	public void user_click_on_checkout_button_and_procced_to_Invoice_address() throws Throwable {
	    CreateOrder Checkout=new CreateOrder(driver);
	    Checkout.Checkout();
	}

	@Then("^User fill the invoice address fields and click on save button$")
	public void user_fill_the_invoice_address_fields_and_click_on_save_button() throws Throwable {
		 CreateOrder Savebutton=new CreateOrder(driver);
		 Savebutton.Save();
		 driver.close();
	}

}
