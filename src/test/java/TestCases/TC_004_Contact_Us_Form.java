package TestCases;

import org.testng.annotations.Test;

import PageObjects.ContactUs;
import PageObjects.HomePage;
import TestBase.setupClass;

public class TC_004_Contact_Us_Form extends setupClass{
	@Test
	public void openContactUs() {
		HomePage homePage=new HomePage(driver);
		ContactUs contactUs=new ContactUs(driver);
		homePage.clkContactUs();
		contactUs.contactForm();
	}
}
