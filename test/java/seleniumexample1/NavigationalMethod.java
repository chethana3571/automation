package seleniumexample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mail.google.com/mail/u/0/#inbox");
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
Thread.sleep(2000);
driver.quit();
		
		
		
		
		
		
	}

}
