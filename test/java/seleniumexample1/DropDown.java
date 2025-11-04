package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd=driver.findElement(By.id("country"));
		
		Select dropdown=new Select(dd);
		Thread.sleep(5000);
		//System.out.println(d	ropdown.getFirstSelectedOption().getText());
		//dropdown.selectByContainsVisibleText("japan");
		dropdown.selectByIndex(0);
		//System.out.println(dropdown.selectByIndex(1);
		System.out.println("United State selected");
		driver.quit();
		
		
		
		
		
		
	}

}
