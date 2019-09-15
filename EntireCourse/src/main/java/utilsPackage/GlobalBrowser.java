package utilsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.ContactUsPage;

public class GlobalBrowser {

	public static WebDriver driver;
	public ContactUsPage contactUsPage;

	public WebDriver getDriver() {
		try {

			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
		return driver;
	}

	public void CloseDriver() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver = null;
	}
}
