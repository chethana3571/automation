package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.nopcommerce.com/");
//boolean logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
//System.out.println("Display status:"+logo);

//WebElement logostatus=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
//System.out.println(logostatus.isDisplayed());



WebElement male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
System.out.println(male.isSelected());
WebElement female=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
System.out.println(female.isSelected());



driver.quit();

	}

}
