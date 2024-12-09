package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement usn=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		  String av= usn.getAttribute("id");
		 System.out.println(av);
		 
		 
		String tagname= usn.getTagName();
		System.out.println(tagname);
		
	 String font=usn.getCssValue("background-size");
	 System.out.println(font);
	 
	 WebElement ele=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
	  String text=ele.getText();
	  System.out.println(text);
	  
	  
	 

	}

}
