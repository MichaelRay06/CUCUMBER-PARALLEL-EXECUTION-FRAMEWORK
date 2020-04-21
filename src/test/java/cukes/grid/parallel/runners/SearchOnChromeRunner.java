package cukes.grid.parallel.runners;




import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="scr/test/resources/features/searchOnChrome.feature",
		glue="cukes.grid.stepDefinations"
		
		
		
		)

public class SearchOnChromeRunner {

	@Test
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}
