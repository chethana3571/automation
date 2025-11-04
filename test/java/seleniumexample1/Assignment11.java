package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/ ");
		driver.findElement(By.xpath("//div[@class='inputAndSwapWrapper___e7dc96']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]")).sendKeys("ban");
		driver.findElement(By.xpath("//div[@class='listItem___9a15c0 lineLength2___c5b70b suggestion-item hoverHighlight___b59c55 ']//div[@aria-label='Madiwala, Bangalore, heading}'][normalize-space()='Madiwala, Bangalore']")).click();
	   
	
	
	
	
	}

}
