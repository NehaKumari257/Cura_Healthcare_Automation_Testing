package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.ValidateButton;

public class Validate_ButtonTestcase extends BaseClass {
	
@Test
	
	public void validatecheckinButton() throws Exception {
	ValidateButton vb=new ValidateButton();
	Assert.assertTrue(validateElement(vb.getAppointmentButton()));
	}

}
