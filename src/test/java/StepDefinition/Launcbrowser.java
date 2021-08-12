package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launcbrowser {

	public static void main(String[] args) {
		
		/*System.setProperty("WebDriver.Chrome.driver", "C:/Users/Rohit/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();*/
       /* ****WebDriverManager is an api ***** */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//if we want to use specific version of browser we can do so using below code
		//WebDriverManager.chromedriver().browserVersion("84.0.4103").setup();
		
	}

}
