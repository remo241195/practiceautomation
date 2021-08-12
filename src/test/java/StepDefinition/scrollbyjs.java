package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class scrollbyjs {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		  js.executeScript("window.scrollBy(0,700)");
		  
		WebDriverWait wait =   new WebDriverWait(driver,1);
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".tableFixHead")));
		   js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		   
		   List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		    int sum = 0;
		   for(int i=0;i<values.size();i++)
		   {
			   sum = sum + Integer.parseInt(values.get(i).getText());
		   }
		   
         System.out.println(sum);
         
        int total =  Integer.parseInt(driver.findElement(By.xpath("//div[contains(text(),'Total Amount Collected: 296')]")).getText().split(":")[1].trim());
        System.out.println(total);
        Assert.assertEquals(sum, total);
	}

	

}
