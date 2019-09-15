package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/Features"},
		glue = { "StepDefinition" }, monochrome = true,
		tags= {},
		plugin= {"pretty","html:target/EntireCourse","json:target/EntireCourse.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)
public class TestRunner{

}
