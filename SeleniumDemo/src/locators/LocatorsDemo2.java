package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
         // Launch the Application
         driver.get("http://automationpractice.com/index.php");
         driver.manage().window().maximize(); //maximize web page
         
         // findElements is a method which will written multiple web elements by using class name. 
         int sliders=driver.findElements(By.className("homeslider-container")).size(); // sliders is a variable to find multiple slides.
         System.out.println(sliders);
         
         // to present all multiple links in web page as Tag name
         int links=driver.findElements(By.tagName("a")).size(); // size() method will find number of web elements, int is a variable type.
         System.out.println(links); 
         
         // to close current window of web
         driver.close();
	}

}
