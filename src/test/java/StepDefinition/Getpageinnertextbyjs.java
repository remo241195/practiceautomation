package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getpageinnertextbyjs {

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
          System.out.println(getinnertextofpage(driver));
	}

//getinnertext of the webpage by js
	
	public static String getinnertextofpage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		String pagetext =  js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
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
