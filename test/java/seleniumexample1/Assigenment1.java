package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigenment1 {
	//   1. Open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f 
  //  a. Enter username as yourname (using locator name)
    //b. Enter password as yourname_123 (using locator name)
    //c. click on login button (using locator name)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
  driver.get(" https://www.facebook.com/");
  driver.findElement(By.name("email")).sendKeys("chethana_dcnaik");
  
  driver.findElement(By.name("pass")).sendKeys("chethana2471");
  
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
  
  
  driver.quit();
  
	}

}
