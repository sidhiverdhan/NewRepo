package ca.rpra.automation.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ca.rpra.automation.utils.BasePage;
import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class LoginPage extends BasePage{

	@FindBy(xpath="//XCUIElementTypeTextField")
	private WebElement user_name;


	@FindBy(xpath="//XCUIElementTypeSecureTextField")
	private WebElement user_password;


	@FindBy(xpath ="//XCUIElementTypeButton[@name='Sign In']")
	 private WebElement signIn;
	
	public LoginPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginDetails() {
		
		sendKeysCustom(user_name,"jose");
		user_name.sendKeys("jose");
		user_name.clear();
		user_name.sendKeys("jose.bingham@jyplo.com");
		user_password.sendKeys("James@rick1");
		signIn.click();
		
	}

}
