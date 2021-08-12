package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		   driver.get("https://demo.nopcommerce.com/");
		   driver.manage().window().maximize();
     WebElement bordervalue = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    // JavaScriptExecutorDemo.drawborder(bordervalue,driver);
     
    // JavaScriptExecutorDemo.refreshyjs(driver);
     
     System.out.println(JavaScriptExecutorDemo.gettitlebyjs(driver));
     
     WebElement click = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
    // JavaScriptExecutorDemo.clickbyjs(click, driver);
   //  JavaScriptExecutorDemo.scrollverticaldownbyjs(driver);
     
    // JavaScriptExecutorDemo.scrollverticalupbyjs(driver);
     JavaScriptExecutorDemo.flashbyjs(click, driver);
     
     
	}
     //method to draw a border 
	public static void drawborder(WebElement ele , WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].style.border='5px solid red'", ele);
	}
	//method to print the title of webpage
	
	public static String gettitlebyjs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	//method to click the element
	
	public static void clickbyjs(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", ele);
	}
	//refresh browser by js
	public static void refreshyjs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("history.go(0)");
	}
	
	//method to scroll down vertical down
	
	public static void scrollverticaldownbyjs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	

	public static void scrollverticalupbyjs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	}
	
	//method to flash the element
	
	public static void flashbyjs(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  String bgcolor =   ele.getCssValue("background-color");
		  for(int i = 0;i <50;i++)
		  {
			  changecolor("rgb(0,200,0)",ele,driver);//1
			  changecolor("bgcolor",ele,driver);//2
		  }
	}
		  
		  public static void changecolor(String color,WebElement ele,WebDriver driver)
		  {
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("aguments[0].style.backgroundColor='"+color+"'", ele);
	            try {
	                Thread.sleep(20);
	          
	            }catch (InterruptedException e) {
	              
	        }

		  
	}
	
	
}
