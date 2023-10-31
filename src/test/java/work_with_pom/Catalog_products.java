package work_with_pom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog_products {
	public Menu menu=null;
	
	public Catalog_products(WebDriver driver) {
		menu=PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(xpath="//h1[@class='float-left']")
    WebElement ConfirmationText;
	
	
}
