package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//1. Write a WebDriver script to navigate to a website and click on a specific link.
public class AssignmentQuestion1 {

    WebDriver driver;

    @BeforeClass
    public void setupBrowser() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser launched and maximized");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void navigateToApp() {
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Navigated to the Page successfully");
} 
    @Test
    public void test_Execution() {
    	driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[1]/a")).click() ;
    	System.out.println("successfully clicked on home link");
    	}
    
    
    @AfterTest
  public void close_Browser() {
	  driver.close();
	 
  }

}