package resources;


//import java.net.MalformedURLException;
//import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class base2 {
	
	

	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver= new ThreadLocal<WebDriver>();

	
	public WebDriver initializeDriver() {		
		//mvn test -Dbrowser=chrome
		//mvn test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=Smoke.xml
		//mvn test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=Functional.xml
		
		//String browserName = System.getProperty("browser"); 
		String browserName = "chrome";
		//String browserName = "chrome";
		//String browserName = "firefox";
		//String browserName = "edge";
		//System.out.println(browserName);

		if (browserName.contains("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");
			ChromeOptions options =new ChromeOptions();
			
			//  options.addArguments("headless");
			  options.addArguments("--no-sandbox");
		driver= new ChromeDriver(options);
			
			//driver = new ChromeDriver();
	

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver","WebDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
		
		} else if (browserName.equals("IE")) {		
			WebDriverManager.iedriver().setup();
			System.setProperty("webdriver.ie.driver", "WebDrivers//IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		} else if (browserName.equals("edge")) {		
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.msedge.driver", "WebDrivers//msedgedriver.exe");
		    driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
		
	}
	
	public WebDriver initializeDriverWithName(String DriverName) {		
		//mvn test -Dbrowser=chrome
		//mvn test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=Smoke.xml
		//mvn test -Dbrowser=chrome -Dsurefire.suiteXmlFiles=Functional.xml
		
		//String browserName = System.getProperty("browser"); 
		//String browserName = "chrome";
		//String browserName = "chrome";
		//String browserName = "firefox";
		//String browserName = "edge";
		//System.out.println(browserName);

		if (DriverName=="chrome") {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");
			ChromeOptions options =new ChromeOptions();
			
			//  options.addArguments("headless");
			  options.addArguments("--no-sandbox");
		driver= new ChromeDriver(options);
			
			//driver = new ChromeDriver();
	

		} else if (DriverName=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver","WebDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
		
		} else if (DriverName=="IE") {		
			WebDriverManager.iedriver().setup();
			System.setProperty("webdriver.ie.driver", "WebDrivers//IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		} else if (DriverName=="edge") {		
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.msedge.driver", "WebDrivers//msedgedriver.exe");
		    driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
		
	}
	
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	
	
}
