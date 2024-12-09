package Bactch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintofb {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		usn.sendKeys("Bindu");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pwd.sendKeys("Bindu@28");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
