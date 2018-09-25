package cucumberTests;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = { "junit:junitResult.xml" }
		, features = "Feature"
		, glue={"stepDefinitions"}
		, tags= {"@TID1001REV0.2.0"}
		)
public class Test_ALM_Runner {
}
	