package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // set the Chrome driver path
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
          // launch the driver
          WebDriver driver=new ChromeDriver();
          
          // Launch the Application
          driver.get("http://automationpractice.com/index.php");
          driver.manage().window().maximize(); //maximize web page
          
          //id & name locators
          WebElement searchbox=driver.findElement(By.id("search_query_top")); // locate the element by using id
          searchbox .sendKeys("T-shirts");
          driver.findElement(By.name("submit_search")).click();               // Submit search button by name
          
          //link test
          driver.findElement(By.linkText("Printed Chiffon Dress")).click();
          // partial link
          //driver.findElement(By.partialLinkText("Chiffon Dress")).click();   
  
	} 

}
 