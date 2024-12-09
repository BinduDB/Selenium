package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/main1.html");
	WebElement	usn=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	usn.sendKeys("Admin");
	driver.switchTo().frame(0);
	 WebElement email=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	 email.sendKeys("Admin@123");
	 Thread.sleep(1000);
	 
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	 WebElement mob=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	 mob.sendKeys("9363432545");
	 driver.switchTo().frame(0);
	 Thread.sleep(1000);
	 WebElement em=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	 em.sendKeys("ad@gmail.com");
	 
	 

	}

}
