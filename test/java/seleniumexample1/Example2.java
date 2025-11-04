package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.flipkart.com");
  driver.manage().window().maximize();
  //linktest
  //driver.findElement(By.linkText("Furniture")).click();
  //partial link text
//  driver.findElement(By.partialLinkText("Front")).click();
 // driver.findElements(By.className("mobiles"));
  Thread.sleep(2000);
  driver.close();
	}

}
