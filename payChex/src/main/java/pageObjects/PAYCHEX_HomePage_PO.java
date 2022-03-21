package pageObjects;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class PAYCHEX_HomePage_PO {
	
	public WebDriver driver;
	
	private By Menu_Our_Solutions=By.xpath("//div[@id='solutions']//a[@class='navbar-link'][normalize-space()='Our Solutions']");
	private By Menu_Resources=By.xpath("//div[@id='resources']//a[@class='navbar-link'][normalize-space()='Resources']");
	private By Btn_Login=By.xpath("//a[@class='button is-black']");
	private By Btn_Lets_Get_Started=By.xpath("//a[normalize-space()=\"Let's Get Started\"]");
	private By Btn_Request_Pricing=By.xpath("//a[@class='button is-paychexblue is-hidden-mobile']");

public PAYCHEX_HomePage_PO(WebDriver driver){
	this.driver=driver;
}

public WebElement Menu_Our_Solutions()
{
	return driver.findElement(Menu_Our_Solutions);
}
public WebElement Menu_Resources()
{
	return driver.findElement(Menu_Resources);
}
public WebElement Btn_Request_Pricing()
{
	return driver.findElement(Btn_Request_Pricing);
}
	
public WebElement Btn_Login()
{
	return driver.findElement(Btn_Login);
}

public WebElement Btn_Lets_Get_Started()
{
	return driver.findElement(Btn_Lets_Get_Started);
}

	
}
