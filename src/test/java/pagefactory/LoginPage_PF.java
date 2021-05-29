package pagefactory;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	@FindBy(id = "name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;
	
	@FindBy(partialLinkText = "raghav")
	List myLinks;
	
	WebElement abc;

	@FindBy(how = How.ID,using ="name")
	WebDriver driver ;

	public LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterUsername(String username) {

		txt_username.sendKeys(username);


	}public void enterPassword(String password) {

		txt_password.sendKeys(password);

	}public void clickOnLogin() {

		btn_login.click();
	}
}