package seleniumexample1;

//import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(rightclick).perform();
		
		// to get all values in right click
		WebElement rightclickvalue =driver.findElement(By.xpath("//span[text()=\"Edit\"]"));
		
		
		
		
	}

}
