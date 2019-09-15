package StepDefinition;

import java.util.List;

import Cucumber.EntireCourse.GlobalBrowser;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps2 extends GlobalBrowser {

	@Given("^User is on another login page$")
	public void user_is_on_another_login_page(DataTable arg1) throws Throwable {
	    List<List<String>> URL = arg1.raw();
	    
		getDriver().manage().window().maximize();
		getDriver().get(URL.get(0).get(0));
		System.out.println("Opened via Datatable");
		
	}
	
	@Then("^Home page is ok$")
	public void home_page_is_ok() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getDriver().close();
	}
}
