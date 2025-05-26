package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignUp_Login_Page;
import TestBase.setupClass;

public class TC_002_Correct_Login extends setupClass{
	@Test
	public void login() {
		HomePage homePage=new HomePage(driver);
		SignUp_Login_Page signUp_Login_Page=new SignUp_Login_Page(driver);
		homePage.clickOnLoginSignUp();
		signUp_Login_Page.login();
	}
}
