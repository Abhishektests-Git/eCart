package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends BasePage {
	// constructor
	public TestCasePage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "//h4/a/u[contains(text(),'Test Case')]")
	List<WebElement> testCount;

	// actions
	public int countTestCase() {
		int count = testCount.size();
		return count;
	}
}
