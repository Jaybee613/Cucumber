package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import utilsPackage.GlobalBrowser;

@RunWith(Cucumber.class)
public class LoginSteps extends GlobalBrowser {

	@Given("^User is on Login page \"([^\"]*)\"$")
	public void AccessLoginPage(String url) throws Throwable {

		getDriver().manage().window().maximize();
		getDriver().get(url);
		System.out.println("Opened FB1");
		CloseDriver();
	}

	@When("^User enters username, password and Logs in$")
	public void EnterLoginPage() throws Throwable {
		getDriver().get("http://www.amazon.in");
		System.out.println("Print When");
		CloseDriver();
	}

	@Then("^Home page is displayed$")
	public void ValidateHomePage() throws Throwable {
		System.out.println("Print Then11");

	}

}
