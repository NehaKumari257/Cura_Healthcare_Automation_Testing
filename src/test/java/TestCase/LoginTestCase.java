package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class LoginTestCase extends BaseClass {
	
	@Test
	
    public void tc002Login() throws Exception {
       
    	LoginPage lp=new LoginPage();	
    	lp.clickOnLogin();
    	lp.Login("John Doe","ThisIsNotAPassword");
    	
    }
	//******Negative Testcase************
	@Test
	public void tc003invalidPswd() throws Exception {
		LoginPage lp=new LoginPage();
		lp.clickOnLogin();
		lp.Login("John Doe", "12345678@");
		Assert.assertEquals("Login failed! Please ensure the username and password are valid.",lp.invalidPassword());
		
	}
	
	
	
	

}
