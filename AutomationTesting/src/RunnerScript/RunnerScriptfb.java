package RunnerScript;

import org.testng.annotations.Test;

import GenericScripts.GenericScriptfb;
import Pom.PomScriptfb;

public class RunnerScriptfb extends GenericScriptfb

{
	@Test
	public void Validdata()
	{
		
		PomScriptfb fb=new PomScriptfb(driver);
		fb.user("Bindu");
		
	}
	
}
