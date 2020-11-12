package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Enviroment.Enviroment;
import Methods.GiftVoucher;
import Methods.Signin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class GiftCertificateSteps extends Enviroment {
	WebDriver driver= browsersetup();{}
	
	@Given("^User is o HiBike home page$")
	public void user_is_o_HiBike_home_page() throws Throwable {
	    String url=Url;
	    Signin Cookie=new Signin(driver);
	    Cookie.Cookiebutton();
	}

	@Given("^User navigate and clicks on Gift Certificate$")
	public void user_navigate_and_clicks_on_Gift_Certificate() throws Throwable {
	    GiftVoucher gift=new GiftVoucher(driver);
	    gift.Gift();
	}

	@Given("^User select from gift voucher dropdown menu$")
	public void user_select_from_gift_voucher_dropdown_menu() throws Throwable {
		 GiftVoucher dropdown=new GiftVoucher(driver);
		 dropdown.Dropdown();
	}

	@Given("^User add voucher to the cart and procced to checkout$")
	public void user_add_voucher_to_the_cart_and_procced_to_checkout() throws Throwable {
		 GiftVoucher cart=new GiftVoucher(driver);
		 cart.AddtoCart();
		 cart.GotoCart();
	}

	@Then("^User  gift voucher should be in the cart$")
	public void user_gift_voucher_should_be_in_the_cart() throws Throwable {
	   String Actualtext="Your shopping cart";
	   String Expectedtx= driver.findElement(By.xpath("//*[@id=\"frm_cart\"]/div[1]/h3")).getText();
     Assert.assertEquals(Actualtext, Expectedtx);
     driver.close();
	}
// Try to add giftvoucehr as a loged in user 
	@Given("^User login with his valid credentials$")
	public void user_login_with_his_valid_credentials() throws Throwable {
	    Signin Login=new Signin(driver);
	    Login.Cookiebutton();
	    Login.Myaccount();
	    Login.Email();
	    Login.Password();
	    Login.Submit();
	}

}
