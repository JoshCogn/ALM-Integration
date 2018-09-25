package cucumberTests;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinitions"}
		,dryRun = false	
		,monochrome = false
		,tags = {"@Initial"}
		)

public class NanTestRunner {

}