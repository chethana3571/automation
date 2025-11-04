package seleniumexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
WebElement driver.findElement(By.xpath("//span[@id=\"altid_msg\"]"));








	}

}
