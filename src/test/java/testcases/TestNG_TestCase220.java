package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.*;
import base.TestBaseSetup;
import base.SeleniumHelper;
import pages.FindIndividualFamilyHealthInsurancePlansAnthemcom;
import pages.ShopAffordableVisionInsurancePlansAnthemcom;
import pages.AnthemHealthCareServicesOptionsAnthemcom;
@SuppressWarnings("unused")

public class TestNG_TestCase220 extends TestBaseSetup{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;
   public JavascriptExecutor jse2;
   public SeleniumHelper helper;
   public FindIndividualFamilyHealthInsurancePlansAnthemcom FirstPage;
   public ShopAffordableVisionInsurancePlansAnthemcom SecondPage;
   public AnthemHealthCareServicesOptionsAnthemcom ThirdPage;


   @BeforeClass
   public void setUp() throws MalformedURLException {
       driver = getDriver();
       builder = getBuilder();
       wait = getWait();
       jse2 = (JavascriptExecutor)driver;
       helper = new SeleniumHelper();
       
       FirstPage = new FindIndividualFamilyHealthInsurancePlansAnthemcom(driver);
       SecondPage = new ShopAffordableVisionInsurancePlansAnthemcom(driver);
       ThirdPage = new AnthemHealthCareServicesOptionsAnthemcom(driver);

   }

   @Test
   public void TestCase220_Test() throws Exception {

      try{
    	  
    	  
         
          
          
 	//VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com'
          if(!driver.getTitle().equals("Find Individual & Family Health Insurance Plans | Anthem.com")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.anthem.com/individual-and-family/");
          }
          System.out.println("Passed: VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com is Displayed");

 	//PAGE CHANGE Verification
          Assert.assertTrue(FirstPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Find Individual & Family Health Insurance Plans | Anthem.com' ");

 	//Test Step (1) | Action: Click | WebElement: A_Link_V__  Menu | HTML TagName: A
          Assert.assertTrue(FirstPage.A_Link_V__Menu.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__Menu' = Is Displayed");
          FirstPage.A_Link_V__Menu.click();
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(750);

 	//Test Step (2) | Action: Click | WebElement: A_Link_V__Vision Insurance | HTML TagName: A
          Assert.assertTrue(FirstPage.A_Link_V__VisionInsurance.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__VisionInsurance' = Is Displayed");
          FirstPage.A_Link_V__VisionInsurance.click();
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(750);

 	//PAGE CHANGE Verification
          Assert.assertTrue(SecondPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Shop Affordable Vision Insurance Plans | Anthem.com' ");

 	//Test Step (3) | Action: Verify Text | WebElement: H1_Text_V__Vision Insurance Plans | HTML TagName: H1
          Assert.assertTrue(SecondPage.H1_Text_V__VisionInsurancePlans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H1_Text_V__VisionInsurancePlans' = Is Displayed");
          Assert.assertEquals("Vision Insurance Plans" , SecondPage.H1_Text_V__VisionInsurancePlans.getText());
          System.out.println("Passed: Text matched: (Vision Insurance Plans)");
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(750);
          
          helper.checkAlert("Accept");
          helper.HandlePopUp("ForeSee","Click_OK",SecondPage.STRONG_Text_V__EyeExams);

 	//Test Step (4) | Action: Verify Text | WebElement: STRONG_Text_V__Eye Exams | HTML TagName: STRONG
          Assert.assertTrue(SecondPage.STRONG_Text_V__EyeExams.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.STRONG_Text_V__EyeExams' = Is Displayed");
          Assert.assertEquals("Eye Exams" , SecondPage.STRONG_Text_V__EyeExams.getText());
          System.out.println("Passed: Text matched: (Eye Exams)");
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(750);

 	//Test Step (5) | Action: Verify Text | WebElement: STRONG_Text_V__New Frames | HTML TagName: STRONG
          Assert.assertTrue(SecondPage.STRONG_Text_V__NewFrames.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.STRONG_Text_V__NewFrames' = Is Displayed");
          Assert.assertEquals("New Frames" , SecondPage.STRONG_Text_V__NewFrames.getText());
          System.out.println("Passed: Text matched: (New Frames)");
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(750);

 	//Test Step (6) | Action: Verify Text | WebElement: STRONG_Text_V__Standard Lenses | HTML TagName: STRONG
          Assert.assertTrue(SecondPage.STRONG_Text_V__StandardLenses.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.STRONG_Text_V__StandardLenses' = Is Displayed");
          Assert.assertEquals("Standard Lenses" , SecondPage.STRONG_Text_V__StandardLenses.getText());
          System.out.println("Passed: Text matched: (Standard Lenses)");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(750);

 	//Test Step (7) | Action: Verify Text | WebElement: STRONG_Text_V__Contact Lenses | HTML TagName: STRONG
          Assert.assertTrue(SecondPage.STRONG_Text_V__ContactLenses.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.STRONG_Text_V__ContactLenses' = Is Displayed");
          Assert.assertEquals("Contact Lenses" , SecondPage.STRONG_Text_V__ContactLenses.getText());
          System.out.println("Passed: Text matched: (Contact Lenses)");
          System.out.println("Passed: Test Step (7)");
          Thread.sleep(750);

 	//Test Step (8) | Action: Click | WebElement: A_Link_V__  Menu | HTML TagName: A
          Assert.assertTrue(SecondPage.A_Link_V__Menu.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.A_Link_V__Menu' = Is Displayed");
          SecondPage.A_Link_V__Menu.click();
          System.out.println("Passed: Test Step (8)");
          Thread.sleep(750);

 	//Test Step (9) | Action: Click | WebElement: A_Link_V__What to Know | HTML TagName: A
          Assert.assertTrue(SecondPage.A_Link_V__WhattoKnow.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.A_Link_V__WhattoKnow' = Is Displayed");
          SecondPage.A_Link_V__WhattoKnow.click();
          System.out.println("Passed: Test Step (9)");
          Thread.sleep(750);

 	//PAGE CHANGE Verification
          Assert.assertTrue(ThirdPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Anthem Health Care Services & Options | Anthem.com' ");

 	//Test Step (10) | Action: Verify Text | WebElement: H1_Text_V__What to Know: Anthem’s Health Care Services | HTML TagName: H1
          Assert.assertTrue(ThirdPage.H1_Text_V__WhattoKnowAnthemsHealthCareServices.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'ThirdPage.H1_Text_V__WhattoKnowAnthemsHealthCareServices' = Is Displayed");
          Assert.assertEquals("What to Know: Anthem’s Health Care Services" , ThirdPage.H1_Text_V__WhattoKnowAnthemsHealthCareServices.getText());
          System.out.println("Passed: Text matched: (What to Know: Anthem’s Health Care Services)");
          System.out.println("Passed: Test Step (10)");
          Thread.sleep(750);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }

}



