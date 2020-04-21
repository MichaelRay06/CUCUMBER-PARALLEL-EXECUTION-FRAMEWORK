package cukes.grid.stepDefinations;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cukes.grid.extent.ExtentManager;
import cukes.grid.extent.ExtentTestManager;

public class SearchOnChromeStep extends BaseStepsTest{
	
	protected Scenario scenario;
	static String scenarioName;
	static int x=0;
	
	@Before
	public void beforeTest(Scenario  scenario) {
		x=x+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		ExtentTestManager.startTest("Scenario Number: "+x+": " + scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO, "Scenario started : -" + scenario.getName() );
		
	}


@After
public void tearDown(Scenario scenario) {
	if(scenario.isFailed()) {
		ExtentTestManager.logFail("Scenario Failed");
	ExtentTestManager.addScreenShotsOnFailure();
	
          }else  {
        	  ExtentTestManager.logPass("ExtentTestManager Passed");
          }
	
	ExtentManager.getReporter().flush();
	stopDriver();
	
	
}


	

	@Given("^I am on Carguruji site on\"([^\"]*)\"$")
	public void i_am_on_Carguruji_site_on(String browserName) throws Throwable {

		startWebDriver(browserName);
		getURL("http://carguruji.com/shop/login?back=my-account");
	}

	@Then("^I coud vrify the page tile$")
	public void i_coud_vrify_the_page_tile() throws Throwable {
		driver.getTitle().contentEquals("Contact us - CarGuruji Shop");
		driver.findElement(By.cssSelector("a.login")).click();

	}

	@When("^I logged in the site with user name and password$")
	public void i_logged_in_the_site_with_user_name_and_password() throws Throwable {

		driver.findElement(By.id("email")).sendKeys("bfatogun@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("sonsofgod");
		driver.findElement(By.id("SubmitLogin")).click();

	}
	@Then("^I verify my account title text as \"([^\"]*)\"$")
	public void i_verify_my_account_title_text_as(String ACCOUNT) throws Throwable {
		driver.findElement(By.cssSelector("h1.page-heading")).getText().contains(ACCOUNT);

	}

	@And("^I search for desired product as \"([^\"]*)\"$")
	public void i_search_for_desired_product_as(String blouse) throws Throwable {
		driver.findElement(By.cssSelector("input#search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(blouse);

	}

	@Then("^I click to make product search$")
	public void i_click_to_make_product_search() throws Throwable {
		driver.findElement(By.name("submit_search")).click();
	}

	@Then("^I verifyed the serched product$")
	public void i_verifyed_the_serched_product() throws Throwable {
		driver.findElement(By.cssSelector("span.lighter")).getText().contains("BLOUSE");
	}

	@Then("^I click on whish list link$")
	public void i_click_on_contact_us_link() throws Throwable {
		driver.findElement(By.cssSelector("i.icon-heart ")).click();
	}

	@And("^I named my whish item$")
	public void I_named_my_whish_item() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("yes");

	}

	@And("^I clicked on save button$")
	public void i_clicked_on_save_button() throws Throwable {
		driver.findElement(By.id("submitWishlist")).click();

	}

	@Then("^I verified my saved list item$")
	public void i_verified_my_saved_list_item() throws Throwable {
		driver.findElement(By.cssSelector("td:nth-of-type(1) > a")).getText().contains("yes");

	}

	@Then("^I deleted the saved list item$")
	public void I_deleted_the_saved_list_item() throws Throwable {
		driver.findElement(By.cssSelector("i.icon-remove")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
}



