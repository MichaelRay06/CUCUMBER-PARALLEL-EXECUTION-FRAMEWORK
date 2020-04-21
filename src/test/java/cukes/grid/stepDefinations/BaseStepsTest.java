package cukes.grid.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStepsTest {
	
protected WebDriver driver;
public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver> ();
public static WebDriver getDriver() {
	return dr.get();
}

public static void setWebDriver(WebDriver driver) {
	dr.set(driver);
}
	

	
	protected void startWebDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
			
			
		}
		setWebDriver(driver);
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
		
	}
	
	protected void getURL(String url) {
		getDriver().get(url);
		
	}
	protected void stopDriver() {
		getDriver().quit();
		
		
	}

}



