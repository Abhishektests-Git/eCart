package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.setupClass;

public class TC_006_Verify_All_Products extends setupClass {
	@Test
	public void allProducts() {
		HomePage homePage = new HomePage(driver);
		int noOfProducts=homePage.productListArr().size();
		Assert.assertTrue(noOfProducts==40);
	}
}
