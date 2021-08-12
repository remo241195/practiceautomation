package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlecheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://itera-qa.azurewebsites.net/home/automation");
		   driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor)driver;  
		    
		   js.executeScript("window.scrollBy(0,1100)");
		   Thread.sleep(4000);
		   
		   //select all the checkboxes
		 List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[contains(@id ,'day')]"));
		 
		 System.out.println(Allcheckbox);
//		 for(WebElement checkboxes: Allcheckbox)
//		 {
//			  checkboxes.click();
//		 }
		   
   //select checkboxes according to choice
//		 for(WebElement checkboxes: Allcheckbox)
//		 {
//			    String day = checkboxes.getAttribute("id");
//			      if(day.equals("monday") || day.equals("friday"))
//			         checkboxes.click();
//		 }
		  //Select last 2 checkboxes
		 
		   int totalcheckbox = Allcheckbox.size();
		   
//		   for(int i = totalcheckbox-2;i<totalcheckbox;i++)
//		   {
//			   Allcheckbox.get(i).click();
//		   }
		   //select first 2 checkboxes
		   
		   for(int i = 0;i<totalcheckbox;i++)
		   {
			   if(i<2)
				   Allcheckbox.get(i).click();
		   }
	}

}
