package pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.Step;


public class CLSloginPage_PO {
	
	public WebDriver driver;
	private By select_UserID=By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/blockquote[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/fieldset[1]/select[1]");	
	private By btn_feedb=By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/blockquote[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/fieldset[1]/input[1]");
	private By menu_DotnetApps=By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/nav[1]/ul[1]/li[7]/a[1]");
	private By menu_Certificate_Print=By.xpath("//a[contains(text(),'Certificate Printing')]");
	
	 //v2 objects
		private By btn_SetUser=By.xpath("//tbody/tr[1]/td[1]/form[1]/fieldset[1]/input[2]");
		private By select_Role=By.xpath("//tbody/tr[1]/td[1]/form[1]/fieldset[1]/select[1]");
		private By txtbox_UserId=By.xpath("//tbody/tr[1]/td[1]/form[1]/fieldset[1]/input[1]");
		private By menu_DotnetApps_v2=By.xpath("//a[contains(text(),'DOTNET Apps (.NET)')]");
		private By menu_Certificate_Print_v2=By.xpath("//a[contains(text(),'Certificate Printing')]");
		
		private By menu_Payments_v2=By.xpath("//a[normalize-space()='Payments']");
		private By menu_Cash_Processing_v2=By.xpath("//a[normalize-space()='Cash Processing']");
		private By menu_Settlements_v2=By.xpath("//a[normalize-space()='Settlements']");
		private By menu_Pooling_v2=By.xpath("//a[normalize-space()='Pooling']");
		private By menu_DOTNET_Apps_VB_v2=By.xpath("//a[normalize-space()='DOTNET Apps(VB)']");
		private By menu_DOTNET_Apps_NET_v2=By.xpath("//a[normalize-space()='DOTNET Apps (.NET)']");
		
		//http://165.110.173.117:8081/cls//index-v2.cfm?debug=false
		private String url_Dotnet_v2 = "http://165.110.173.117:8081/cls//index-v2.cfm?debug=false";
		private String url_PIT_v2 = "http://165.110.173.117:8093/cls/index-v2.cfm?debug=false";
		private String url_AIC_v2 = "http://165.110.173.117:8089/cls/index-v2.cfm?debug=false";
		
		private By submenu_DOTNET_VB_Form_Letters_v2=By.xpath("(//a[normalize-space()='Form Letters'])[2]");
		private By submenu_DOTNET_NET_Late_Penalty_Bill_v2=By.xpath("(//a[normalize-space()='Late Penalty Bill'])[2]");
		private By submenu_DOTNET_NET_Cert_Printing_v2=By.xpath("//a[normalize-space()='Certificate Printing']");
		private By submenu_Pooling_PIT_v2=By.xpath("//a[normalize-space()='Interim Transfer']");
		private By submenu_Pooling_AIC_v2=By.xpath("//a[normalize-space()='Interest Adjustment Claims']");
		
	public CLSloginPage_PO(WebDriver driver) {
		
		this.driver=driver;
	
	}
	public WebElement select_UserID()
	{
		return driver.findElement(select_UserID);
	}
	
	public WebElement btn_feedb()
	{
		return driver.findElement(btn_feedb);
	}
	public WebElement menu_DotnetApps()
	{
		return driver.findElement(menu_DotnetApps);
	}
	public WebElement menu_Certificate_Print()
	{
		return driver.findElement(menu_Certificate_Print);
	}
	
	//v2 objects
		public WebElement btn_SetUser()
		{
			return driver.findElement(btn_SetUser);
		}
		public WebElement select_Role()
		{
			return driver.findElement(select_Role);
		}
		public WebElement txtbox_UserId()
		{
			return driver.findElement(txtbox_UserId);
		}
		public WebElement menu_DotnetApps_v2()
		{
			return driver.findElement(menu_DotnetApps_v2);
		}
		public WebElement menu_Payments_v2()
		{
			return driver.findElement(menu_Payments_v2);
		}
		public WebElement menu_Cash_Processing_v2()
		{
			return driver.findElement(menu_Cash_Processing_v2);
		}
		public WebElement menu_Settlements_v2()
		{
			return driver.findElement(menu_Settlements_v2);
		}
		public WebElement menu_Pooling_v2()
		{
			return driver.findElement(menu_Pooling_v2);
		}
		public WebElement menu_DOTNET_Apps_VB_v2()
		{
			return driver.findElement(menu_DOTNET_Apps_VB_v2);
		}
		public WebElement menu_DOTNET_Apps_NET_v2()
		{
			return driver.findElement(menu_DOTNET_Apps_NET_v2);
		}
		public WebElement submenu_DOTNET_VB_Form_Letters_v2()
		{
			return driver.findElement(submenu_DOTNET_VB_Form_Letters_v2);
		}
		public WebElement submenu_DOTNET_NET_Late_Penalty_Bill_v2()
		{
			return driver.findElement(submenu_DOTNET_NET_Late_Penalty_Bill_v2);
		}
		public WebElement submenu_DOTNET_NET_Cert_Printing_v2()
		{
			return driver.findElement(submenu_DOTNET_NET_Cert_Printing_v2);
		}
		public WebElement submenu_Pooling_PIT_v2()
		{
			return driver.findElement(submenu_Pooling_PIT_v2);
		}
		public WebElement submenu_Pooling_AIC_v2()
		{
			return driver.findElement(submenu_Pooling_AIC_v2);
		}
		
		public WebElement menu_Certificate_Print_v2()
		{
			return driver.findElement(menu_Certificate_Print_v2);
		}
		
	
	public void Wait()	
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
	
	public void to_Cert_Print() {
		Select sel_user  =new Select(select_UserID());
		sel_user.selectByVisibleText("TestAgentNo2");
		btn_feedb().click();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		Wait();
		Actions builder = new Actions(driver);
		builder.moveToElement(menu_DotnetApps()).perform();
		menu_Certificate_Print().click();
		Wait();
	}
	
	@Step("Step 1: Broswer to CLS-v2 Page "+ 
		  "Step 2: Input UserId and Select Role "+
		  "Step 3: Broswer to Certicate Printing Page")
	public void to_Cert_Print_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("Automation_User");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalPoolAssoc");
		btn_SetUser().click();
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Wait();
		Actions actions = new Actions(driver);
		WebElement menu =menu_DotnetApps_v2();
		actions.moveToElement(menu).perform();
		menu_Certificate_Print_v2().click();
		Wait();
		Wait();
	}
	
	@Step("Broswer to Certicate Printing Page")
	public void Setup_Cert_Print_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("Automation_User");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalPoolAssoc");
		btn_SetUser().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(menu_DOTNET_Apps_NET_v2()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Actions action = new Actions(driver);
		action.moveToElement(menu_DOTNET_Apps_NET_v2());			
		action.moveToElement(menu_Certificate_Print_v2()).click().build().perform();	
		}
	
	@Step("Step 1: Broswer to CLS-v2 Page "+  
		  "Step 2: Input UserId and Select Role "+
		  "Step 3: Broswer to Late_Penalty Bill Page")
	public void to_Late_Penalty_Bill_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("Automation_User");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalPmtControlMgr");
		btn_SetUser().click();
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Wait();
		Actions actions = new Actions(driver);
		WebElement menu =menu_DOTNET_Apps_NET_v2();
		actions.moveToElement(menu).perform();
		submenu_DOTNET_NET_Late_Penalty_Bill_v2().click();
		Wait();
		Wait();		
	}
	
