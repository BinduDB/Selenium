package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript 
{

	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement but;
	
	
	 
	public PomScript(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void user(String UN)
	{
		usn.sendKeys(UN);
	}
	public void passward(String PS)
	{
		pwd.sendKeys(PS);
	}
	public void login()
	{
		but.click();
	}
	
	
	
}
