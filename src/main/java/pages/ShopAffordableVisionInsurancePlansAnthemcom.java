

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopAffordableVisionInsurancePlansAnthemcom{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Shop Affordable Vision Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/vision-insurance/";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public ShopAffordableVisionInsurancePlansAnthemcom(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//a[@class='ant-menu-toggle']")
	public WebElement A_Link_V__Menu;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337081345']")
	public WebElement A_Link_V__WhattoKnow;
	@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
	public WebElement H1_Text_V__VisionInsurancePlans;
	@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Eye Exams')]]")
	public WebElement STRONG_Text_V__EyeExams;
	@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'New Frames')]]")
	public WebElement STRONG_Text_V__NewFrames;
	@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Standard Lenses')]]")
	public WebElement STRONG_Text_V__StandardLenses;
	@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Contact Lenses')]]")
	public WebElement STRONG_Text_V__ContactLenses;
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
}