package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/cb.html");
	List<WebElement> links=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	int count=links.size();
	for(int i=0; i<count;i++)
	{
		if(i%2==1) 
		{		
			WebElement	c=links.get(i);
			c.click();
		}
	}
	for(int i=count-1; i>=0;i--)
	{
		if(i%2==1)
		{
		  WebElement c=links.get(i);
		 c.click();
		}
	}
	Thread.sleep(1000);
		

	}

}
