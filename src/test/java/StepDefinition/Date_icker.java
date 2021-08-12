package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_icker {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		   
		   driver.manage().window().maximize();
		   
		   String Month = "jun";
		   String Year = "2021";
		   String date =  "23";
		   
		     driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		     Thread.sleep(3000);
		     while(true)
		     {
		    	 String monthyear = driver.findElement(By.xpath("//td[@class ='monthTitle']")).getText();
		    	 String arr[] = monthyear.split(" ");
		    	 
		    	 System.out.println(monthyear);
		    	 String mon = arr[0];
		    	 String yr = arr[1];
		    	 
		    	 if(mon.equalsIgnoreCase(Month) && yr.equals(Year))

                {
	                  break;
                 }
		    	 
		    	 else
		    	 {
		    		 driver.findElement(By.xpath("//button[text() = '>']")).click();
		    	 }

		    	 
		     }
		     
		     //date selection 
		     List<WebElement> alldata = driver.findElements(By.xpath("//table[@class = 'rb-monthTable first last']//td"));
		     
		    
		          for(WebElement ele : alldata)
		          {   
		        	   String dt =  ele.getText();
		        	     if(dt.equals(date))
		        	     {
		        	    	 ele.click();
		        	    	 break;
		        	     }
		          }
		     

	}

}
