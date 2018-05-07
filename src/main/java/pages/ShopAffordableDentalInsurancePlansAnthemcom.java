

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopAffordableDentalInsurancePlansAnthemcom{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Shop Affordable Dental Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/dental-insurance/";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public ShopAffordableDentalInsurancePlansAnthemcom(WebDriver driver){
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
	
	// Created (5/6/2018 4:55:49 PM)
	   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335890593']")
		public WebElement A_Link_V__VisionInsurance;
		@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'health insurance plans')]]")
		public WebElement A_Link_V__healthinsuranceplans;
		@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
		public WebElement H1_Text_V__DentalInsurancePlans;
		@FindBy(how = How.XPATH, using = "//h4[text()[contains(.,'$124')]]")
		public WebElement H4_Text_V__$124;
		@FindBy(how = How.XPATH, using = "//h4[text()[contains(.,'$1,270')]]")
		public WebElement H4_Text_V__$1270;
		@FindBy(how = How.XPATH, using = "//h4[text()[contains(.,'$1,180')]]")
		public WebElement H4_Text_V__$1180;
	
	
}


