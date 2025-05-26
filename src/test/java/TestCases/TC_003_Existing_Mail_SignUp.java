package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignUp_Login_Page;
import TestBase.setupClass;

public class TC_003_Existing_Mail_SignUp extends setupClass {
	@Test
	public void ExistingMailSignUp() {
		HomePage homePage = new HomePage(driver);
		SignUp_Login_Page signUpLoginPage=new SignUp_Login_Page(driver);
		homePage.clickOnLoginSignUp();
		signUpLoginPage.existingMailSignUp();
		
	}
}
