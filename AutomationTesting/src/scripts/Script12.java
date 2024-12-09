package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/main.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		usn.sendKeys("admin");
		Thread.sleep(1000);
		//driver.switchTo().frame(0); by using index 
		//driver.switchTo().frame("f1"); by using id
		WebElement f1=driver.findElement(By.xpath("//iframe[@id=\"f1\"]"));
		driver.switchTo().frame(f1);
		WebElement psw=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		psw.sendKeys("admin@123");
	}

}
