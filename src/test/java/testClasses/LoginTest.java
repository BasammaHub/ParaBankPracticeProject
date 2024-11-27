package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass
{
	@Test
	public void logintestCase()
	{
		
		lp.enterUN("Nadine1");
		lp.enterpassword("islood9u2gu3l");
		lp.login();
		
		Assert.assertTrue(lp.isloginSuccess() , "Login is not successfull");
		
	}

}
