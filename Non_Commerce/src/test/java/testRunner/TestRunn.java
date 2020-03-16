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
		      plugin = { "pretty","html:target/cucumber","json:target/cucumber.json"}
            
		     
		          )


public class TestRunn {

}
