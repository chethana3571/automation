package seleniumexample1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoseggestion {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("selenium");

            // Find suggestions
            List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
            System.out.println("Number of suggestions: " + list.size());

            // Loop through suggestions
            for (int i = 0; i < list.size(); i++) {
                String suggestion = list.get(i).getText();
                System.out.println(suggestion);

                if (suggestion.equalsIgnoreCase("selenium")) {
                    list.get(i).click();
                    break;
                }
            }

            System.out.println("✅ Test Completed Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
