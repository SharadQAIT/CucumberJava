package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/loginDemo.feature", glue = { "StepDefinitions" }, 
monochrome=true, plugin= {"pretty","html:target/HTMLReports",
						   "json:target/JSONReports/report.json",
						   "junit:target/JunitReports/report.xml"})
public class TestRunner {

}
