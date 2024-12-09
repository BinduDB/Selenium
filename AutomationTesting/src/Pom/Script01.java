package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script01 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("bindu");
		Thread.sleep(2000);
		//WebElement pwd = driver.findElement(By.id("pass"));
		driver.navigate().refresh();
		usn.sendKeys("adbim");
		
		//driver.quit();
	}

}
