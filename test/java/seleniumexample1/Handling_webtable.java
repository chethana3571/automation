package seleniumexample1;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_webtable {

	private static String v;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.manage().window().maximize();
		//to find the no of rows
        int rows=driver.findElements(By.xpath("//table[@class=\'dataTable\']//tr")).size();
        System.out.println(rows);
        int row1=driver.findElements(By.xpath("//table[@class=\'dataTable\']//tr[1]")).size();
        System.out.println(row1);
        // to find the no of column
        int col=driver.findElements(By.xpath("//table[@class=\'dataTable\']//th")).size();
        System.out.println("no of col in :" +col);
        
        // to find the data in header
        int headerdata=driver.findElements(By.xpath("//table[@class=\'dataTable\']//tr[1]//td")).size();
        System.out.println("no of data in rows1 in :" +headerdata);
        List<WebElement> headerdatas = driver.findElements(By.xpath("//table[@class=\'dataTable\']//tr"));
        for(WebElement data:headerdatas)
        {
        	System.out.println(data.getText() +v +  "\t");
        	{
        		System.out.println(    );
        	}
        }
        
       
        
        
        
        
        
        
        driver.close();
        
        
	}

}
