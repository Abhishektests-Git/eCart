package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
//constructor
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
//locators
	@FindBy(xpath="//input[@id='search_product']") WebElement searchProd;
	@FindBy(xpath="//button[@id='submit_search']") WebElement searchBtn;
	@FindBy(xpath="(//div[@class='single-products'])[1]") WebElement firstSearch;
	@FindBy(xpath="//a[text()='Add to cart']") WebElement addToCartBtn;

//	Actions
	public void searchProd(String prodName) {
		searchProd.sendKeys(prodName);
		searchBtn.click();
		
	}
	public void addFristResultToCart() {
		addToCartBtn.click();
	}
}


