

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindIndividualFamilyHealthInsurancePlansAnthemcom{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Find Individual & Family Health Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public FindIndividualFamilyHealthInsurancePlansAnthemcom(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//a[@class='ant-menu-toggle']")
	public WebElement A_Link_V__Menu;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337955628']")
	public WebElement A_Link_V__GettingBetterCare;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337081345']")
	public WebElement A_Link_V__WhattoKnow;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337496407']")
	public WebElement A_Link_V__PreventiveHealth;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439343340863']")
	public WebElement A_Link_V__FindaDoctor;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439343291601']")
	public WebElement A_Link_V__SearchMedications;
	@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335451457']")
	public WebElement A_Link_V__DentalInsurance;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439407310924']")
	public WebElement A_Link_V__MedicareCoverageandEnrollment;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439333286239']")
	public WebElement A_Link_V__Turning65;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439333279884']")
	public WebElement A_Link_V__MedicareAdvantagePlansPartC;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439333280148']")
	public WebElement A_Link_V__MedicarePartDPlans;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439333280418']")
	public WebElement A_Link_V__MedicareSupplementPlansMedigap;
	@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335901455']")
	public WebElement A_Link_V__HealthInsurance;
	@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439335890593']")
	public WebElement A_Link_V__VisionInsurance;
	@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
	public WebElement H1_Text_V__IndividualFamilyPlans;
	@FindBy(how = How.XPATH, using = "//h4[text()[contains(.,'Health Resources')]]")
	public WebElement H4_Text_V__HealthResources;
	@FindBy(how = How.XPATH, using = "//p[text()[contains(.,'family with Anthem.')]]")
	public WebElement P_Text_V__Youllfindhealthdentalandvisioninsuranceop;
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