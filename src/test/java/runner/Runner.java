package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\resources",
		glue="stepdef",
		monochrome=true,
		tags =("@myTC2"),
		dryRun=false
		)

public class Runner {
	
}
