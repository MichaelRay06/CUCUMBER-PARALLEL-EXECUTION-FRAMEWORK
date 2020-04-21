package cukes.grid.stepDefinations;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cukes.grid.extent.ExtentManager;
import cukes.grid.extent.ExtentTestManager;



public class SearchTest extends BaseStepsTest {
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


	
	

	
	@Given("^I am on gurigisite using \"([^\"]*)\"$")
	public void i_am_on_gurigisite_using(String browaseName) throws Throwable {
		ExtentTestManager.logInfo("Launching Browser " +  browaseName);
		startWebDriver(browaseName);
		
		
		ExtentTestManager.logInfo("Get the Site URL ADDRESS " );
		getURL("http://carguruji.com/shop/login?back=my-account");
		
		
	}
	

	@And("^I log in to site with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_log_in_to_site_with_and(String userName,  String password) throws Throwable {
		
		ExtentTestManager.logInfo("Type In The User Name To LogIN " +  userName);
		getDriver().findElement(By.id("email")).sendKeys(userName);
		
		ExtentTestManager.logInfo("Type In The User Password To LogIN " +  password);
		getDriver().findElement(By.id("passwd")).sendKeys(password);
		
		ExtentTestManager.logInfo("Click the login button");
		getDriver().findElement(By.id("SubmitLogin")).click();
	   
	}

	@And("^I serch \"([^\"]*)\"$")
	public void i_serch(String item) throws Throwable {
		
		ExtentTestManager.logInfo("Type search item into the search text field " +  item);
		getDriver().findElement(By.id("search_query_top")).sendKeys(item);
		
		ExtentTestManager.logInfo("Click to search item");		
		getDriver().findElement(By.name("submit_search")).click();
	   
	}

	@Then("^I verify search \"([^\"]*)\"$")
	public void i_verify_search(String product) throws Throwable {
		ExtentTestManager.logInfo("Confirm the search product as " +  product);
		getDriver().findElement(By.cssSelector("span.lighter")).getText().contains(product);

	  
	}


}
