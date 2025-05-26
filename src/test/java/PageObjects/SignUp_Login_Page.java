package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Login_Page extends BasePage {
	public SignUp_Login_Page(WebDriver driver) {
		super(driver);
	}

//Locators
	@FindBy(xpath = "//div[@class='signup-form']//input[@placeholder='Email Address']")
	WebElement EnterNewEmail;

	@FindBy(xpath = "//div[@class='signup-form']//input[@placeholder='Name']")
	WebElement EnterNewName;

	@FindBy(xpath = "//button[text()='Signup']")
	WebElement BtnSignUp;
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement InputLoginEmail;
	@FindBy(xpath = "//input[@data-qa='login-password']")
	WebElement InputLoginPassword;
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	@FindBy(xpath = "//form[@action='/signup']/p")
	WebElement errorTxt;

// action
	public void newSignUp() {
		EnterNewEmail.sendKeys("//form[@action='/signup']/p");
		EnterNewName.sendKeys("Abhishek Kumar");
		BtnSignUp.click();
	}

	public void login() {
		InputLoginEmail.sendKeys("Aevixv@gmail.com");
		InputLoginPassword.sendKeys("Bournvill3");
		loginBtn.click();
	}
	
	public void existingMailSignUp() {
		EnterNewEmail.sendKeys("Aevixv@gmail.com");
		EnterNewName.sendKeys("Abhishek kumar");
		BtnSignUp.click();
		System.out.println(errorTxt.getText());
	}

}
