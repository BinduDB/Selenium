package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/JSE.html");
		Thread.sleep(2000);
		WebElement	ele=driver.findElement(By.xpath("//input[@class=\"c1\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('a1').value='hello'");
		js.executeScript("arguments[0].value=' '",ele);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
