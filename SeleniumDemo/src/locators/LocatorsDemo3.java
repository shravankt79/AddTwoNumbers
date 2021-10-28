package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
         // Launch the Application
         driver.get("http://www.facebook.com/");
         driver.manage().window().maximize(); //maximize web page
         
         //Tag and ID combination
         //driver.findElement(By.cssSelector("#email")).sendKeys("shravanktms");
         //driver.findElement(By.cssSelector("input#email")).sendKeys("shravanktms");
         
         //Tag and Class Combination
         //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("shravanktms");
         //driver.findElement(By.cssSelector(".inputtext")).sendKeys("shravanktms");
         
         // Tag and Attribute combination
         //driver.findElement(By.cssSelector("[name=email]")).sendKeys("shravanktms");
         //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("shravanktms");
         
         //Tag,class and attribute combination
         driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("shravanktms");
         driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Tanishka123");
         
         
	}

}
