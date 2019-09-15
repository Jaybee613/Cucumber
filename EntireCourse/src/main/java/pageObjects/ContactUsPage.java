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
public class ContactUsPage extends BasePage{

	public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
	
}
