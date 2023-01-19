package ca.rpra.automation.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(this.driver, this);
	}
	
	public BasePage() {
				
		PageFactory.initElements(this.driver, this);
	}
	public void waitForVisible(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		WebDriverWait wait = new WebDriverWait(driver, dur);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public void waitForClickable(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		WebDriverWait wait = new WebDriverWait(driver, dur);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public void sendKeysCustom(WebElement ele, String text) {
		waitForVisible(ele, 5);
		ele.sendKeys(text);
		
	}
	
	public void clickCustom(WebElement ele) {
		waitForClickable(ele, 10);
		ele.click();
		
	}

}
