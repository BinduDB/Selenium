package RunnerScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Pom.Pomscript02;

public class RunnerScript02

{
	@Test
	public void validdata() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Pomscript02 p=new Pomscript02(driver);
		p.srch("iphone16");
		p.submit();
				
//		Actions act=new Actions(driver);
//		Robot r =new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
		p.img();
		Thread.sleep(3000);
		
		Set<String> allwin=driver.getWindowHandles();
		for(String win : allwin)
		{
			driver.switchTo().window(win);
			
		}
		
		p.but();
	}
}
