package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclick).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
