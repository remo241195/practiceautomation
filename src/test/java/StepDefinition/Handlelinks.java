package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlelinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		 //  driver.findElement(By.linkText("Amazon Pay")).click();
          driver.findElement(By.partialLinkText("Pay")).click();
          //how to capture all the links in browser
          
         List<WebElement> links =  driver.findElements(By.tagName("a"));
             System.out.println(links.size());
             
             //print all the links in console
             
             for(WebElement link: links)
             {
            	   System.out.println(link.getText());
            	   System.out.println(link.getAttribute("href"));
             }
 //Broken links -- target page is not available for the links
	}

}
