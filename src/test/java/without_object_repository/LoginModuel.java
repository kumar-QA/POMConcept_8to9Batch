package without_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModuel {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText());
		
	}
	
}
