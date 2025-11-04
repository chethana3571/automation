package seleniumexample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		System.out.println("location og x:"+slider.getLocation().x);
		System.out.println("location og y:"+slider.getLocation().y);
		
		act.dragAndDropBy(slider, slider.getLocation().x+500,slider.getLocation().y);
		System.out.println("location of x axis"+slider.getLocation());
		
		
		
		driver.quit();
		
	}

}
