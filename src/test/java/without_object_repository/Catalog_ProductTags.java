package without_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catalog_ProductTags {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-book']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/Admin/Product/ProductTags']")).click();
		
		driver.findElement(By.id("SearchTagName")).sendKeys("cool");

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search']")).click();
		
		
	}

}
