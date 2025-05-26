package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Shopping_Page;
import PageObjects.SignUp_Login_Page;
import TestBase.setupClass;

public class TC_001_Logout extends setupClass{
	@Test
	public void performLogout() {
		HomePage homePage=new HomePage(driver);
		SignUp_Login_Page signupLoginPage=new SignUp_Login_Page(driver);
		Shopping_Page shoppingPage= new Shopping_Page(driver);
		homePage.clickOnLoginSignUp();
		signupLoginPage.login();
		shoppingPage.clkLogout();
	}
}
