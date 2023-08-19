package TestCase;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.HomePage;

public class HomepageTestCase extends BaseClass{
	
@Test
	
	public void tcHome01() throws Exception {
		
		HomePage hp=new HomePage();
		
		hp.clickMenu();
		Thread.sleep(5000);
		hp.clickhome();
		hp.clickMenu();
		hp.clickLogin();
			
	}	

}
