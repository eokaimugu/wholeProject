package myTestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue="stepDefinitions",
		//dryRun=true,
		monochrome=true
		
		)

public class TestRunner {

}
