package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorFlash {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		WebElement useremail = driver.findElement(By.name("email"));
		sendkeys(driver,useremail,10,"rohiteceremo@gmail.com");
		 WebElement Password = driver.findElement(By.name("passwd"));
		highLightElement(Password,driver);
		sendkeys(driver, Password,10,"Test@12345" );
		

	}

	@SuppressWarnings("deprecation")
	public static void sendkeys(WebDriver driver,WebElement Element ,int timeout,String value)
	{
		
		WebDriverWait wait = new WebDriverWait(driver ,timeout);
				wait.until(ExpectedConditions.visibilityOf(Element));
				Element.sendKeys(value);
	}
	
	public static void highLightElement(WebElement Element,WebDriver driver){
		   JavascriptExecutor js = (JavascriptExecutor)driver;   
		   js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", Element);   
		 }
	
	/*public static void flash(WebElement Element ,WebDriver driver)
	{
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	String bgcolor = Element.getCssValue("Backgroundcolor");
	for(int i = 0;i<50; i++)
	{
		changecolor("rgb(0,200,0",Element,driver);
		changecolor(bgcolor,Element,driver);
	}
	}
	public static void changecolor(String color, WebElement Element ,WebDriver driver)
	
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].style.backgroundcolor = '"+color+"'", Element);
		
		try
		{ 
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			
		}
		*/
			
	}


