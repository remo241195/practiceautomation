package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statusofwebelements {

	public static void main(String[] args) throws InterruptedException {

   WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://demo.nopcommerce.com/register");
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     
     //isDisplayed ,isEnabled -- (used the specific webelement is  enabled or disabled in a webapge) return true if enabled otherwise vice versa
 
     System.out.println(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());
     
     System.out.println(driver.findElement(By.xpath("//input[@name='q']")).isEnabled());
     
     //isSelected() -- radio button,checkboxes,dropdown
     System.out.println(driver.findElement(By.cssSelector(".male")).isSelected());//false
     driver.findElement(By.cssSelector(".male")).click();
     Thread.sleep(4000);
     System.out.println(driver.findElement(By.cssSelector(".male")).isSelected());//true
     
     
	}

}
