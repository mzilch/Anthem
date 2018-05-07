

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Basics{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Basics";
	public String PAGE_URL = "https://shop.anthem.com/sales/eox/shop/demographics/home/snq?execution=e1s1";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public Basics(WebDriver driver){
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
	
	// Created (5/6/2018 5:58:27 PM)
	   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
		@FindBy(how = How.XPATH, using = "//a[@id='button/shop/getaquote/adddependent']")
		public WebElement A_Link_V__AddDependent;
		@FindBy(how = How.XPATH, using = "//a[@id='button/shop/getaquote/addspouse']")
		public WebElement A_Link_V__AddSpouseDomesticPartner;
		@FindBy(how = How.XPATH, using = "//a[@class='addSpouse ltPad17 spousebut zipCodeVerificationField']")
		public WebElement A_Link_V__AddSpouseDomesticPartner_1;
		@FindBy(how = How.XPATH, using = "//h3[@id='typeofCoverageNeed']")
		public WebElement H3_Text_V__ApplicantInformation;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.zip5']")
		public WebElement INPUT_input_V__text_demographicszip5_demographicszip5;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.applicants0.firstName']")
		public WebElement INPUT_input_V__text_demographicsapplicants0firstName_demographics;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.applicants0.dob']")
		public WebElement INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.applicants0.tobaccoUser2']")
		public WebElement INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.applicants1.firstName']")
		public WebElement INPUT_input_V__text_demographicsapplicants1firstName_demographics;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.applicants1.dob']")
		public WebElement INPUT_input_V__text_demographicsapplicants1dob_demographicsapplic;
		@FindBy(how = How.XPATH, using = "//input[@id='button/shop/getaquote/next']")
		public WebElement INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext;
		@FindBy(how = How.XPATH, using = "//*[@id='spouseDIV']/div[4]/div[2]/input[2]")
		public WebElement INPUT_input_V__radio_demographicsapplicants1tobaccoUser_NoDep1Tob;
		@FindBy(how = How.XPATH, using = "//input[@id='onlyVision']")
		public WebElement INPUT_input_V__radio_demographicstypeOfCoverage_onlyVision;
		@FindBy(how = How.XPATH, using = "//input[@id='demographics.subsidy.anualHouseHoldIncome']")
		public WebElement INPUT_input_V__text_demographicssubsidyanualHouseHoldIncome_demog;
		@FindBy(how = How.XPATH, using = "//input[@id='ApplicantOnly']")
		public WebElement INPUT_input_V__radio_demographicswhoNeedCover_ApplicantOnly;
		@FindBy(how = How.XPATH, using = "//label[@id='onlyVision']")
		public WebElement LABEL_Text_V__ShowmeonlyVisionPlans;
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Show me only Dental and Vision Plans (Optional)')]")
		public WebElement LABEL_Text_V__ShowmeonlyDentalandVisionPlansOptional;
		@FindBy(how = How.XPATH, using = "//label[@id='infoMsgLabel']")
		public WebElement LABEL_Text_V__Medicalproductsandratesarenotavailableforo;
		@FindBy(how = How.XPATH, using = "//label[text()[contains(.,'Applicant and Others')]]")
		public WebElement LABEL_Text_V__ApplicantandOthers;
		@FindBy(how = How.XPATH, using = "//*[@id='spouseDIV']/div[4]/div[2]/label[2]")
		public WebElement LABEL_Text_V__No;
		@FindBy(how = How.XPATH, using = "//option[@value='DEKALB']")
		public WebElement OPTION_Text_NV__DEKALB;
		@FindBy(how = How.XPATH, using = "//select[@id='demographics.county']")
		public WebElement INPUT_select_V__selectone_demographicscounty_demographicscounty;
		@FindBy(how = How.XPATH, using = "//span[@id='coverageDate']")
		public WebElement SPAN_Text_V__06012018;
	
	
}


