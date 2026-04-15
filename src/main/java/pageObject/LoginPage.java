package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lDriver;
	
	public LoginPage(WebDriver rDriver){
		
		PageFactory.initElements(rDriver,this);
		lDriver = rDriver;
	}

	@FindBy(id="user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;
	
	@FindBy(id = "login-button")
	WebElement logIn;
	
	public void enterUsername(String email) {
		userName.clear();
		userName.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passWord.clear();
		passWord.sendKeys(password);
	}
	
	public void clickLogin() {
		logIn.click();
	}
	
}
