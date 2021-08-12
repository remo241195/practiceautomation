package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickelementbyjs {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		WebElement Signin = driver.findElement(By.className("login"));
		clickelebyjs(driver,Signin);
		WebElement useremail = driver.findElement(By.name("email"));
		sendkeys(driver,useremail,10,"rohiteceremo@gmail.com");
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
