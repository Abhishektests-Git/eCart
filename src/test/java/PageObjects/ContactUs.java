package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUs extends BasePage {
	// constructor
	public ContactUs(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "//input[@name='name']")
	WebElement txtName;
	@FindBy(xpath = "// input[@name='email']")
	WebElement txtEmail;
	@FindBy(xpath = "// input[@name='subject']")
	WebElement txtSubject;
	@FindBy(xpath = "// textarea[@name='message']")
	WebElement txtMsg;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitBtn;

	// action
	public void contactForm() {
		txtName.sendKeys("Abhishek Kumar");
		txtEmail.sendKeys("Aevixv@gmail.com");
		txtSubject.sendKeys("Test");
		txtMsg.sendKeys("TestMsg");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).perform();
		driver.switchTo().alert().accept();



		//submitBtn.click();
	}

}
