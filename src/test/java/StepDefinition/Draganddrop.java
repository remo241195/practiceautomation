package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		   
		   driver.manage().window().maximize();
		   
		  WebElement frame =  driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		  
		  driver.switchTo().frame(frame);
		 WebElement img1 =  driver.findElement(By.xpath("(//ul[@id='gallery']/li//img)[1]"));
		 WebElement img2 =  driver.findElement(By.xpath("(//ul[@id='gallery']/li//img)[2]"));
		 WebElement img3 =  driver.findElement(By.xpath("(//ul[@id='gallery']/li//img)[3]"));
		 WebElement img4 =  driver.findElement(By.xpath("(//ul[@id='gallery']/li//img)[4]"));
		 
		 WebElement tgt = driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(img1, tgt).perform();
		 act.dragAndDrop(img2, tgt).perform();
		 act.dragAndDrop(img3, tgt).perform();
		 act.dragAndDrop(img4, tgt).perform();
		 
				 
		 

	}

}
