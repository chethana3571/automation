package seleniumexample1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.flipkart.com/");
  driver.get("https://www.flipkart.com/mobile-phones-store?param=4252&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIk1vYmlsZXMiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19&pageUID=1754374851734");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	String winid=driver.getWindowHandle();
	System.out.println("window id:"+winid);
	driver.findElement(By.name("q")).sendKeys("phones");
	Set<String> windowid1=driver.getWindowHandles();
	System.out.println("window ids are:"+windowid1);
	Thread.sleep(5000);
	
	driver.quit();
	
	}

}
