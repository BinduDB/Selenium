package scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	
    	
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wrist watches");
    	driver.findElement(By.id("nav-search-submit-button")).click();
    	
    	WebElement leather=	driver.findElement(By.xpath("//span[text()='Leather']"));
		leather.click();
		
		WebElement Fast=driver.findElement(By.linkText("Fastrack"));
		Fast.click();

		//WebElement Second=driver.findElement(By.xpath("class=\"a-section aok-relative s-image-tall-aspect\""));
		//Second.click();
		
		WebElement Second=driver.findElement(By.linkText("Mens Analog White Dial Brown Band Leather Watch"));
		Second.click();
	}

}
