package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(
		features = "src/features",
		glue = {"firstmaven"},
		dryRun = false
)
@RunWith(Cucumber.class)
public class CucumberRunner {

}
