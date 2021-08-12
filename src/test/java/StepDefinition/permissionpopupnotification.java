package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class permissionpopupnotification {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		 
		   options.addArguments("--disable-notification");
		  
		   WebDriver driver = new ChromeDriver(options);
		   driver.get("https://www.cleartrip.com/");
		   driver.manage().window().maximize();
		   
		
		   

	}

}
