package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Page extends BasePage {
//Constructor
	public Shopping_Page(WebDriver driver) {
		super(driver);
	}

//Locator
	@FindBy(xpath = "//a[normalize-space( )='Logout']")
	WebElement logoutBtn;

//Action
	public void clkLogout() {
		logoutBtn.click();
	}
}
