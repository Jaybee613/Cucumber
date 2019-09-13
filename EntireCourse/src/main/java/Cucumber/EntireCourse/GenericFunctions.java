package Cucumber.EntireCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericFunctions {

	public WebDriver GlobalDriver;

	public void InitiateDriver() {
		
		GlobalDriver = new ChromeDriver();
		GlobalDriver.get("http://www.amazon.in");

	}

}
