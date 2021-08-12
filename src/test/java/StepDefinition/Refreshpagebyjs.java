package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Refreshpagebyjs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		WebElement Signin = driver.findElement(By.className("login"));
		clickelebyjs(driver,Signin);
		Thread.sleep(2000);
		WebElement useremail = driver.findElement(By.name("email"));
		sendkeys(driver,useremail,10,"rohiteceremo@gmail.com");
		Thread.sleep(3000);
		refreshbyjs(driver);
		
		System.out.println(gettitlebyjs(driver));
		driver.quit();
	}
	
	//refresh the page by js
	
	public static void refreshbyjs(WebDriver driver)
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("history.go(0)");
	}

	//get the title of page by js
	
	public static String gettitlebyjs(WebDriver driver)
	
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		String title =  js.executeScript("return document.title;").toString();
		 return title;
	}
	
	public static void clickelebyjs(WebDriver driver,WebElement Element)
	{
		   JavascriptExecutor js = (JavascriptExecutor)driver;   
             js.executeScript("arguments[0].click();", Element);
	}
	@SuppressWarnings("deprecation")
	public static void sendkeys(WebDriver driver, WebElement Element,int timeout,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver ,timeout);
		wait.until(ExpectedConditions.visibilityOf(Element));
				
		  Element.sendKeys(value);
}
}

	


