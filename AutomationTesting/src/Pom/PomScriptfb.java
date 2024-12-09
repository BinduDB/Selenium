package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScriptfb 
{
	@FindBy(id = "email")
	private WebElement usn;
	
	
	
	public PomScriptfb (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public void user(String UN)
	{
		usn.sendKeys(UN);
	}
	
}
