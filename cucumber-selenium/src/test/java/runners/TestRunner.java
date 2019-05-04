package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
		        "html:target/site/cucumber-pretty",
		        "json:target/cucumber.json" },
		features = "src/test/resources/functionaltests", 
		glue = { "stepDefinitions" }
		)

public class TestRunner {
	
}
