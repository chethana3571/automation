package seleniumexample1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//to select specific checkbox//
driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
 
// to select all checkbox
List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class=\'form-check-input\' and @type=\'checkbox\']"));
/*for(int i=0;i<checkbox.size();i++)
{
    checkbox.get(i).click();
    
  
}
System.out.println("checkbox is selected");
 // by using enhanced for loop
/*for(WebElement x:checkbox)
{
	x.click();
}
*/
// to select only last 3 checkbox
/*for(int i=3;i<checkbox.size();i++)
{
	checkbox.get(i).click();
}
System.out.println("checkbox is selected"); */
// to select first 3 checkbox
/*for(int i=0;i<3;i++)
{
	
		
		checkbox.get(i).click();
		
}
System.out.println("checkbox is selected");*/

for(int i=0; i>3; i++)
{
	if(checkbox.get(i).isSelected()) {
		checkbox.get(i).click();
		
	}
	else
		System.out.println("error");
	
}
System.out.println("unselected");


driver.quit();
	}

}
