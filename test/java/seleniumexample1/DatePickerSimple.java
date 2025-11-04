package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerSimple {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the demo site
        driver.get("https://jqueryui.com/datepicker/");

        // Switch to the iframe (date picker is inside it)
        driver.switchTo().frame(0);

        // Locate the datepicker input box
        WebElement dateInput = driver.findElement(By.id("datepicker"));

        // Enter the date
        dateInput.sendKeys("09/25/2025");

        System.out.println("✅ Date entered successfully!");

        Thread.sleep(3000); // just to see result
        driver.quit();
    }
}
