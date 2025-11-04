package seleniumexample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_Login_fun {

	

	    WebDriver driver;

	    @BeforeClass
	    public void setupClass() {
	        // Set path if needed, in latest Selenium it auto manages drivers
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        System.out.println("Browser launched and maximized");
	    }

	    @BeforeMethod
	    public void navigateToApp() {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        System.out.println("Navigated to OrangeHRM Login Page");
	    }

	    @Test
	    public void validLoginTest() throws InterruptedException {
	        // Wait for page to load
	        Thread.sleep(2000);

	        WebElement username = driver.findElement(By.name("username"));
	        WebElement password = driver.findElement(By.name("password"));
	        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

	        username.sendKeys("Admin");
	        password.sendKeys("admin123");
	        loginBtn.click();

	        Thread.sleep(2000); // just for demo (better to use WebDriverWait)

	        // Verify dashboard page
	        String url = driver.getCurrentUrl();
	        Assert.assertTrue(url.contains("dashboard"), "Login failed!");
	        System.out.println("Valid Login Test Passed");
	    }

	    @Test
	    public void invalidLoginTest() throws InterruptedException {
	        Thread.sleep(2000);

	        WebElement username = driver.findElement(By.name("username"));
	        WebElement password = driver.findElement(By.name("password"));
	        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

	        username.sendKeys("WrongUser");
	        password.sendKeys("WrongPass");
	        loginBtn.click();

	        Thread.sleep(2000);

	        // Verify error message
	        WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
	        Assert.assertTrue(errorMsg.isDisplayed(), "Error message not displayed!");
	        System.out.println("Invalid Login Test Passed");
	    }

	    @AfterClass
	    public void teardownClass() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed");
	        }
	    }
	}


