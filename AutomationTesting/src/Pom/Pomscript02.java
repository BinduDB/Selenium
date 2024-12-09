package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomscript02

{
	@FindBy(xpath = "//input[@placeholder=\"Search for Products, Brands and More\"]")
	 private WebElement Search;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement sub;
	
	@FindBy(xpath = "//img[@alt=\"Apple iPhone 16 (Black, 128 GB)\"]")
	private WebElement Img;
	
	@FindBy(xpath = "class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"")
	private WebElement buynow;
	
	
	public Pomscript02(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void srch(String s)
	{
		Search.sendKeys(s);
	}
	public void submit() {
		sub.click();
	}
	
	public void img()
	{
		Img.click();
	}
	
	public void but() 
	{
		buynow.click();
	}

	
	
}
