package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.BoundaryValue;
import Methods.Shoppingcart;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BoundaryValueSteps extends Enviroment{
	
	WebDriver driver=browsersetup();{
		
	}
	@Given("^User navigate to the HiBike home page$")
	public void user_navigate_to_the_HiBike_home_page() throws Throwable {
	    String url=Url;
	    Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
	}
	

@When("^User navigate to the Bicycles main menu and select from menu$")
public void user_navigate_to_the_Bicycles_main_menu_and_select_from_menu() throws Throwable {
	Shoppingcart Mainmenu= new Shoppingcart(driver);
	   Mainmenu.Bicycles();
}

@When("^User select product from  submenu$")
public void user_select_product_from_submenu() throws Throwable {
	Shoppingcart Submenu = new Shoppingcart(driver);
	Submenu.MTBFullSuspension();
	Submenu.TourFull();
	Submenu.SantaCruz();
	
    
}

@When("^User configure options for his product$")
public void user_configure_options_for_his_product() throws Throwable {
	Shoppingcart Product=new Shoppingcart(driver);
	Product.Dropdown();
	
}

@Then("^User into the quantity field types negative number$")
public void user_into_the_quantity_field_types_negative_number() throws Throwable {
	BoundaryValue Quantity=new BoundaryValue(driver);
	Quantity.Quantity();
}

@Then("^User procced by clicking on add to cart button$")
public void user_procced_by_clicking_on_add_to_cart_button() throws Throwable {
	Shoppingcart Product=new Shoppingcart(driver);
	Product.Addtocart();
	Product.Gotocart();
	driver.close();
}
//Try to add fourdigital number into quantity field
	@Then("^User into the quantity field types fourdigital number$")
	public void user_into_the_quantity_field_types_fourdigital_number() throws Throwable {
	    BoundaryValue Quantity1=new BoundaryValue (driver);
	    Quantity1.Quantity1();
	}   
	//Try to add different simbols into quantity field
	    @Then("^User into the quantity field types simbols$")
	    public void user_into_the_quantity_field_types_simbols() throws Throwable {
	       
	    	
	    }
		
}


