package Objects;

import org.openqa.selenium.By;

public class CreateAccountObjects {
	 protected By Email=By.id("accountNew_frm_accdata_txt_username");
	protected By Password=By.xpath("//*[@id=\"accountNew_frm_accdata\"]/div[2]/div[2]/input");
	protected By Repeatpass=By.xpath("//*[@id=\"accountNew_frm_accdata\"]/div[3]/div[2]/input");
   protected By Submit=By.xpath("//*[@id=\"accountNew_frm_accdata\"]/div[4]/input[2]");
}
