package functional_tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObjects.PAYCHEX_HomePage_PO;
import resources.base;
import resources.base2;
import resources.dateObject;

@Listeners({AllureTestListeners.class})
//@Epic("Certificate Pringing")
//@Feature("Pooling")
public class ST_PAYCHEX extends base{
	
	@BeforeMethod
	  public void setUp() {
		  driver=initializeDriver();
		  //driver=initializeDriverWithName("edge");
		  String paychexURL = "https://www.paychex.com";
		  driver.get(paychexURL);		 
	  }
	
	 @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }

	 public void WaitFor1Sec()	
		{			 
			try
			{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
		}	 

	 
	 @Epic("PAYCHEX")
	 @Feature("")
	 @Story("Home Page")	 
	 @Description("Verify User ability to View Home Page")
	 @Severity(SeverityLevel.NORMAL)
	 @Step("Step 1: Browser to PAYCHEX Home Page. " +
			"Step 2: Verify the page title: Paychex: Payroll & HR Solutions" +
			"Step 3: Verify the click buttons  " +
			"Step 4: Move and Verify dropdown field ")
	 @Test()
	 public void Test_001_Home() {
		 PAYCHEX_HomePage_PO PAYCHEX_HomePage = new PAYCHEX_HomePage_PO(driver);
		 //WaitFor1Sec();
		 //WaitFor1Sec();
		 //System.out.println(driver.getTitle());		 
		 //System.out.println(PAYCHEX_HomePage.Btn_Login().isDisplayed());
		 //System.out.println(PAYCHEX_HomePage.Btn_Lets_Get_Started().isDisplayed());
		 assertTrue(driver.getTitle().contains("Paychex: Payroll & HR Solutions"));
		 assertTrue(PAYCHEX_HomePage.Btn_Login().isDisplayed());
		 assertTrue(PAYCHEX_HomePage.Btn_Lets_Get_Started().isDisplayed());
		 assertTrue(PAYCHEX_HomePage.Btn_Request_Pricing().isDisplayed());
		 assertTrue(PAYCHEX_HomePage.Btn_Lets_Get_Started().getText().contains("Let's Get Started"));
		 assertTrue(PAYCHEX_HomePage.Btn_Request_Pricing().getText().contains("Request Pricing"));
		 
		 Actions builder = new Actions(driver);
		 builder.moveToElement(PAYCHEX_HomePage.Menu_Resources()).perform();
		 WaitFor1Sec();
		 WaitFor1Sec();
	}
	 

	
}