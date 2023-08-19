package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class ValidateButton extends BaseClass{
	
	@FindBy(xpath="(//*[contains(text(),'Make Appointment')])[1]")
	WebElement Click_MakeAppointment;
	
	public ValidateButton() {
		PageFactory.initElements(driver,this );
		
	}
	
	public WebElement getAppointmentButton() {
		return Click_MakeAppointment;
	}
	
	

}
