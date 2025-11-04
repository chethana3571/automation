package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegistrationForm {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page&entry_point=login");
        System.out.println("Browser launched and Facebook registration page opened");
    }

    @Test
    public void testFacebookRegistrationForm() throws InterruptedException {
       
        driver.findElement(By.name("firstname")).sendKeys("chethana");
        driver.findElement(By.name("lastname")).sendKeys("naik");

      
        driver.findElement(By.name("reg_email__")).sendKeys("johndoe1234@gmail.com");

        
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password123!");

     
        driver.findElement(By.id("month")).click();
        driver.findElement(By.xpath("//select[@id='month']/option[text()='Nov']")).click();
        driver.findElement(By.id("day")).click();
        driver.findElement(By.xpath("//select[@id='day']/option[text()='15']")).click();
        driver.findElement(By.id("year")).click();
        driver.findElement(By.xpath("//select[@id='year']/option[text()='1990']")).click();

        
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

        
        driver.findElement(By.name("websubmit")).click();

        
        Thread.sleep(3000);

        
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("www.facebook.com/"), "Registration may not have completed");

        System.out.println("Test passed: Registration submitted, current URL: " + currentUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser closed");
    }
}
