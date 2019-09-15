/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author JayaBalaji
 *
 */
public class HomePage {

	public @FindBy(xpath = "//a[@id='contact-us']") WebElement link_ContactUs;
	
	public void ClickOnContactUsLink()
	{
		
	}
	
}
