package StepDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlebrowserwindow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.orangehrm.com/open-source/demo/");
		   driver.manage().window().maximize();
		   
		   //getwindowhandle()--gives the id of the open window at run time
		   
		   System.out.println(driver.getWindowHandle());
		   
		   driver.findElement(By.xpath("//a[normalize-space()='Contact Sales']")).click();
		   Thread.sleep(4000);
     
		   //getwindowhandles()  return ids of multiple window browser-- printing all windows ids
		   
		   Set<String> windowids =   driver.getWindowHandles();
		   
//		    for(String windowid : windowids)
//		    {
//		    	   System.out.println(windowid);
//		       
//		    }
		    //we can print by using iterator also
		   
		  List<String> listwindowid = new ArrayList(windowids);
		  
		  System.out.println(listwindowid);
		         
//		          String parentid =   listwindowid.get(0);
//		          String childid =   listwindowid.get(1);
//		          System.out.println("Parentid :"+parentid);
//				     System.out.println("childid :"+childid);
//		    
//		    Iterator<String> itr =  windowids.iterator();  
//		    
//		      String parentid = itr.next();
//		      
//		    String childid = itr.next();
//		      
//		      System.out.println (driver.switchTo().window(parentid).getTitle());
//		      
//		      System.out.println("Parentid :"+parentid);
//		     System.out.println("childid :"+childid);
		      
	}

}
