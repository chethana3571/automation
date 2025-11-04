package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DataProvider {
	WebDriver driver;
	
	void setup() {
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	void login() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		boolean status=driver.findElement(By.xpath("//*[@id=\"menu-item-43\"]")).isDisplayed();
		if(status==true) {
		driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
		Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}
		
		
		
		
	}
 void teardown() {
	 driver.close();
	 
 }
}
