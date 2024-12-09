package scripts;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlllinksScreenShot
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement>  links=driver.findElements(By.xpath("//img"));
		int count=links.size();
		for(int i=0;i<count;i++)
		{
			File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File perm=new File("./Screenshots/def11.png");
			FileHandler.copy(temp, perm);
			
           
			 driver.close();
			
		}
	}

}
