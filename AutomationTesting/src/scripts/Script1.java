package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		String	title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=	driver.getPageSource();
		System.out.println(src);
	
		driver.close();
		driver.quit();
		
		
		
		
		
		
		

	}

}
