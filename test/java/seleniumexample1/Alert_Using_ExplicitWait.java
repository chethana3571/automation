/*package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Using_ExplicitWait {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		/WebDriver driver =new ChromeDriver();
		driver.get("http://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		WebElement button = driver.findElement(By.id("alertButton"));
		Thread.sleep(5000);
		Alert alt=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		alt.accept();
		driver.quit(); */
		package seleniumexample1;

		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		import java.time.Duration;

		public class Alert_Using_ExplicitWait {

		    public static void main(String[] args) {

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		        driver.get("https://demoqa.com/alerts"); // Example site with alerts

		        // Click on the button that triggers the alert
		        WebElement button=driver.findElement(By.id("alertButton"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
				button.click();
		        // Create Explicit Wait
		       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Wait until alert is present
		        //wait.until(ExpectedConditions.alertIsPresent());

		        // Switch to alert and accept it
		        driver.switchTo().alert().accept();

		        System.out.println("Alert handled successfully!");

		        driver.quit();
		    }
		

		
		
	}

	

