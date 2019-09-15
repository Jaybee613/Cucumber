package Cucumber.EntireCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalBrowser {

	public static WebDriver driver;

	public WebDriver getDriver() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		return driver;

	}

	public void CloseDriver() {
		driver.close();
		driver.manage().deleteAllCookies();
		driver = null;
	}
}
