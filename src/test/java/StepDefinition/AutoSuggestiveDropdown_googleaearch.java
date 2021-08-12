package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdown_googleaearch {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.findElement(By.name("q")).sendKeys("java");
		   Thread.sleep(3000);
		   
		 List<WebElement> listitem =  driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
            System.out.println(listitem.size());
		 for(WebElement item :listitem )
		 {
			     if(item.getText().contains("bike"))
			     {
			    	   item.click();
			    	   break;
			     }
			     
		 }
	}

}
