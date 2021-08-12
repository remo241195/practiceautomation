package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Innerframe2 {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		   
		   driver.manage().window().maximize();
		   driver.switchTo().frame("iframeResult");//switch to outer frame
		   WebElement innerframe =  driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		   
		   driver.switchTo().frame(innerframe); //switch to inner frame
		   
	String text = driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText();
		   
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		
		String parenttext = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		System.out.println(parenttext); 

		  
		  
		   

	}

}
