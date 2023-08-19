package TestCase;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;
import Pages.MakeAppointmentPage;

public class MakeAppointmentTestCase extends BaseClass{

@Test
	
    public void tc004BookAppointment() throws Exception {
       
    	LoginPage lp=new LoginPage();	
    	lp.clickOnLogin();
    	lp.Login("John Doe","ThisIsNotAPassword");
    	MakeAppointmentPage am=new MakeAppointmentPage();
    	am.MakeAppointment1_madicareTokyo("Tokyo CURA Healthcare Center", "hgahsHSIkhskhasLHS");
    	am.booking_History();
    }

@Test

    public void tc005BookAppointment() throws Exception {
	
   
	  LoginPage lp=new LoginPage();	
	  lp.clickOnLogin();
	  lp.Login("John Doe","ThisIsNotAPassword");
	  MakeAppointmentPage am=new MakeAppointmentPage();
	  am.MakeAppointment1_madicareTokyo("Hongkong CURA Healthcare Center", "jhdskdahkhajhdhasjahkha");
	  am.booking_History(); 
	 
   }
@Test

   public void tc006BookAppointment() throws Exception {
   
	LoginPage lp=new LoginPage();	
	lp.clickOnLogin();
	lp.Login("John Doe","ThisIsNotAPassword");
	MakeAppointmentPage am=new MakeAppointmentPage();
	am.MakeAppointment1_madicareTokyo("Seoul CURA Healthcare Center", "wueyruuokacbsalabsbhvahlv");
	am.booking_History();
}

	
}
