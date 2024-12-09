package scripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Scriptpopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		WebElement el=	driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		el.sendKeys("iphone11");
		el.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 11 (Black, 64 GB)\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
