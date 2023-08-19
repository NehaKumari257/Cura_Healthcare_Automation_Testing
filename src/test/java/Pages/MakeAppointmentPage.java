package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;

public class MakeAppointmentPage extends BaseClass{
	
	@FindBy(xpath="//*[@class='btn btn-dark btn-lg toggle']")
	WebElement MainMenu;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement Login;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='btn-login']")
	WebElement submit;
	
	@FindBy(xpath="//select[@name='facility']")
	WebElement selfacility;
	
	@FindBy(xpath="//input[@name='hospital_readmission']")
	WebElement clickCheckBox;
	
	@FindBy(xpath="//input[@id='radio_program_medicare']")
	WebElement medicare;
	
	@FindBy(xpath="//input[@id='radio_program_medicaid']")
	WebElement medicaid;
	
	@FindBy(xpath="//input[@id='radio_program_none']")
	WebElement none;
	
	@FindBy(xpath="//input[@id='txt_visit_date']")
	WebElement datepicker;
	
	@FindBy(xpath="//*[text()='28']")
	WebElement selectDate;
	
	@FindBy(xpath="//*[@id='txt_comment']")
	WebElement TypeComment;
	
	@FindBy(xpath="//button[@id='btn-book-appointment']")
	WebElement bookAppintment;
	
	@FindBy(xpath="//*[contains(text(),'Go to Homepage')]")
	WebElement BackTo_Home;
	
	@FindBy(xpath="//*[contains(text(),'History')]")
	WebElement click_history;
	
	@FindBy(xpath="//*[contains(text(),'Go to Homepage')]")
	WebElement Go_to_Homepage;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement logout;
	
	public MakeAppointmentPage() {
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnLogin() {
		clickElement(MainMenu);
		clickElement(Login);
		 
	}
	*/
	public void Login(String username, String password) throws Exception {
			
		this.username.sendKeys(username);	
		this.password.sendKeys(password);
		clickElement(submit);
		Thread.sleep(5000);
	}
	public void MakeAppointment1_madicareTokyo(String selectfacility, String commentLine  ) {
		
		Select sel=new Select(selfacility);
		sel.selectByValue(selectfacility);
		clickElement(clickCheckBox);
		clickElement(medicare);
		//clickElement(selectDate);
		clickElement(datepicker);
		clickElement(selectDate);
		//this.selectDate.sendKeys(date);
		this.TypeComment.sendKeys(commentLine);
		clickElement(bookAppintment);
		
	}
	
    public void MakeAppointment2_medicaidHongkong(String selectfacility, String commentLine  ) {
		
		Select sel=new Select(selfacility);
		sel.selectByValue(selectfacility);
		clickElement(clickCheckBox);
		clickElement(medicaid);
		//clickElement(selectDate);
		clickElement(datepicker);
		clickElement(selectDate);
		//this.selectDate.sendKeys(date);
		this.TypeComment.sendKeys(commentLine);
		clickElement(bookAppintment);
		
	}
     public void MakeAppointment3_noneSeoul(String selectfacility, String commentLine  ) {
		
		Select sel=new Select(selfacility);
		sel.selectByValue(selectfacility);
		clickElement(clickCheckBox);
		clickElement(none);
		//clickElement(selectDate);
		clickElement(datepicker);
		clickElement(selectDate);
		//this.selectDate.sendKeys(date);
		this.TypeComment.sendKeys(commentLine);
		clickElement(bookAppintment);
		
	}
     
     public void booking_History() {
    	 clickElement(BackTo_Home);
    	 clickElement(MainMenu);
    	 clickElement(click_history);
    	 clickElement(Go_to_Homepage);
    	 clickElement(logout);
     }
}
