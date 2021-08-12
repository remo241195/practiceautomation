package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Autocomplete_google_places_dropdown {
   public  static void main(String[] args) throws InterruptedException 
   {
	   
	 WebDriverManager.chromedriver().setup();
	  
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.twoplugs.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	     Thread.sleep(3000);
	    WebElement drp = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	      
	          drp.clear();
	          Thread.sleep(3000);
	        drp.sendKeys("mumbai");
	        String text;
	        do
	        {
	        drp.sendKeys(Keys.ARROW_DOWN);
	        text = drp.getAttribute("value");
	        if(text.equals("Mumbai Central, Mumbai, Maharashtra, India"))
	        		{
	        	         drp.sendKeys(Keys.ENTER);
	        	         break;
	        		}
	        
	        }  while(!text.isEmpty());
   }    
}