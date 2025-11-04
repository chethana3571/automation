	package seleniumexample1;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class ConfirmationAlert1 {

		    public static void main(String[] args) {

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://demoqa.com/alerts"); // Example site (replace with your site if different)

		        // Locate the button
		        WebElement button = driver.findElement(By.id("timerAlertButton"));

		        // Scroll into view (to avoid being blocked by ads/iframe)
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

		        // Click the button using JS to avoid iframe interception issues
		       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
                 button.click();
		        // Wait for the alert to appear (up to 10 seconds)
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());

		        // Switch to the alert
		        Alert alert = driver.switchTo().alert();

		        // Print the alert text
		        System.out.println("Alert says: " + alert.getText());

		        // Accept the alert
		        alert.accept();

		        // Close browser
		        driver.quit();
		    }
		

	}


