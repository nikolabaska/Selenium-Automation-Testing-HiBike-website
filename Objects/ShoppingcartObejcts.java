package Objects;

import org.openqa.selenium.By;

public class ShoppingcartObejcts {
	
	protected By Bicycles = By.xpath("//a[text()='Bicycles']");
	By MTBFullSuspension=By.xpath("//*[@id=\"mainmenu_h\"]/li[1]/ul/div[1]/ul/li[1]/a");
	protected By TourFull=By.xpath("//*[@id=\"container_mainarea\"]/main/div[4]/div[2]/a[2]/div/div[2]");
    protected By SantaCruz=By.xpath("//*[@id=\"container_mainarea\"]/main/div[3]/div[2]/a/div/div[3]/img");
    protected By Dropdown =By.id("select_var");
    protected By Addtocart=By.id("bb_buyButton");
    protected By Gotocart=By.xpath("//*[@id=\"frm_aftercartput\"]/div");
}
