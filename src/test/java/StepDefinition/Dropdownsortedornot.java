package StepDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsortedornot {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		    driver.get("https://www.twoplugs.com/");
		     driver.manage().window().maximize();
		     driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		     Thread.sleep(3000);
		     
		    WebElement dropdown= driver.findElement(By.name("category_id"));
		    
		    Select drp = new Select(dropdown);
		    
		    List<WebElement>  options = drp.getOptions();
		    
		    ArrayList original = new ArrayList();
		    ArrayList temp = new ArrayList();
		    
		    for (WebElement option : options)
		    {
		    	  original.add(option.getText());
		    	  temp.add(option.getText());
		    	  
		    }
		     
      System.out.println("Orinal list :"+original);
      System.out.println("Temp list :"+temp);
      
      Collections.sort(temp);
	     
   System.out.println("Orinal list :"+original);
   System.out.println("Temp list :"+temp);
   
     if(original.equals(temp))
     {
    	 System.out.println("Elements in the Dropdown is sorted");
     }
     else
     {
    	 System.out.println("Elements in the Dropdown is not sorted");
     }
      driver.close();
	}

}
