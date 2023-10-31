package work_with_pom;

import java.awt.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLogin {

	public Menu menu=null;
			
			public NopCommerceLogin(WebDriver driver) {
				menu=PageFactory.initElements(driver, Menu.class);
			}
			
	@FindBy(name="Email")
	WebElement username;
	@FindBy(name="Password")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement ConfimrationText;
	
	public void login() {
		username.clear();
		username.sendKeys("admin@yourstore.com");
		pwd.clear();
		pwd.sendKeys("admin");
		loginBtn.click();
		System.out.println(ConfimrationText.getText());
	}	
}
