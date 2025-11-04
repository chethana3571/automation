package seleniumexample1;

/*import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;*/

/*public class UploadFile {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		  String file=("C:\\Users\\chethana\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-08-22 211919.png");
		WebElement s=driver.findElement(By.id("uploadPicture"));
		s.click();
		s.sendKeys(file);*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class UploadFileTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Browser launched and navigated to Practice Form");
    }

    @Test
    public void fileUploadTest() {
        String filePath = "C:\\Users\\chethana\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-08-22 211919.png";

        WebElement uploadInput = driver.findElement(By.id("uploadPicture"));
        // No need to click(), directly send the file path
        uploadInput.sendKeys(filePath);

        System.out.println("File uploaded successfully: " + filePath);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }

	
		
		
	}


