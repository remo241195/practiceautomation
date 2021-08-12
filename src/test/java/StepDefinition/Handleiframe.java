package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handleiframe {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		   
		   driver.manage().window().maximize();
		   
		   //frame is used to divide a page into multiple sections with new content on each section
		   //iframe used to embeded the content of the external websites into a webpage 
		   //frame1
		   driver.switchTo().frame("packageListFrame");
		   
		   driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		   
		   driver.switchTo().defaultContent();//go back to main page
		   
		   Thread.sleep(3000);
		   
		   //frame 2
		   
              driver.switchTo().frame("packageFrame");
		   
		   driver.findElement(By.cssSelector(".interfaceName")).click();
		   
		   driver.switchTo().defaultContent();
		   
		   Thread.sleep(4000);

		   //frame 3 
           driver.switchTo().frame("classFrame");
		   
		   driver.findElement(By.xpath("//a[text()='Help']")).click();
		   
		   
		   
	}

}
