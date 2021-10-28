package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo4_Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
         // Launch the Application
         driver.get("http://automationpractice.com/index.php");
         driver.manage().window().maximize(); //maximize web page
         
         //Absolute Xpath for static xpath suggested not to used because the nodes place may changed or node may be deleted in future so there is a chance of xpath link may broke node to node.
         //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-Shirts");
         //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
         
         //Relative Xpath for static xpath which is mostly used because the nodes can not be disconnected or xpath will not break 
         //driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-Shirts");
         //driver.findElement(By.xpath("//button[@name='submit_search']")).click();
         
         //Xpath or and contains(),Starts-with(),text() and Chained xpath for dynamic xpaths
         //xpath with 'or' 1. True or False 2.False or True
         //driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_queryX']")).sendKeys("T-Shirts");
         //driver.findElement(By.xpath("//button[@name='submit_searchX' or @class='btn btn-default button-search']")).click();
         
         //Xpath with 'and' 1. True and True 2.True and True
         //driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-Shirts");
         //driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
         
         //Xpath with 'Contains' 'input[contains(@id,'st')]' / contains[starts-with(@id,'st')] for Dynamic Xpath
         //driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-Shirts"); //id=search_query_top
         //driver.findElement(By.xpath("//button[contains(@name, 'search')]")).click(); //name=submit_search
         
         //Xpath with start-with()
         //driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-Shirts"); //id=search_query_top
         //driver.findElement(By.xpath("//button[starts-with(@name, 'submit_')]")).click(); //name=submit_search
         
         //Xpath with text()
         //driver.findElement(By.xpath("//a[text()='Women']")).click(); //WOMEN Tab
         
          //Chained Xpath
         driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-Shirts");
         driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
           
	}

}
