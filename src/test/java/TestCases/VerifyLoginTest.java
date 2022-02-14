package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;

import Resources.BaseClass;

public class VerifyLoginTest extends BaseClass {
	@Test(dataProvider="getData")
	public void LaunchBrowser(String username,String password) throws IOException {
		driver = InitialiseDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObjects obj = new LoginPageObjects(driver);
		
		obj.EnterUserName().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.ClickLoginButton().click();

	}
	


	@DataProvider
	public Object[][] getData() {
		// Array of Objects
		Object[][] a1 = new Object[2][2];
		a1[0][0] = "test1";
		a1[0][1] = "pass1";
		a1[1][0] = "test2";
		a1[1][1] = "pass2";
	
		return a1;

	}
}
