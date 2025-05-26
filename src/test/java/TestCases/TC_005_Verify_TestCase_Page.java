package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.TestCasePage;
import TestBase.setupClass;

public class TC_005_Verify_TestCase_Page extends setupClass{
	@Test
	public void testCount() {
		HomePage homePage=new HomePage(driver);
		TestCasePage testCasePage= new TestCasePage(driver);
		homePage.clkTestCase();
		int tcCount=testCasePage.countTestCase();
		Assert.assertEquals(tcCount, 26);
	}
}
