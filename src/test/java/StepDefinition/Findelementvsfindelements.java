package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelementvsfindelements {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		  
		    WebDriver driver = new ChromeDriver();

		 /*  findelement()  1) if single webelement present -- returns single element
		  *  2)if multiple webelement present(locators pointing to multiple ele)  -- returns first  element
		  *    3)element not present -- throws nosuchelementfound exception
		  *    4)return type -- webelement
		  *    5)Access type -- directly
		  *    
		  *    Findelements()  -if single webelement present -- returns single element
		  * 2)if multiple webelement present(locators pointing to multiple ele)  -- returns all  elements  
		  *  3)element not present -- throws no exception ,returns zero element  
		  *   4)return type -- list<webelement>
		  *   5)Access type -- iterate the list of elements
		  *   
		  *   gettext() --returns the inner text of the element
		  *   getAttribute() -- fetches the text contained by an attribute in an html document.
		  *   */
		    
		    
	}

}
