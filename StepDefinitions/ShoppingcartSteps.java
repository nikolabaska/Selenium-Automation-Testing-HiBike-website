package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.Shoppingcart;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingcartSteps extends Enviroment {
	
	WebDriver driver = browsersetup();{
		
	}

	@Given("^User navigate to HiBike home page$")
	public void user_navigate_to_HiBike_home_page() throws Throwable {
		Signin Cookie = new Signin(driver);
	    Cookie.Cookiebutton();
	    String url = Url;
	    
	}
	@When("^User navigate to main menu$")
	public void user_navigate_to_main_menu() throws Throwable {
	   Shoppingcart Mainmenu= new Shoppingcart(driver);
	   Mainmenu.Bicycles();
	   
	}

	@When("^User select product from Bicycle submenu$")
	public void user_select_product_from_Bicycle_submenu() throws Throwable {
		Shoppingcart Submenu = new Shoppingcart(driver);
		Submenu.MTBFullSuspension();
	}

	@When("^User select options for his product and clicks on add to cart button$")
	public void user_select_options_for_his_product_and_clicks_on_add_to_cart_button() throws Throwable {
	    Shoppingcart Product= new Shoppingcart(driver);
	    Product.TourFull();
	    Product.SantaCruz();
	    Product.Dropdown();
	    Product.Addtocart();
	}

	@When("^User procced by clicking on Go to cart button$")
	public void user_procced_by_clicking_on_Go_to_cart_button() throws Throwable {
	   Shoppingcart Gotocart=new Shoppingcart(driver);
	   Gotocart.Gotocart();
	}

	@Then("^User product is succesful added to the cart$")
	public void user_product_is_succesful_added_to_the_cart() throws Throwable {
	    driver.getPageSource().contains("Your shopping cart");
	    driver.close();
	}
	
	//Login and try to add product into the cart 
	@When("^User signin with valid credentials$")
	public void user_signin_with_valid_credentials() throws Throwable {
	    Signin signin =new Signin(driver);
	    signin.Myaccount();
	    signin.Email();
	    signin.Password();
	    signin.Submit();
	}

	@When("^User select his product from Bicycle submenu$")
	public void user_select_his_product_from_Bicycle_submenu() throws Throwable {
		Shoppingcart product=new Shoppingcart(driver);
		product.Bicycles();
		product.MTBFullSuspension();
	    
	}

	@When("^User select product options  and clicks on add to cart button$")
	public void user_select_product_options_and_clicks_on_add_to_cart_button() throws Throwable {
		 Shoppingcart Product= new Shoppingcart(driver);
		    Product.TourFull();
		    Product.SantaCruz();
		    Product.Dropdown();
		    Product.Addtocart();
	}

	@When("^User procced by clicking on Go to cart$")
	public void user_procced_by_clicking_on_Go_to_cart() throws Throwable {
	    Shoppingcart procced=new Shoppingcart(driver);
	    procced.Gotocart();
	    
	}


	
}
