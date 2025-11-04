package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("https://testautomationpractice.blogspot.com/");
   driver.manage().window().maximize();
   driver.findElement(By.cssSelector("name")).sendKeys("chethana");
   driver.findElement(By.cssSelector("email")).sendKeys("chethana3571@gmail.com");
   driver.findElement(By.cssSelector("#phone")).sendKeys("9164163571");
   
	}

}
