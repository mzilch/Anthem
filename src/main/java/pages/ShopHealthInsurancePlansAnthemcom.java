

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopHealthInsurancePlansAnthemcom{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Shop Health Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/health-insurance/";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public ShopHealthInsurancePlansAnthemcom(WebDriver driver){
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


// Created (5/6/2018 4:52:37 PM)
   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//div[@class='page-breadcrumb']")
	public WebElement DIV_Text_V__IndividualFamilyPlans;
	@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
	public WebElement H1_Text_V__HealthInsurancePlans;
	@FindBy(how = How.XPATH, using = "//span[@class='h6']")
	public WebElement SPAN_Text_V__IndividualFamilyPlans;

}
