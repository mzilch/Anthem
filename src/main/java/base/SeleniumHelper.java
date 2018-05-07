package base;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.TestBaseSetup;

public class SeleniumHelper {	
	
	public WebDriver driver = null;
	public Actions builder = null;
	public WebDriverWait wait = null;
	public Properties MBRConfig = new Properties();
	
	//TimeOuts
	public static final int WaitTime5 = 5;
	public static final int WaitTime10 = 10;
	public static final int WaitTime20 = 20;
	public static final int WaitTime30 = 30;
	public static final int WaitTime60 = 50;
;
	
	public SeleniumHelper() throws MalformedURLException{
		this.driver = TestBaseSetup.getDriver();
		this.builder = TestBaseSetup.getBuilder();
		this.wait = TestBaseSetup.getWait();
	}
	
	//Page Methods -------------------------------------------------------------------------
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	public String getPageUrl(){
		return driver.getCurrentUrl();
	}
	
	public void waitForPageLoadJScript(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i = 0; i < WaitTime30; i++ ){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				if(js.executeScript("return document.readystate").toString().equals("complete")){
					break;
				}
			}			
		}
	}
	
	//Actions Methods -------------------------------------------------------------------------
	// Click
	public void click(WebElement InEllymont, String ClickType) {
		wait.until(ExpectedConditions.visibilityOf(InEllymont));
		try{
			switch(ClickType){	
			case "javaScriptExecutor":
				//Element is present but having permanent Overlay.
	            //Use JavascriptExecutor to send the click directly on the element.
				
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	            jse2.executeScript("arguments[0].click();", InEllymont);
				break;
			case "Actions":
				//Element not getting clicked due to JavaScript or AJAX calls present
	            //Try to use Actions Class
				Actions actions = new Actions(driver);
	            actions.moveToElement(InEllymont).click().build().perform();
				break;
			case "":
				InEllymont.click();
				break;
			default:			
				InEllymont.click();
			}
		} catch(NoSuchElementException nse){
			System.out.println("Element not found" + InEllymont + "| Error - " + nse.getMessage());
		} catch(StaleElementReferenceException sere){
			click(InEllymont, "");
		}
	}	
	// MouseOver
	public void MouseOver(WebElement InEllymont){		
		builder.moveToElement(InEllymont).perform();
	}	
	
	public void checkAlert(String AcceptDismiss) {
/*	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }*/
	try 
	    {

	        //Handle the alert pop-up using seithTO alert statement
	        Alert alert = driver.switchTo().alert();
	
	        //Print alert is present
	        System.out.println("Alert is present");
	
	        //get the message which is present on pop-up
	        String message = alert.getText();
	
	        //print the pop-up message
	        System.out.println(message);
	
	        alert.sendKeys("");
	        //Click on OK button on pop-up
	        if(AcceptDismiss == "Accept"){
	        	alert.accept();
	        }
	        if(AcceptDismiss == "Dismiss"){
	        	alert.dismiss();
	        }
	        
	        
	        driver.switchTo().defaultContent();
	    } 
	    catch (NoAlertPresentException e) 
	    {
	        //if alert is not present print message
	        System.out.println("Alert is not present");
	    }
	}
	
	public void HandlePopUp(String CheckForThisWindow, String ActionToTake, WebElement EllyMont) throws InterruptedException {	     
     
		try{			
		
	      String MainWindow=driver.getWindowHandle();		
	      		
	      // To handle all new opened window.				
	      Set<String> s1=driver.getWindowHandles();		
	      Iterator<String> i1=s1.iterator();		
	      		
	      while(i1.hasNext())			
	      {		
	          String ChildWindow=i1.next();		
	          		
	          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	          {    
	              // Switching to Child window 
	              driver.switchTo().window(ChildWindow);
	              
	              String popUpTitle = driver.getTitle();
	              
	              if(popUpTitle == CheckForThisWindow){
	      			switch(ActionToTake){	
	    			case "Click_OK":
	    				EllyMont.click();
	    				break;
	    			case "Click_CANCEL":
	    				EllyMont.click();
	    				break;
	    			case "Click_X":
	    				EllyMont.click();
	    				break;
	    			default:			
	    				driver.close();
	    			}            	  
	              }  
	          }		
	      }	// While Loop
	      
	      // Switching to Parent window i.e Main Window.
	          driver.switchTo().window(MainWindow);				
		}
	    catch (Exception e) 	    {
	        //if alert is not present print message
	        System.out.println(e.getMessage());
	    }
	}

}
