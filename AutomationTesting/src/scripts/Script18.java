package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/All/Desktop/dropdown.html");
	WebElement dd=driver.findElement(By.id("celebrites"));
	Select s=new Select(dd);
	if(s.isMultiple())
	{
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("j");
		Thread.sleep(1000);
		s.selectByVisibleText("Samantha");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		Thread.sleep(1000);
		s.deselectByValue("j");
		Thread.sleep(1000);
		s.deselectByVisibleText("Samantha");
	}
	else
	{
		System.out.println("The dropdown is single select");
	}

	}

}
