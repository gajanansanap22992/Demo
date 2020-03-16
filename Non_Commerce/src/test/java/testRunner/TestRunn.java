package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		      features = ".//FeatureFiles/",
		      glue = "stepDefinitions",
		      dryRun=false,
		      monochrome=true,
		      plugin = { "pretty","json:target/cucumber.json"}
            
		     
		          )


public class TestRunn {

}
