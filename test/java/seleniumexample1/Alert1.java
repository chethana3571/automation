package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alt;
		WebElement button = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
	    /*JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0],click()",driver.findElement(By.xpath("//button[@id=\'alertButton\']"); */
		alt = driver.switchTo().alert();
		System.out.println(  alt.getText());
		alt.accept();
		
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
