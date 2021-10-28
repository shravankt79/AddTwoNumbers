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
         
         // to written multiple web elements as class name
         int sliders=driver.findElements(By.className("homeslider-container")).size();
         System.out.println(sliders);
         
         // to present all multiple links in web page as Tag name
         int links=driver.findElements(By.tagName("a")).size();
         System.out.println(links); 
         
	}

}
