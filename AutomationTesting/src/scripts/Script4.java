package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/S2.html");
		
		WebElement ele=driver.findElement(By.id("u1"));
		ele.sendKeys("Bindu");
		ele.clear();
		
		 WebElement ele1=driver.findElement(By.name("p1"));
		 ele1.sendKeys("Bin123");
		 ele1.clear();
		 
		 WebElement ele2=driver.findElement(By.className("c1"));
		 ele2.sendKeys("Bin123");
		 ele2.clear();
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Instagram 2024")).click();
		 //driver.findElement(By.partialLinkText("Instagram")).click();
		 
		 
		 
		

	}

}
