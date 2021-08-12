package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEBtable {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.selenium.dev/downloads/");
		   driver.manage().window().maximize();
		   //how many rows in a table
		  int row = driver.findElements(By.xpath("//table[@class = 'data-list']//tbody/tr")).size();
 //how many no of column in a webtable
		  int col =driver.findElements(By.xpath("//table[@class = 'data-list']//tr/th")).size();
		  
		  //retrieve the specific row/column data
		  String value = driver.findElement(By.xpath("//table[@class = 'data-list']//tbody/tr[3]/td[1]")).getText();
		  
		  //retrieve all the data from the row/column
		  
//		  for(int r=1;r<=row;r++)//below case we came to know how to parametrize x path 
//		  {
//			  for(int c = 1;c<=col;c++)
//			  {
//				  String value1 = driver.findElement(By.xpath("//table[@class = 'data-list']//tbody/tr["+r+"]/td["+c+"]")).getText();
//				  System.out.print(value1+" ");
//			  }
//			  System.out.println();
			  
	//print release date and version no of java language 
			  
			  for(int m= 1;m<=row;m++)
				  
				  
			  {
				  
				  String laungage =  driver.findElement(By.xpath("//table[@class= 'data-list']//tr["+m+"]/td[1]")).getText();
				 
				  if(laungage.equals("Java"))
				  {
				
				  String version= driver.findElement(By.xpath("//table[@class = 'data-list']//tr["+m+"]/td[2]")).getText();
				  System.out.println(version);
				  String releasedate= driver.findElement(By.xpath("//table[@class = 'data-list']//tr["+m+"]/td[3]")).getText();
				  System.out.println(releasedate);
				  }
			  }
			  
		  }
	}
	


