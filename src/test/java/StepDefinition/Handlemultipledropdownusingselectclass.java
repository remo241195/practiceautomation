package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultipledropdownusingselectclass {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  
		    driver = new ChromeDriver();
		    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     
		     Thread.sleep(4000);
		     

		    
		   WebElement noofemployee = driver.findElement(By.name("NoOfEmployees"));
      
		   selectalldropdown(noofemployee,"11 - 15");
		   WebElement industry = driver.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
		   selectalldropdown(industry,"Education");
		 
		   WebElement country = driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
		   selectalldropdown(country,"China");
	}
	
    public static void selectalldropdown(WebElement ele,String value)
    {
    	Select drp = new Select(ele);
    	     List<WebElement> alloptions = drp.getOptions();
    	     for (WebElement option : alloptions)
    	     {
    	    	   if(option.getText().equals(value))
    	    		    option.click();
    	    	   break;
    	    	   
    	    		    
    	     }
    	  
    }
}
