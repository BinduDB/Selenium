package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSC3
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(3000);
	WebElement	pop=driver.findElement(By.xpath("//button[@id=\"buttonAlert1\"]"));
	pop.click();
	Alert popup=driver.switchTo().alert();
	popup.accept();
	}

}
