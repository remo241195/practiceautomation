package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdowm {

	public static void main(String[] args) throws InterruptedException {

      
		 WebDriverManager.chromedriver().setup();
		  
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.opencart.com/index.php?route=account/register");
		   // driver.findElement(By.linkText("REGISTER")).click();
		    
		 WebElement   Dropdownele =driver.findElement(By.xpath("//select[@id='input-country']"));
		 
		 Select dropdown = new Select(Dropdownele);
		 
		   dropdown.selectByVisibleText("Angola");
		   Thread.sleep(5000);
		   dropdown.selectByValue("10");
		   Thread.sleep(5000);
		   dropdown.selectByIndex(13);

	}

}
