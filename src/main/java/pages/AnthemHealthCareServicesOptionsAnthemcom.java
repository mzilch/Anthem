

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AnthemHealthCareServicesOptionsAnthemcom{

   //Properties -------------------------------------------------------------------------------------------------------------------------------------------
	public WebDriver driver;
	public String PAGE_Title = "Anthem Health Care Services & Options | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/what-to-know/";

   //Constructor ------------------------------------------------------------------------------------------------------------------------------------------
	public AnthemHealthCareServicesOptionsAnthemcom(WebDriver driver){
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
	
	// Created (5/6/2018 4:54:30 PM)
	   //Locators ----------------------------------------------------------------------------------------------------------------------------------------------
		@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
		public WebElement H1_Text_V__WhattoKnowAnthemsHealthCareServices;
	
}


