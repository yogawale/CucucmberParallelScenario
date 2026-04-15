package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver lDriver;
	
	public HomePage(WebDriver rDriver) {
		
		lDriver = rDriver;
		PageFactory.initElements(rDriver,this);
	}
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement menu;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement logOut;
	
	public void clickMenu() {
		menu.click();
	}
	
	public void clickLogout() {
		logOut.click();
	}
	
}
