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
import pages.Basics;
import pages.ViewandSelectVisionPlans;
@SuppressWarnings("unused")

public class TestNG_TestCase374 extends TestBaseSetup{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;
   public JavascriptExecutor jse2;
   public SeleniumHelper helper;
   public Basics FirstPage;
   public ViewandSelectVisionPlans SecondPage;


   @BeforeClass
   public void setUp() throws MalformedURLException {
       driver = getDriver();
       builder = getBuilder();
       wait = getWait();
       jse2 = (JavascriptExecutor)driver;
       helper = new SeleniumHelper();

       FirstPage = new Basics(driver);
       SecondPage = new ViewandSelectVisionPlans(driver);

   }

   @Test
   public void TestCase374_Test() throws Exception {

      try{

 	//VERIFY PAGE: 'Basics'
          if(!driver.getTitle().equals("Basics")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://shop.anthem.com/sales/eox/shop/demographics/home/snq?execution=e1s1");
          }
          System.out.println("Passed: VERIFY PAGE: 'Basics is Displayed");

 	//PAGE CHANGE Verification
          Assert.assertTrue(FirstPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Basics' ");

 	//Test Step (1) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicszip5_demographicszip5 | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5.sendKeys("31107");
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(750);

/* 	//Test Step (2) | Action: RETURN_Key | WebElement: INPUT_input_V__text_demographicszip5_demographicszip5 | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5.sendKeys(Keys.RETURN);
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(750);*/

 	//Test Step (3) | Action: Select Item by Text | WebElement: INPUT_select_V__selectone_demographicscounty_demographicscounty | HTML TagName: SELECT
          Assert.assertTrue(FirstPage.INPUT_select_V__selectone_demographicscounty_demographicscounty.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_select_V__selectone_demographicscounty_demographicscounty' = Is Displayed");
          Select dropdown_3 = new Select(FirstPage.INPUT_select_V__selectone_demographicscounty_demographicscounty);
          dropdown_3.selectByVisibleText("DEKALB");
          Assert.assertEquals("DEKALB" , dropdown_3.getFirstSelectedOption().getText());
          System.out.println("Passed: Text Selected: 'DEKALB' ");
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(250);

 	//Test Step (4) | Action: Click | WebElement: INPUT_input_V__radio_demographicstypeOfCoverage_onlyVision | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__radio_demographicstypeOfCoverage_onlyVision.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__radio_demographicstypeOfCoverage_onlyVision' = Is Displayed");
          FirstPage.INPUT_input_V__radio_demographicstypeOfCoverage_onlyVision.click();
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(250);

 	//Test Step (5) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants0firstName_demographics | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics.sendKeys("Mark");
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(250);

 	//Test Step (6) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic.sendKeys("11/11/1957");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(250);

 	//Test Step (7) | Action: Click | WebElement: INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph' = Is Displayed");
          FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph.click();
          System.out.println("Passed: Test Step (7)");
          Thread.sleep(250);

 	//Test Step (8) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicssubsidyanualHouseHoldIncome_demog | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicssubsidyanualHouseHoldIncome_demog.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicssubsidyanualHouseHoldIncome_demog' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicssubsidyanualHouseHoldIncome_demog.sendKeys("20000");
          System.out.println("Passed: Test Step (8)");
          Thread.sleep(250);

 	//Test Step (9) | Action: Click | WebElement: INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext' = Is Displayed");
          FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext.click();
          System.out.println("Passed: Test Step (9)");
          Thread.sleep(250);

 	//PAGE CHANGE Verification
          Assert.assertTrue(SecondPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'View and Select Vision Plans' ");

 	//Test Step (10) | Action: Verify Text | WebElement: SPAN_Text_V__ 3 Vision Plan | HTML TagName: SPAN

          Assert.assertTrue(SecondPage.SPAN_Text_V__3VisionPlan.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.SPAN_Text_V__3VisionPlan' = Is Displayed");
          Assert.assertEquals("3 Vision Plan" , SecondPage.SPAN_Text_V__3VisionPlan.getText());
          System.out.println("Passed: Text matched: (3 Vision Plan)");
          System.out.println("Passed: Test Step (10)");
          Thread.sleep(250);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }

}

