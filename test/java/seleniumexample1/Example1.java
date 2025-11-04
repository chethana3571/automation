package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id=\'sunday\']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
