package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("songs");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		driver.findElement(By.xpath("class=\"style-scope ytd-moving-thumbnail-renderer fade-in\"")).click();
		
		
		//driver.findElement(By.className("ytd-searchbox")).sendKeys("songs");
	}

}
