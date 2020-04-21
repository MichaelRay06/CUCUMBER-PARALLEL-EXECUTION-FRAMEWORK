/*
 * package cukes.grid.stepDefinations;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class Product_SearchTest { WebDriver driver;
 * 
 * 
 * 
 * 
 * 
 * @Given("^I am on Carguruji on \"([^\"]*)\" browser$") public void
 * i_am_on_Carguruji_on_browser(String browserName) throws Throwable {
 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.NANOSECONDS);
 * driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 * 
 * driver.get("http://carguruji.com/shop/");
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * @Then("^I coud vrify the page tile as \"([^\"]*)\"$") public void
 * i_coud_vrify_the_page_tile_as(String pageTitle) throws Throwable { String
 * actualTitle= driver.getTitle(); Assert.assertEquals(actualTitle, pageTitle,
 * "MESSAGE>>>>> Page title not march");
 * driver.findElement(By.cssSelector("a.login")).click();
 * 
 * 
 * 
 * }
 * 
 * @When("^I then logged in the site with user name as \"([^\"]*)\" password as \"([^\"]*)\"$"
 * ) public void i_logged_in_the_site_with_user_name_as_password_as(String
 * emailAddr, String passwDdAddr) throws Throwable { WebElement emalBox=
 * driver.findElement(By.name("email")); WebElement passwordBox=
 * driver.findElement(By.name("passwd")); WebElement singIN=
 * driver.findElement(By.id("SubmitLogin")); emalBox.sendKeys(emailAddr);
 * passwordBox.sendKeys(passwDdAddr); singIN.click();
 * 
 * 
 * 
 * }
 * 
 * 
 * @Then("^I verify my  account title text as \"([^\"]*)\"$") public void
 * i_verify_my_account_title_text_as(String myAccountTitleText) throws Throwable
 * { String actualAccountText =
 * driver.findElement(By.cssSelector("h1.page-heading")).getText();
 * Assert.assertEquals(actualAccountText, myAccountTitleText,
 * "MESSAGE>>>>> Acoount text title do not march");
 * 
 * 
 * 
 * }
 * 
 * @And("^I search for desired product as  \"([^\"]*)\"$") public void
 * i_search_for_desired_product_as(String searchProduct) throws Throwable {
 * driver.findElement(By.id("search_query_top")).clear();
 * driver.findElement(By.id("search_query_top")).sendKeys(searchProduct);
 * driver.findElement(By.name("submit_search")).click();
 * 
 * 
 * 
 * 
 * }
 * 
 * @Then("^I verifyed the serched product as \"([^\"]*)\"$") public void
 * i_verifyed_the_serched_product_as(String vrifyProduct) throws Throwable {
 * String actualSearch
 * =driver.findElement(By.cssSelector("span.lighter")).getText();
 * Assert.assertEquals(actualSearch, vrifyProduct,
 * "MESSAGE>>>>> product search not march");
 * 
 * 
 * 
 * }
 * 
 * }
 */