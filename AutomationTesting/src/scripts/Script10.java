package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.87.42:9007/");
		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("Fresher@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Fresher@2024");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-block btn-login\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class=\"fa fa-user\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary pull-right\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("Bindu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]")).sendKeys("bindu32s@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[3]")).sendKeys("Bindu123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=\"field-ta\"]")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[4]")).sendKeys("9345615332");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"btn btn-success\"]")).click();
	}

}
