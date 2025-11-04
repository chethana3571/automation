package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("124");
        driver.findElement(By.name("password")).sendKeys("hrdtr");
       WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));   
       wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
        
        
	}

}
