package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class LoginPage extends BaseClass{
	
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
	
	@FindBy(xpath="//*[contains(text(),'Login failed! Please ensure the username and password are valid.')]")
	WebElement invalidPswd;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnLogin() {
		clickElement(MainMenu);
		clickElement(Login);
		 
	}
	public void Login(String username, String password) throws Exception {
			
		this.username.sendKeys(username);	
		this.password.sendKeys(password);
		clickElement(submit);
		Thread.sleep(5000);
	}
	
	public String invalidPassword() {
		String actual=invalidPswd.getText();
		return actual;
		
		
	}
	
		

		
		
		
		
		
		
		
		
}
	
	
	


