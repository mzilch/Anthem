

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewandSelectVisionPlans{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "View and Select Vision Plans";
	public String PAGE_URL = "https://shop.anthem.com/sales/eox/abcbs/ga/en/shop/plans/vision/snq?execution=e1s13";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public ViewandSelectVisionPlans(WebDriver driver){
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
	

	   // ADDED THIS LOCATOR: 5/6/2018 5:03:25 PM
		@FindBy(how = How.XPATH, using = "//span[@class='orangeText']")
		public WebElement SPAN_Text_V__0VisionPlan;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:37 PM
		@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
		public WebElement INPUT_input_V__submit;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//a[@class='fsrDeclineButton']")
		public WebElement A_Link_V__Nothanks;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//a[@id='hypertext/shop/dentalplans/addtofav_1']")
		public WebElement A_Link_V__AddtoFavorites;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//a[@id='button/shop/comparemedicalplans/showmytwofavouritesplans']")
		public WebElement A_Link_V__Showmy1favoriteplans;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//h2[@class='lineHt29px botMargin5 title']")
		public WebElement H2_Text_V__ViewandSelectVisionPlans;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//*[text()='Blue View Vision Value']")
		public WebElement H3_Text_V__BlueViewVisionValue;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//*[text()='Blue View Vision Plus']")
		public WebElement H3_Text_V__BlueViewVisionPlus;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//*[text()='Blue View Vision Enhanced']")
		public WebElement H3_Text_V__BlueViewVisionEnhanced;
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:50 PM
		@FindBy(how = How.XPATH, using = "//span[@class='txt_data']")
		public WebElement SPAN_Text_V__MarkApplicantSpouse;
	   // This WebElement Name DOES NOT EXIST / BUT another WebElement Name references the SAME Xpath
	   // ADDED THIS LOCATOR: 5/6/2018 5:03:55 PM
		@FindBy(how = How.XPATH, using = "//span[@class='orangeText']")
		public WebElement SPAN_Text_V__3VisionPlan;


}


