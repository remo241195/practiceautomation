package StepDefinition;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlebrokenlinks {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.deadlinkcity.com/");
		   driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor)driver; 
		   
		   js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(3000);
		   List<WebElement> links =  driver.findElements(By.tagName("a"));
           System.out.println(links.size());
           
           int broken = 0;
           
           for(WebElement element : links)
           {
        	    String url = element.getAttribute("href");
        	    if(url.isEmpty() || url == null)
        	    {
        	    	System.out.println("url is empty");
        	    	continue;
        	    }
        	    
        	    URL link = new URL(url); // convert string links into url
        	    
        	    try {
					HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
					  httpcon.connect();
					  if(httpcon.getResponseCode()>=400)
					  {
						  System.out.println(httpcon.getResponseCode()+ url+" is "+" BRoken link");
						  broken++;
					  }
					  
					  else
					  {
						  System.out.println(httpcon.getResponseCode() + url+" is "+" valid link");
					  }
				} catch (IOException e) {
					
					e.printStackTrace();
				}
        	    
        	    System.out.println("Number of broken links"+ broken);
           }
           
           
           
           
	}

}
