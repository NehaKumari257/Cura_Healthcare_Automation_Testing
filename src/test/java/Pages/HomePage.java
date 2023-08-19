package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//*[@class='btn btn-dark btn-lg toggle']")
	WebElement menuclick;
	
	@FindBy(xpath="//*[contains(text(),'Home')]")
	WebElement clickHome;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement clickOnLogin;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver,this );
		
	}
    public void clickMenu() {
		
	    clickElement(menuclick);
	}
    public void clickhome() {
		
	    clickElement(clickHome);
	}
    public void clickLogin() {
    	
         clickElement(clickOnLogin);
    	
    }

}
