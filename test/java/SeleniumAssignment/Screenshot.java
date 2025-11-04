package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot {
    public static void main(String[] args) {
      
        WebDriverManager.chromedriver().setup();

        
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();

         
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

           
            File dest = new File("C:\\Users\\chethana\\OneDrive\\Pictures\\Screenshots.png");

            
            FileHandler.copy(src, dest);

            System.out.println(" Screenshot saved successfully at: " + dest.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
             driver.quit();
        }
    }
}
