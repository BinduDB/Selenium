package Bactch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/mainpage.html");
		WebElement usn = driver.findElement(By.className("t1"));
		usn.sendKeys("Bindu");
		driver.switchTo().frame(0);
		
		WebElement pwd = driver.findElement(By.className("t2"));
		pwd.sendKeys("Bindu@123");
		driver.switchTo().frame(0);
		WebElement mob = driver.findElement(By.className("t3"));
		mob.sendKeys("9353624695");
		
	}

}
