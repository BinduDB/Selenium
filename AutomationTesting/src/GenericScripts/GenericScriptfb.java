package GenericScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScriptfb
{
	 public WebDriver driver;
	@BeforeMethod
	public void BrowserSetup()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver.manage().window().maximize();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void Closebrowser()
	
	{
		{
			if (driver != null)
		
		driver.quit();
	}
}
}