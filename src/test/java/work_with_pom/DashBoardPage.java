package work_with_pom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
public Menu menu=null;
	
	public DashBoardPage(WebDriver driver) {
		menu=PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-book']")
	WebElement CatalogMenu;
	@FindBy(xpath="//a[@href='/Admin/Product/List']")
	WebElement ProductsLink;
	@FindBy(xpath="//a[@href='/Admin/Category/List']")
	WebElement CategoriesLink;
	@FindBy(xpath="//a[@href='/Admin/Manufacturer/List']")
	WebElement ManufacturesLink;
	@FindBy(xpath="")
	WebElement ProductsreviewsLink;
	@FindBy(xpath="//a[@href='/Admin/Product/ProductTags']")
	WebElement Producttags;
	@FindBy(xpath="")
	WebElement Attributes;
	@FindBy(xpath="")
	WebElement ProductAttributesLink;
	@FindBy(xpath="")
	WebElement SpecificationAttributesLink;
	@FindBy(xpath="")
	WebElement CheckoutAttributesLink;

	  public void VerifyProductsPage() throws InterruptedException {
		  CatalogMenu.click();
		  Thread.sleep(2000);
		  ProductsLink.click();
		  
	  }
	

	
	
}
