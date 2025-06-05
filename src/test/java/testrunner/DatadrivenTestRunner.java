package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		     features = {"src/test/resources/parametrize.feature"},
		     glue= {"stepdefinitions"},		     
		     dryRun=false,
		     monochrome=true,
		     plugin={"pretty","html:CucumberReports/DataDrivenReports.html"}
		)
public class DatadrivenTestRunner {
       
}
