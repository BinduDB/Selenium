package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//       WebElement usn= driver.findElement(By.xpath("//input[@type=\"text\"]"));		
//       usn.sendKeys(Keys.CONTROL+"a");
//       usn.sendKeys(Keys.BACK_SPACE);
		
		
		 String windowid=driver.getWindowHandle();
		 System.out.println(windowid);
		 
		 
       

	}

}
