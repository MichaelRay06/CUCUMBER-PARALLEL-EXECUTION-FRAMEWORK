/*
 * package cukes.grid.utils;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.ie.InternetExplorerDriver; import
 * org.openqa.selenium.remote.DesiredCapabilities;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class BaseClass {
 * 
 * private WebDriver driver; public static ThreadLocal<WebDriver> dr = new
 * ThreadLocal<WebDriver>(); public static WebDriver getDriver() { return
 * dr.get();
 * 
 * } String browserName;
 * 
 * public static void setWebDriver(WebDriver driver) { dr.set(driver); }
 * 
 * 
 * 
 * protected void startWebDriver(String browserName) {
 * 
 * if ((browserName).equalsIgnoreCase("chrome")) {
 * WebDriverManager.chromedriver().setup();
 * 
 * if (driver == null) driver = new ChromeDriver();
 * driver.manage().window().maximize(); }
 * 
 * else if ((browserName).equalsIgnoreCase("firefox")) { //
 * WebDriverManager.firefoxdriver().setup();
 * System.setProperty("webdriver.gecko.driver", Constants.FIREFOXE_DRIVRE_PATH);
 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 * capabilities.setCapability("marionette", true); driver = new FirefoxDriver();
 * driver.manage().window().maximize(); }
 * 
 * else if ((browserName).equalsIgnoreCase("IE")) {
 * 
 * DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
 * System.setProperty("webdriver.ie.driver", Constants.IE_DRIVRE_PATH);
 * capabilities.setCapability("ignoreZoomSetting", true); driver = new
 * InternetExplorerDriver(capabilities); driver.manage().window().maximize(); }
 * setWebDriver(driver);
 * 
 * driver.manage().deleteAllCookies();
 * driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_TIME_OUT,
 * TimeUnit.SECONDS);
 * driver.manage().timeouts().implicitlyWait(Constants.PAGE_TIME_OUT,
 * TimeUnit.SECONDS);
 * 
 * 
 * 
 * } public void get(String url) {
 * 
 * }
 * 
 * public WebDriver shutDownDriver() { if (driver == null) driver.close();
 * driver.quit(); return driver;
 * 
 * } }
 */