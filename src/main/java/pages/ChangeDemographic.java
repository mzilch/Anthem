

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangeDemographic{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Change Demographic";
	public String PAGE_URL = "https://shop.anthem.com/sales/eox/abcbs/na/en/shop/demographic/snq?execution=e1s9";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public ChangeDemographic(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Page Methods --------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean verifyPageTitle(){
		return driver.getTitle().contains(PAGE_Title);
	}
	public boolean verifyPageURL(){
		return driver.getCurrentUrl().contains(PAGE_URL);
	}
	public String getPageTitle(){
		return driver.getTitle();
	}
	public String getPageUrl(){
		return driver.getCurrentUrl();
	}


// Created (5/6/2018 4:50:58 PM)
   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//a[@class='fsrDeclineButton']")
	public WebElement A_Link_V__Nothanks;
	@FindBy(how = How.XPATH, using = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only navBtn ui-state-hover ui-state-active']")
	public WebElement Button_V__Continue;
	@FindBy(how = How.XPATH, using = "//span[@id='ui-id-1']")
	public WebElement SPAN_Text_V__ChangeDemographic;

}
