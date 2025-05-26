package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration_Page extends BasePage {
	// constructor
	public Registration_Page(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement maleRadio;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInput;
	@FindBy(xpath = "//Select[@id='days']")
	WebElement selectDays;
	@FindBy(xpath = "//Select[@id='months']")
	WebElement selectMonths;
	@FindBy(xpath = "//Select[@id='years']")
	WebElement selectYears;
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement inputFirstName;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement inputLastName;
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;
	@FindBy(xpath = "//select[@id='country']")
	WebElement Selectcountry;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobileNumber;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement BtnCreateAccount;

	// action
	public void createNewUser() {
		maleRadio.click();
		passwordInput.sendKeys("Bournvill3");
		Select selectDay=new Select(selectDays);
		Select selectMonth=new Select(selectMonths);
		Select selectYear=new Select(selectYears);
		Select selectCountry=new Select(Selectcountry);
		selectDay.selectByVisibleText("22");
		selectMonth.selectByVisibleText("October");
		selectYear.selectByVisibleText("1995");
		inputFirstName.sendKeys("Abhishek");
		inputLastName.sendKeys("kumar");
		company.sendKeys("TCS");
		address1.sendKeys("Kolkata");
		address2.sendKeys("SaltLake");
		selectCountry.selectByVisibleText("India");
		state.sendKeys("West Bengal");
		city.sendKeys("Kolkata");
		zipCode.sendKeys("700102");
		mobileNumber.sendKeys("8211578784");
		BtnCreateAccount.click();

		
		

	}

}
