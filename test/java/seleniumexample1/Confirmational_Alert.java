package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmational_Alert {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("http://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Alert alt ;
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	    driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());*/
		WebElement button = driver.findElement(By.id("timerAlertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//Thread.sleep(2);
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
