package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginSteps {

	@Given("^User is on Login page$")
	public void AccessLoginPage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver FacebookPage = new ChromeDriver();
		FacebookPage.manage().window().maximize();
		FacebookPage.get("https://www.facebook.com");
		System.out.println("Opened FB1");
	}

	@When("^User enters username, password and Logs in$")
	public void EnterLoginPage() throws Throwable {
		System.out.println("Print When 1");
	}

	@Then("^Home page is displayed$")
	public void ValidateHomePage() throws Throwable {
		System.out.println("Print Then11");

	}
}
