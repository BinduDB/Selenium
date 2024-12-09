package Assessmentpro;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumtask
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		 
		 ArrayList<WebElement> newtab =new ArrayList<WebElement>();
		 
		 newtab.add(driver.findElement(By.xpath("(//a[@href=\"https://www.nuget.org/packages/Selenium.WebDriver\"])[1]")));
		 newtab.add(driver.findElement(By.xpath("//a[@href=\"https://rubygems.org/gems/selenium-webdriver/versions/4.26.0\"]")));
		 newtab.add(driver.findElement(By.xpath("//a[@href=\"https://github.com/SeleniumHQ/selenium/blob/trunk/py/CHANGES\"]")));
		 newtab.add(driver.findElement(By.xpath("//a[@href=\"https://github.com/SeleniumHQ/selenium/blob/trunk/javascript/node/selenium-webdriver/CHANGES.md\"]")));
		
		 Actions a=new Actions(driver);
		 for(WebElement ele:newtab)
		 {
			 a.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).perform(); 
			 Thread.sleep(3000);
		 }
		 
		 for (String handle : driver.getWindowHandles())
		 {
             driver.switchTo().window(handle);
            String title = driver.getTitle();
             System.out.println(title);
             Thread.sleep(1000);
             driver.close();
		  }

		 
		 
		 
	}

}
