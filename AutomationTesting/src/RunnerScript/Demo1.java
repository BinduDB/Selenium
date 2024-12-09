package RunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.PomScript;

public class Demo1
{

	@Test
	public void validdata() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		PomScript p=new PomScript(driver);
		p.user("Bindu");
		p.passward("Bindu@123");
		p.login();
		
		
	}
}
