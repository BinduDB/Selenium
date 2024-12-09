package testNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script02
{
@Test(invocationCount = 1)
public void testcase()
{
	Reporter.log("hello");
	
}
@Test(enabled = false)
public void testcase1()
{
	Reporter.log("hello bindu");
	
}

}
