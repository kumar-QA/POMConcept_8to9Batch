package work_with_pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		NopCommerceLogin np=PageFactory.initElements(driver,NopCommerceLogin.class);
		np.login();
		Thread.sleep(1000);
		DashBoardPage db=PageFactory.initElements(driver,DashBoardPage.class);
		db.VerifyProductsPage();
		Catalog_products cp=PageFactory.initElements(driver, Catalog_products.class);
		System.out.println(cp.ConfirmationText.getText());
		
	}
	
}
