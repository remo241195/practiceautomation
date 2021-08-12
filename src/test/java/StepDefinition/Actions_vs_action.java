package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_vs_action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		   driver.manage().window().maximize();
		   
		 WebElement   Womenele =driver.findElement(By.xpath("//a[@title='Women']"));
		 
		 Actions Act = new Actions(driver);
		  Act.moveToElement(Womenele).perform();
		   
		 Action ac =   Act.moveToElement(Womenele).build();
		 
		    ac.perform();
		  //perform() internally calling build().perform()  --action will created then complete
		  //build() - method which return action interface but not perform the action
		    //if i want to store the action on some variable then we can do it by build method
	}

}
