package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Script5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("2343u");
		
		driver.findElement(By.name("pass")).sendKeys("Bin123");
		
		driver.findElement(By.name("login")).click();
		

		//System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
	}

}
