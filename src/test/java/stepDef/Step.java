package stepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import baseClass.base;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;
import pageObject.LoginPage;

public class Step extends base{

	LoginPage lp;
	HomePage hp;
	
	@Given("User selects {string}")
	public void user_selects(String browser) {
		    
	        if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            setDriver(new ChromeDriver());

	        } else if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            setDriver(new FirefoxDriver());
	        }
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {

		getDriver().get(url);
        lp = new LoginPage(base.getDriver()); 
        hp = new HomePage(base.getDriver());

	}

	@And("User enters {string} and {string}")
	public void user_enters_and(String email, String password) {

		lp.enterUsername(email);
		lp.enterPassword(password);
	}
	


	@When("User click on login button")
	public void user_click_on_login_button() {

		lp.clickLogin();

	}

	@Then("Page current url should be {string}")
	public void page_current_url_should_be(String urlExpec) {

		System.out.println(getDriver().getCurrentUrl());
		String urlAct = getDriver().getCurrentUrl();
		Assert.assertEquals(urlAct, urlExpec);
	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {

		Thread.sleep(1000);
		hp.clickMenu();
		Thread.sleep(1000);
		hp.clickLogout();

	}

	@Then("close browser")
	public void close_browser() {

		 if (getDriver() != null) {
	        	getDriver().quit();
	        	unload();
	        }
	}

}
