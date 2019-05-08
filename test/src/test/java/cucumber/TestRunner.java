package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"firstmaven"},
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
				},
		tags = "@smoke",
		dryRun = false
)

@RunWith(Cucumber.class)

public class TestRunner {

}
