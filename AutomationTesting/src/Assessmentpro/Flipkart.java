package Assessmentpro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		ele.sendKeys("iphone11");
		ele.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 11 (White, 64 GB)\"]")).click();

		Thread.sleep(2000);
		
		Set<String> wins=driver.getWindowHandles();
		for( String win:wins)
		{
			driver.switchTo().window(win);
			//break;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Place Order")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();

	}

}
