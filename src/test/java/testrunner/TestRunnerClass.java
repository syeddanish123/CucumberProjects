package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		   features= {"src/test/resources/tc001.feature"},
		   glue = {"stepdefinitions"},
		   plugin = {"pretty","html:CucumberReports/CucumberReports.html"},
		   dryRun=false,
		   monochrome=true		   
		)
public class TestRunnerClass {

	
	
}
