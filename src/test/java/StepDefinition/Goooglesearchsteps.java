package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.*;

public class Goooglesearchsteps {
	
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() 
	
	{
		
		
		 System.out.println("user is going to open  google search page");
		System.setProperty("Webdriver.chrome.driver", "C:/Users/Rohit/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		System.out.println("user is on google search page");
		driver.navigate().to("https://www.google.com");
		
	}

	@When("user enters a text in searchbox")
	public void user_enters_a_text_in_searchbox() throws InterruptedException {
		System.out.println("user enters a text in searchbox");
		driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
		Thread.sleep(2000);
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to results")
	public void user_is_navigated_to_results() {
		System.out.println("user is navigated to results");
		driver.getPageSource().contains("Online Courses");
		driver.quit();
		driver.close();
	
	}



}
