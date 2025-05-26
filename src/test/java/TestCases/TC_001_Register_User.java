package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Registration_Page;
import PageObjects.SignUp_Login_Page;
import TestBase.setupClass;

public class TC_001_Register_User extends setupClass {
	@Test
	public void TC001_RegisterUser() {
		HomePage homePage = new HomePage(driver);
		SignUp_Login_Page signUpPage = new SignUp_Login_Page(driver);
		Registration_Page registrationPage=new Registration_Page(driver);
		homePage.clickOnLoginSignUp();
		signUpPage.newSignUp();
		registrationPage.createNewUser();
	}
}
