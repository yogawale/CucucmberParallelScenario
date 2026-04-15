package baseClass;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.LoginPage;

public class base {
	
    private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
	
    //setter
    public static void setDriver(WebDriver driver) {
    		tdriver.set(driver);
    }
    
    //getter
    public static WebDriver getDriver() {
    	return tdriver.get();
    }
    
    public static void unload() {
    	tdriver.remove(); // clean ThreadLocal
    }
    
}
