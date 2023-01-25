package ca.rpra.automation;

import java.util.concurrent.TimeUnit;

import ca.rpra.automation.page.LoginPage;
import ca.rpra.automation.page.ManifestPage;
import ca.rpra.automation.utils.BaseTest;

import org.testng.annotations.Test;

public class TestCaseOne extends BaseTest{
	
	@SuppressWarnings("deprecation")
	@Test
	public void tC1() {

	getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			//driver.resetApp();
		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("jose.bingham@jyplo.com","James@rick1");
		
		ManifestPage manifestPage= new ManifestPage(getDriver());
		
		manifestPage.createManifest();

	}

}
