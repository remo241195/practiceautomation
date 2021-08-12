package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadfile {

	public static void main(String[] args) throws AWTException {
	
    
			 WebDriverManager.chromedriver().setup();
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("	https://www.monsterindia.com/");
	   
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
	   //1st approach -when the type = file then we can use sendkeys method
	 //  driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Rohit\\Documents\\documents - Copy\\1sem.pdf");

	   
	   //by robot class
	   WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
	  
	   
	     
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      js.executeScript("arguments[0].click();", button);
	      Robot rc = new Robot();
	      rc.delay(2000);
	      
	      //1 - copy the path 2 - ctrl+v 3-enter
	      
	      //1 put path file on clipboard
	      
	      StringSelection ss = new StringSelection("C:\\Users\\Rohit\\Documents\\documents - Copy\\1sem.pdf");
	      
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	        
	        //2
	        
	        rc.keyPress(KeyEvent.VK_CONTROL);//ctrl
	        rc.keyPress(KeyEvent.VK_V);//v
	        rc.keyRelease(KeyEvent.VK_CONTROL);
	        rc.keyRelease(KeyEvent.VK_V);
	        
	      rc.keyPress(KeyEvent.VK_ENTER);
	      rc.keyRelease(KeyEvent.VK_ENTER);
	   
	}

}
