package Objects;

import org.openqa.selenium.By;

public class SigninObjects {
	
	protected By Cookiebutton=By.id("cookie_consent_button");
	protected By Myaccount=By.xpath("//*[@id=\"frm_login\"]/a/div/img");
	protected By Email=By.id("login_frm_login_txt_identifier");
	protected By Password=By.id("login_frm_login_txt_secret");
	protected By Submit =By.xpath("//*[@id=\"login_frm_login\"]/div/div[3]/input[3]");
	protected By InvalidEmail=By.id("login_frm_login_txt_identifier");    
	protected By InvalidPassword=By.id("login_frm_login_txt_secret");
}
