package cukes.grid.parallel.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="scr/test/resources/features/product_search.feature",
		glue="cukes.grid.stepDefinations"
		
		
		
		)

public class ProductSearchRunnerTest {
	
	@Test
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}
