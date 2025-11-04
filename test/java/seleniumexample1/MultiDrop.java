package seleniumexample1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement list=driver.findElement(By.cssSelector("select[id=\"multiselect1\"]"));
		Select dd=new  Select(list);
			 List<WebElement>carBox=dd.getOptions();
		
		dd.selectByIndex(1);
		//dd.selectByValue("Swift");
		dd.deselectAll();
		//dd.deselectByIndex(5);
		
	}
	

}
