package ca.rpra.automation.page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

public class ManifestPage extends BasePage{
	
	private WebDriver driver;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name= '󰐕 New Manifest'])[2]")
	private WebElement newManifest;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement searchField;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])")
	private WebElement searchText;
	
	@FindBy(xpath="(//*[@name='Select Generator'])[3]")
	private WebElement searchGeneratorText;
	
	@FindBy(xpath="(//*[@name='Select Carrier'])[3]")
	private WebElement searchCarrierText;
	
	@FindBy(xpath="(//*[@name='Select Intended Receiver'])[3]")
	private WebElement searchReceiverText;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Generator'])[5]")
	private WebElement selectGeneratorButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select'])[2]")
	private WebElement selectButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Carrier'])[6]")
	private WebElement searchCarrierButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Intended Receiver'])[6]")
	private WebElement searchReceiverButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Next - Add Waste Information  >\"])[2]")
	private WebElement addWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])")
	private WebElement selectWasteField;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Select Waste\"]")
	private WebElement selectWaste;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[5]")
	private WebElement shippingName;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[7]")
	private WebElement quantity;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"-- \"])[7]")
	private WebElement unit;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='kg'])[2]")
	private WebElement unitKg;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Ready for Shipment'])[3]")
	private WebElement readyForShipment;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Waste']")
	private WebElement wasteTab;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vehicle']")
	private WebElement vehicleTab;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[4]")
	private WebElement vehicleRegNumber;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2]")
	private WebElement vehicleProvince;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Sign Manifest'])[2]")
	private WebElement signManifest;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@value='checkbox, not checked, off'`]")
	private WebElement signConsentCheckBox;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm'])[2]")
	private WebElement signConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Close'])[2]")
	private WebElement closeConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm Drop-Off'])[2]")
	private WebElement confirmDropOff;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Complete Drop-Off'])[2]")
	private WebElement completeDropOff;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages']")
	private WebElement verticalScrollBar;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept']")
	private WebElement acceptWasteButton;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse']")
	private WebElement refuseWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Does not meet acceptance criteria'])[2]")
	private WebElement refusalReasonAcceptance;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='I am partially refusing this waste.']/XCUIElementTypeOther/XCUIElementTypeOther")
	private WebElement partialRefusalCheckbox;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[1]")
	private WebElement quantityRefused;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[2]")
	private WebElement quantityAccepted;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement unitRefused;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6]")
	private WebElement unitAccepted;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Copy Quantity Shipped']")
	private WebElement copyQuantityShipped;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name='RNE__Input__text-input']")
	private WebElement qunatityReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement unitReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[5]")
	private WebElement handlingCode;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept Waste']")
	private WebElement acceptWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse Waste']")
	private WebElement refuseWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=' Add Another Waste']")
	private WebElement addAnotherLineItem;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Return\"]")
	private WebElement returnButton;
	
	public ManifestPage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
		
	}

	
	public void createManifest() {
		
	
		

		clickCustom(newManifest);
		
		//Generator
		clickCustom(searchGeneratorText);
		
		sendKeysCustom(searchText,"ON001173125" );
		clickCustom(selectGeneratorButton);
		clickCustom(selectButton);

		
		//carrier
		
		clickCustom(searchCarrierText);
		
		sendKeysCustom(searchText,"AY Chemicals");
		clickCustom(searchCarrierButton);
		clickCustom(selectButton);
		
		
		//Receiver
		
		clickCustom(searchReceiverText);
		
		sendKeysCustom(searchText,"AY Chemicals");
		clickCustom(searchReceiverButton);
		clickCustom(selectButton);
		
		
		//add waste
		
		clickCustom(addWasteButton);
		clickCustom(selectWasteField);
		returnButton.click();
		clickCustom(selectWaste);
		clickCustom(selectButton);
		
		
		//enter waste details
		shippingName.clear();
		shippingName.sendKeys("Shipping name");
		
		shippingName.sendKeys(Keys.RETURN);
		
		quantity.clear();
		sendKeysCustom(quantity,"350");
		quantity.sendKeys(Keys.RETURN);
		unit.clear();
		
		
		//sendKeysCustom(quantity,Keys.RETURN);
		unit.sendKeys(Keys.RETURN);//didn't work
		//unitKg.click();
		
		readyForShipment.click();
		
		
		
	}
	
	//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
	//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
	//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();

}
