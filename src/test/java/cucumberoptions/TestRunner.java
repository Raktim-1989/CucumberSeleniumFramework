package cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/TestDataScenarioOutline.feature",
glue = "stepdefinition", dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
