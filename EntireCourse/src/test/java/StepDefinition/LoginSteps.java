package StepDefinition;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogLevelMapping;

import Cucumber.EntireCourse.GenericFunctions;
import Cucumber.EntireCourse.GlobalBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginSteps extends GlobalBrowser {

	// private static Logger log = new Logger(LoginSteps.class.getName());

	@Given("^User is on Login page \"([^\"]*)\"$")
	public void AccessLoginPage(String url) throws Throwable {

		// WebDriver FacebookPage = new ChromeDriver();
		getDriver().manage().window().maximize();
		getDriver().get(url);
		System.out.println("Opened FB1");
		//CloseDriver();

	}

	@When("^User enters username, password and Logs in$")
	public void EnterLoginPage() throws Throwable {
		//GenericFunctions GenericObject = new GenericFunctions();
		//GenericObject.InitiateDriver();
		System.out.println("Print When");

	}

	@Then("^Home page is displayed$")
	public void ValidateHomePage() throws Throwable {
		System.out.println("Print Then11");

	}

}
