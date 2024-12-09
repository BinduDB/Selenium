package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/All/Desktop/gg.html");
		
		
		//USN
		
		 WebElement usn=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")); 
		 if(usn.isDisplayed())
		 {
			 if(usn.isEnabled())
			 {
				 usn.sendKeys("admin");
			 }
			 else
			 {
				 System.out.println("usn is disabled");
			 }
		 }
		 else
		 {
			 System.out.println("usn is not displayed");
		 }
		 
		 //PWD
		 
		 WebElement pwd=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		 
		 if(pwd.isDisplayed())
		 {
			 if(pwd.isEnabled())
			 {
				 pwd.sendKeys("admin@123");
			 }
			 else
			 {
				 System.out.println("pwd is disabled");
			 }
		 }
		 else
		 {
			 System.out.println("pwd is not displayed");
		 }
		 
		 
		 
		 // Checkbox 
		 
	WebElement cb=driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
	if(cb.isDisplayed())
	{
		if(cb.isEnabled()) 
		{
			 if(cb.isSelected())
			{
				
			 System.out.println(" it is selected ");
			 cb.click();
			}
		}
		else
		{
			System.out.println("it is disabled");
		}
	}
	else
	{
		System.out.println("it is not displayed");
	}
	}
}