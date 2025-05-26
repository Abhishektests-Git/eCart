package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
//	 constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement LoginSignup;

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement RadioMale;
	@FindBy(xpath = "//input[@id='password']")
	WebElement EnterPAssword;
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement contactUsBtn;
	@FindBy(xpath = "//a[text()=' Test Cases']")
	WebElement testCaseBtn;
	@FindBy(xpath = "//div[@class='single-products']/div/p")
	List<WebElement> productList;

	// action
	public void clickOnLoginSignUp() {
		LoginSignup.click();

	}

	public void clkContactUs() {
		contactUsBtn.click();
	}

	public void clkTestCase() {
		testCaseBtn.click();
	}

	public List<String> productListArr() {
		List<String> productNames = productList.stream().map(p -> p.getText()).toList();
		return productNames;
	}

}
