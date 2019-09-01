package StepDefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginSteps {
	
	@Given("^User is on Login page \"([^\"]*)\"$")
	public void AccessLoginPage(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver FacebookPage = new ChromeDriver();
		FacebookPage.manage().window().maximize();
		FacebookPage.get(url);
		System.out.println("Opened FB1");
		FacebookPage.close();
	}

	@When("^User enters username, password and Logs in$")
	public void EnterLoginPage() throws Throwable {
		System.out.println("Print When 1");
	
	}

	@Then("^Home page is displayed$")
	public void ValidateHomePage() throws Throwable {
		System.out.println("Print Then11");

	}
	
	@Given("^User is on another login page$")
	public void user_is_on_another_login_page(DataTable arg1) throws Throwable {
	    List<List<String>> URL = arg1.raw();
	    
	    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver FacebookPage = new ChromeDriver();
		FacebookPage.manage().window().maximize();
		FacebookPage.get(URL.get(0).get(0));
		System.out.println("Opened via Datatable");
		
	}

	@Then("^Home page is ok$")
	public void home_page_is_ok() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
}
