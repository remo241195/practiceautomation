package StepDefinition;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlecookie {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://demo.nopcommerce.com/");
		   driver.manage().window().maximize();
		   //how to capture cookie from browser
		   
		   Set<Cookie> cookies =   driver.manage().getCookies();
		   
		     System.out.println(cookies.size());
		     
		     //how to print cookie from browser
		     for(Cookie c : cookies)
		     {
		    	 System.out.println(c.getName()+ " "+c.getValue());
		    	 }
             //how to add cookie into browser
		     Cookie cookieobj = new Cookie("sysksled","2345566")  ;
		    		 driver.manage().addCookie(cookieobj);
		    		 for(Cookie c : cookies)
				     {
				    	 System.out.println(c.getName()+ " "+c.getValue());
				    	 }
		    		// Set<Cookie> cookies =   driver.manage().getCookies();
		  		   
				     System.out.println(cookies.size());
				     
				     //delete cookies
				     driver.manage().deleteCookieNamed("_gat");
				     System.out.println(cookies.size());
				     driver.quit();
	}

}
