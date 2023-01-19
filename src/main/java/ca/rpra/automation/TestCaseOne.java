package ca.rpra.automation;

import java.util.concurrent.TimeUnit;

import ca.rpra.automation.page.LoginPage;
import ca.rpra.automation.page.ManifestPage;
import org.testng.annotations.Test;

public class TestCaseOne extends BaseTest{
	
	@SuppressWarnings("deprecation")
	@Test
	public void tC1() {

	getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			//driver.resetApp();
		LoginPage loginPage = new LoginPage(getDriver());

		//loginPage.loginDetails();
		
		ManifestPage manifestPage= new ManifestPage(getDriver());
		
		manifestPage.createManifest();

	}

}
