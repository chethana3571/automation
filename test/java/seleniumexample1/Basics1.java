package seleniumexample1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //ChromeDriver driver=new ChromeDriver();
  WebDriver driver =new ChromeDriver();
  driver.get("https://www.opencart.com/");
  String act_title=driver.getTitle();
  System.out.println("Title: "+act_title);
  if(act_title.equals(" Open Source Shopping Cart Solution"))
		  {
	        System.out.println("passed");
           }
        else 
        {            
	          System.out.println("failed");
             }
  driver.close();
	}

}