	@Step("Broswer to Late_Penalty Bill Page")
	public void Setup_Late_Penalty_Bill_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("Automation_User");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalPmtControlMgr");
		btn_SetUser().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(menu_DOTNET_Apps_NET_v2()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Actions action = new Actions(driver);
		action.moveToElement(menu_DOTNET_Apps_NET_v2());			
		action.moveToElement(submenu_DOTNET_NET_Late_Penalty_Bill_v2()).click().build().perform();
	}
	
	@Step("Step 1: Broswer to CLS-v2 Page "+  
		  "Step 2: Input UserId and Select Role "+
		  "Step 3: Broswer to Form Letters Page ")	
	public void to_Form_Letters_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalCustAssoc");		
		btn_SetUser().click();
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Wait();		
		Actions actions = new Actions(driver);
		WebElement menu =menu_DOTNET_Apps_VB_v2();
		actions.moveToElement(menu).perform();
		submenu_DOTNET_VB_Form_Letters_v2().click();
		Wait();
		Wait();		
	}
	
	@Step("Broswer to Form Letters Page ")
	public void Setup_Form_Letters_v2() {
		driver.get(url_Dotnet_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalInternalCustAssoc");		
		btn_SetUser().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(menu_DOTNET_Apps_VB_v2()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Actions action = new Actions(driver);
		action.moveToElement(menu_DOTNET_Apps_VB_v2());			
		action.moveToElement(submenu_DOTNET_VB_Form_Letters_v2()).click().build().perform();		
	}
	
	@Step("Step 1: Broswer to CLS-v2 Page "+  
		  "Step 2: Input UserId and Select Role "+
		  "Step 3: Broswer to Pooling Interim Transfer")	
	public void to_PIT_v2() {
		driver.get(url_PIT_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalPoolingManager");		
		btn_SetUser().click();
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Wait();		
		Actions actions = new Actions(driver);
		WebElement menu =menu_Pooling_v2();
		actions.moveToElement(menu).perform();
		submenu_Pooling_PIT_v2().click();
		Wait();
		Wait();		
	}
	
	@Step("Broswer to Pooling Interim Transfer")
	public void Setup_PIT_v2() {
		driver.get(url_PIT_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalPoolingManager");		
		btn_SetUser().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(menu_Pooling_v2()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Actions action = new Actions(driver);
		action.moveToElement(menu_Pooling_v2());			
		action.moveToElement(submenu_Pooling_PIT_v2()).click().build().perform();		
	}
	
	@Step("Step 1: Broswer to CLS-v2 Page "+  
		  "Step 2: Input UserId and Select Role "+
		  "Step 3: Broswer to Interest Adjustment Claims Page")	
	public void to_IAC_v2() {
		driver.get(url_AIC_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalPoolingManager");		
		btn_SetUser().click();
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Wait();		
		Actions actions = new Actions(driver);
		WebElement menu =menu_Pooling_v2();
		actions.moveToElement(menu).perform();
		submenu_Pooling_AIC_v2().click();
		Wait();
		Wait();		
	}
	
	@Step("Broswer to Interest Adjustment Claims Page")	
	public void Setup_IAC_v2() {
		driver.get(url_AIC_v2);
		txtbox_UserId().sendKeys("AutoTester");
		Select sel_user  =new Select(select_Role());
		sel_user.selectByVisibleText("FTAPortalPoolingManager");		
		btn_SetUser().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(menu_Pooling_v2()));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Actions action = new Actions(driver);
		action.moveToElement(menu_Pooling_v2());			
		action.moveToElement(submenu_Pooling_AIC_v2()).click().build().perform();
	}
}
