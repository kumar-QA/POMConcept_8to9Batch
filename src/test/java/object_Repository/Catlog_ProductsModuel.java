package object_Repository;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catlog_ProductsModuel {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream(".\\CommonElements.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
		driver.findElement(By.name(prop.getProperty("user"))).clear();
		driver.findElement(By.name(prop.getProperty("user"))).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.name(prop.getProperty("pwd"))).clear();
		driver.findElement(By.name(prop.getProperty("pwd"))).sendKeys("admin");
		
		driver.findElement(By.xpath(prop.getProperty("loginBtn"))).click();
		
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-book']")).click();
		
		driver.findElement(By.xpath("//a[@href='/Admin/Product/List']")).click();
	
		driver.findElement(By.id("SearchProductName")).sendKeys("Adobe Photoshop CS4");
		
		driver.findElement(By.xpath(prop.getProperty("searchBtn"))).click();
		
	}

}
