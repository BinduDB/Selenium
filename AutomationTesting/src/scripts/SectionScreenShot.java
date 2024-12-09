package scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SectionScreenShot 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Date d=new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		WebElement email=driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-none feed-carousel first-carousel\"]"));
		File temp=email.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshots/Section2.png");
		FileHandler.copy(temp, perm);
		driver.close();

	}

}
