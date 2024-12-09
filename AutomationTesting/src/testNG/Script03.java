package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Script03 
{

	@Test
	
	public void signup()
	{
		System.out.println("Signup is sucessfully");
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		Assert.fail();
		System.out.println("login is sucessfully");
	}
	
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("homepage is sucessfully");
	}
	
	@Test(dependsOnMethods = "homepage")
	public void logout()
	{
		System.out.println("logout is sucessfully");
	}
	
	
	
}
