package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature" ,glue= {"StepDefinition"},
monochrome = true , 
plugin = {"pretty","junit:target/junitReports/report.xml",
		            "json:target/jsonReports/report.json"})
public class TestRunner {

}
