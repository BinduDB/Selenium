package GenericScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript
{
	WebDriver driver;
	@BeforeMethod
	public void BrowserLaunch()
	{
		//System.setProperty("Webrdiver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");	
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
		
	}
	
}
