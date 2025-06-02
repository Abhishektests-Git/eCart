package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.SignUp_Login_Page;
import TestBase.setupClass;

public class TC_007_Search_Product extends setupClass{
	@Test
	public void searchProduct() {
		HomePage homePage=new HomePage(driver);
		SignUp_Login_Page signUp_Login_Page=new SignUp_Login_Page(driver);
		ProductPage productPage=new ProductPage(driver);
		homePage.clickOnLoginSignUp();
		signUp_Login_Page.login();
		homePage.clkOnProductBtn();
		productPage.searchProd("Blue top");
		productPage.addFristResultToCart();
		
		
	}
}
