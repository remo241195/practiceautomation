package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    
  WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.snapdeal.com/");
    
    
    //driver.get("https://www.amazon.in/");
    driver.navigate().to("https://www.amazon.in/");
    
    driver.navigate().back();
     driver.navigate().forward();//amazon
     
     driver.navigate().refresh();
     
     

	}

}
