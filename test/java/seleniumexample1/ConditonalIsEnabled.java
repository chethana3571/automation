package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditonalIsEnabled  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.nopcommerce.com/");
boolean status1=driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).isEnabled();
System.out.println("enable status:"+ status1);
driver.close();
	}

}
