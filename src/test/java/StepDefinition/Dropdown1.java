package StepDefinition;

  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class Dropdown1 {

WebDriver driver = null;
@Given("user is on Facebook home page")
public void user_is_on_Facebook_home_page() {

	System.out.println("user is going to open  google search page");
	System.setProperty("Webdriver.chrome.driver", "C:/Users/Rohit/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
}

@And("user clicks on create account")
public void user_clicks_on_create_account() 
{
	
	driver.findElement(By.cssSelector("#u_0_2")).click();
	driver.manage().window().maximize();
}
@When("user enters all the details")
public void user_enters_all_the_details() {
	
	//driver.findElement(By.name("firstname")).sendKeys("rohit");
	//driver.findElement(By.name("lastname")).sendKeys("kumar");
	//driver.findElement(By.name("reg_email__")).sendKeys("9570328601");
	
	
	Select select1 = new Select(driver.findElement(By.cssSelector("#day")));
	select1.selectByVisibleText("24");
	Select select2 = new Select(driver.findElement(By.cssSelector("#month")));
	select2.selectByVisibleText("Nov");
	Select select3 = new Select(driver.findElement(By.cssSelector("#year")));
	select3.selectByVisibleText("1995");
	
	
}
@When("user click to Sign up")
public void user_click_to_Sign_up() {
   
	driver.findElement(By.cssSelector("#u_1_s")).click();
}
@Then("user naviagted to results")
public void user_naviagted_to_results() {
   

	
}
}
