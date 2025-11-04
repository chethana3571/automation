package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class CaptureScreenshot {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        
        
        WebDriver driver = new ChromeDriver();
        
        try {
            
            driver.get("https://testautomationpractice.blogspot.com/");
            
          
            driver.manage().window().maximize();
            
         
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            
            
            File destination = new File("C:\\Users\\chethana\\OneDrive\\Pictures\\Screenshots.png");
            
            
            FileHandler.copy(screenshot, destination);
            
            System.out.println("Screenshot saved successfully at: " + destination.getAbsolutePath());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
