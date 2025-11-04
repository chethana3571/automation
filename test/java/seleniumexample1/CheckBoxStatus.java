package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
//WebElement h= driver.findElement(By.xpath("//span[@id=\"altid_msg\"]"));
WebElement CheckBox= driver.findElement(By.xpath("//span[@id='altid_msg']"));

System.out.println("berfore checking checkbox:");
System.out.println("visibility of checkbox:"+CheckBox.isDisplayed());

System.out.println("checking default state:"+CheckBox.isSelected());
System.out.println("enability of checkbox:"+CheckBox.isEnabled());

if(!CheckBox.isSelected()) {
	CheckBox.click();
}
CheckBox.click();
System.out.println("after checking checkbox:");
System.out.println("visibility of checkbox:"+CheckBox.isDisplayed());
System.out.println("enability of checkbox:"+CheckBox.isEnabled());
System.out.println("checking default state:"+CheckBox.isSelected()); 




driver.quit();









	}

}
