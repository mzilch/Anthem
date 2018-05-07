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
import pages.Basics;
import pages.ViewandSelectVisionPlans;
@SuppressWarnings("unused")

public class TestNG_TestCase834 extends TestBaseSetup{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;
   public JavascriptExecutor jse2;
   public Basics FirstPage;
   public ViewandSelectVisionPlans SecondPage;


   @BeforeClass
   public void setUp() throws MalformedURLException {
       driver = getDriver();
       builder = getBuilder();
       wait = getWait();
       jse2 = (JavascriptExecutor)driver;

       FirstPage = new Basics(driver);
       SecondPage = new ViewandSelectVisionPlans(driver);

   }

   @Test
   public void TestCase834_Test() throws Exception {

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
          FirstPage.INPUT_input_V__text_demographicszip5_demographicszip5.sendKeys("30311");
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(1000);

 	//Test Step (2) | Action: Click | WebElement: LABEL_Text_V__Show me only Dental and Vision Plans (Optional) | HTML TagName: LABEL
          Assert.assertTrue(FirstPage.LABEL_Text_V__ShowmeonlyDentalandVisionPlansOptional.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.LABEL_Text_V__ShowmeonlyDentalandVisionPlansOptional' = Is Displayed");
          FirstPage.LABEL_Text_V__ShowmeonlyDentalandVisionPlansOptional.click();
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(1000);

 	//Test Step (3) | Action: Click | WebElement: LABEL_Text_V__Show me only Vision Plans | HTML TagName: LABEL
          Assert.assertTrue(FirstPage.LABEL_Text_V__ShowmeonlyVisionPlans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.LABEL_Text_V__ShowmeonlyVisionPlans' = Is Displayed");
          FirstPage.LABEL_Text_V__ShowmeonlyVisionPlans.click();
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(1000);

 	//Test Step (4) | Action: Verify Text | WebElement: LABEL_Text_V__Medical products and rates are not available for o | HTML TagName: LABEL
          Assert.assertTrue(FirstPage.LABEL_Text_V__Medicalproductsandratesarenotavailableforo.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.LABEL_Text_V__Medicalproductsandratesarenotavailableforo' = Is Displayed");
          Assert.assertEquals("Medical products and rates are not available for online quoting for the zip code/county. If you have questions, please contact us at the number at the top of your screen. If you want to apply for dental and/or vision coverage for this year, select the appropriate option to continue." , FirstPage.LABEL_Text_V__Medicalproductsandratesarenotavailableforo.getText());
          System.out.println("Passed: Text matched: (Medical products and rates are not available for online quoting for the zip code/county. If you have questions, please contact us at the number at the top of your screen. If you want to apply for dental and/or vision coverage for this year, select the appropriate option to continue.)");
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(1000);

 	//Test Step (5) | Action: Verify Text | WebElement: SPAN_Text_V__06/01/2018 | HTML TagName: SPAN
          Assert.assertTrue(FirstPage.SPAN_Text_V__06012018.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.SPAN_Text_V__06012018' = Is Displayed");
          Assert.assertEquals("06/01/2018" , FirstPage.SPAN_Text_V__06012018.getText());
          System.out.println("Passed: Text matched: (06/01/2018)");
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(1000);

 	//Test Step (6) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants0firstName_demographics | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants0firstName_demographics.sendKeys("Mark");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(1000);

 	//Test Step (7) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants0dob_demographicsapplic.sendKeys("11/11/1955");
          System.out.println("Passed: Test Step (7)");
          Thread.sleep(1000);

 	//Test Step (8) | Action: Click | WebElement: INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph' = Is Displayed");
          FirstPage.INPUT_input_V__radio_demographicsapplicants0tobaccoUser_demograph.click();
          System.out.println("Passed: Test Step (8)");
          Thread.sleep(1000);

 	//Test Step (9) | Action: Click | WebElement: LABEL_Text_V__Applicant and Others | HTML TagName: LABEL
          Assert.assertTrue(FirstPage.LABEL_Text_V__ApplicantandOthers.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.LABEL_Text_V__ApplicantandOthers' = Is Displayed");
          FirstPage.LABEL_Text_V__ApplicantandOthers.click();
          System.out.println("Passed: Test Step (9)");
          Thread.sleep(1000);

 	//Test Step (10) | Action: Verify Text | WebElement: A_Link_V__+ Add Dependent | HTML TagName: A
          Assert.assertTrue(FirstPage.A_Link_V__AddDependent.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__AddDependent' = Is Displayed");
          Assert.assertEquals("+ Add Dependent" , FirstPage.A_Link_V__AddDependent.getText());
          System.out.println("Passed: Text matched: (+ Add Dependent)");
          System.out.println("Passed: Test Step (10)");
          Thread.sleep(1000);

 	//Test Step (11) | Action: Verify Text | WebElement: A_Link_V__+ Add Spouse / Domestic Partner | HTML TagName: A
          Assert.assertTrue(FirstPage.A_Link_V__AddSpouseDomesticPartner.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__AddSpouseDomesticPartner' = Is Displayed");
          Assert.assertEquals("+ Add Spouse / Domestic Partner" , FirstPage.A_Link_V__AddSpouseDomesticPartner.getText());
          System.out.println("Passed: Text matched: (+ Add Spouse / Domestic Partner)");
          System.out.println("Passed: Test Step (11)");
          Thread.sleep(1000);

 	//Test Step (12) | Action: Click | WebElement: A_Link_V__+ Add Spouse / Domestic Partner | HTML TagName: A
          Assert.assertTrue(FirstPage.A_Link_V__AddSpouseDomesticPartner.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__AddSpouseDomesticPartner' = Is Displayed");
          FirstPage.A_Link_V__AddSpouseDomesticPartner.click();
          System.out.println("Passed: Test Step (12)");
          Thread.sleep(1000);

 	//Test Step (13) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants1firstName_demographics | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants1firstName_demographics.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants1firstName_demographics' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants1firstName_demographics.sendKeys("Pam");
          System.out.println("Passed: Test Step (13)");
          Thread.sleep(1000);

 	//Test Step (14) | Action: INPUT Text | WebElement: INPUT_input_V__text_demographicsapplicants1dob_demographicsapplic | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__text_demographicsapplicants1dob_demographicsapplic.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__text_demographicsapplicants1dob_demographicsapplic' = Is Displayed");
          FirstPage.INPUT_input_V__text_demographicsapplicants1dob_demographicsapplic.sendKeys("11/11/1961");
          System.out.println("Passed: Test Step (14)");
          Thread.sleep(1000);

 	//Test Step (15) | Action: Click | WebElement: INPUT_input_V__radio_demographicsapplicants1tobaccoUser_NoDep1Tob | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__radio_demographicsapplicants1tobaccoUser_NoDep1Tob.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__radio_demographicsapplicants1tobaccoUser_NoDep1Tob' = Is Displayed");
          FirstPage.INPUT_input_V__radio_demographicsapplicants1tobaccoUser_NoDep1Tob.click();
          System.out.println("Passed: Test Step (15)");
          Thread.sleep(1000);

 	//Test Step (16) | Action: Click | WebElement: INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext | HTML TagName: INPUT
          Assert.assertTrue(FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext' = Is Displayed");
          FirstPage.INPUT_input_V__submit__eventId_next_buttonshopgetaquotenext.click();
          System.out.println("Passed: Test Step (16)");
          Thread.sleep(1000);

 	//PAGE CHANGE Verification
          Assert.assertTrue(SecondPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'View and Select Vision Plans' ");

 	//Test Step (17) | Action: Verify Text | WebElement: H2_Text_V__View and Select Vision Plans | HTML TagName: H2
          Assert.assertTrue(SecondPage.H2_Text_V__ViewandSelectVisionPlans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H2_Text_V__ViewandSelectVisionPlans' = Is Displayed");
          Assert.assertEquals("View and Select Vision Plans" , SecondPage.H2_Text_V__ViewandSelectVisionPlans.getText());
          System.out.println("Passed: Text matched: (View and Select Vision Plans)");
          System.out.println("Passed: Test Step (17)");
          Thread.sleep(1000);

 	//Test Step (18) | Action: Verify Text | WebElement: SPAN_Text_V__ Mark (Applicant) + Spouse | HTML TagName: SPAN
          Assert.assertTrue(SecondPage.SPAN_Text_V__MarkApplicantSpouse.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.SPAN_Text_V__MarkApplicantSpouse' = Is Displayed");
          Assert.assertEquals("Mark (Applicant) + Spouse" , SecondPage.SPAN_Text_V__MarkApplicantSpouse.getText());
          System.out.println("Passed: Text matched: (Mark (Applicant) + Spouse)");
          System.out.println("Passed: Test Step (18)");
          Thread.sleep(1000);

 	//Test Step (19) | Action: Verify Text | WebElement: H3_Text_V__Blue View Vision Value | HTML TagName: H3
          Assert.assertTrue(SecondPage.H3_Text_V__BlueViewVisionValue.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H3_Text_V__BlueViewVisionValue' = Is Displayed");
          Assert.assertEquals("Blue View Vision Value" , SecondPage.H3_Text_V__BlueViewVisionValue.getText());
          System.out.println("Passed: Text matched: (Blue View Vision Value)");
          System.out.println("Passed: Test Step (19)");
          Thread.sleep(1000);

 	//Test Step (20) | Action: Verify Text | WebElement: H3_Text_V__Blue View Vision Plus | HTML TagName: H3
          Assert.assertTrue(SecondPage.H3_Text_V__BlueViewVisionPlus.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H3_Text_V__BlueViewVisionPlus' = Is Displayed");
          Assert.assertEquals("Blue View Vision Plus" , SecondPage.H3_Text_V__BlueViewVisionPlus.getText());
          System.out.println("Passed: Text matched: (Blue View Vision Plus)");
          System.out.println("Passed: Test Step (20)");
          Thread.sleep(1000);

 	//Test Step (21) | Action: Verify Text | WebElement: H3_Text_V__Blue View Vision Enhanced | HTML TagName: H3
          Assert.assertTrue(SecondPage.H3_Text_V__BlueViewVisionEnhanced.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H3_Text_V__BlueViewVisionEnhanced' = Is Displayed");
          Assert.assertEquals("Blue View Vision Enhanced" , SecondPage.H3_Text_V__BlueViewVisionEnhanced.getText());
          System.out.println("Passed: Text matched: (Blue View Vision Enhanced)");
          System.out.println("Passed: Test Step (21)");
          Thread.sleep(1000);

 	//Test Step (22) | Action: Click | WebElement: A_Link_V__Add to Favorites | HTML TagName: A
          Assert.assertTrue(SecondPage.A_Link_V__AddtoFavorites.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.A_Link_V__AddtoFavorites' = Is Displayed");
          SecondPage.A_Link_V__AddtoFavorites.click();
          System.out.println("Passed: Test Step (22)");
          Thread.sleep(1000);

 	//Test Step (23) | Action: Verify Text | WebElement: A_Link_V__Show my 1 favorite plans | HTML TagName: A
          Assert.assertTrue(SecondPage.A_Link_V__Showmy1favoriteplans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.A_Link_V__Showmy1favoriteplans' = Is Displayed");
          Assert.assertEquals("Show my 1 favorite plans" , SecondPage.A_Link_V__Showmy1favoriteplans.getText());
          System.out.println("Passed: Text matched: (Show my 1 favorite plans)");
          System.out.println("Passed: Test Step (23)");
          Thread.sleep(1000);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }

}

