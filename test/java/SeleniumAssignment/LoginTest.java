package SeleniumAssignment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
        System.out.println(" Browser launched and login page opened");
    }

    @Test
    public void testValidLogin() {
        loginPage.login("student", "Password123");
        System.out.println("Login test executed successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}
