package seleniumexample1;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedIOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		          
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
