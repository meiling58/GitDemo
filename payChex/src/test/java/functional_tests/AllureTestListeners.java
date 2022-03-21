package functional_tests;

import org.openqa.selenium.OutputType;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import io.qameta.allure.Attachment;

public class AllureTestListeners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		saveScreenshotOnFailure(base.getDriver());
		savelogs(result.getMethod().getConstructorOrMethod().getName());
	}

	@Attachment(value="Screenshot", type = "image/png")
	public byte[] saveScreenshotOnFailure(WebDriver driver) {
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment(value= "{0}", type = "text/plain")	
	public static String savelogs(String message) {
		return message;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		saveScreenshotOnSucess(base.getDriver());
		savelogs(result.getMethod().getConstructorOrMethod().getName());
	}
	
	@Attachment(value="Screenshot", type = "image/png")
	public byte[] saveScreenshotOnSucess(WebDriver driver) {
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		saveScreenshotOnSkipped(base.getDriver());
		savelogs(result.getMethod().getConstructorOrMethod().getName());
	}
	@Attachment(value="Screenshot", type = "image/png")
	public byte[] saveScreenshotOnSkipped(WebDriver driver) {
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}	
	
	}
