package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo5_XPathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
         // Launch the Application
         driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
         driver.manage().window().maximize(); //maximize web page
         
         //Self node
        String text= driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/self::a")).getText();
        System.out.println(text);
        
        //Parent node
        text= driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/parent::td")).getText();
        System.out.println(text);
        
        //Child node 
        List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'India Cements Lt')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements:"+childs.size());
        
        //Ancestor
        text= driver.findElement(By.xpath("//a[contains(text(),'India Cements Lt')]/ancestor::tr")).getText();
        System.out.println(text);
        
        // Descendant
        List<WebElement>descendants=driver.findElements(By.xpath("//a[contains(text(),'India Cements Lt')]/ancestor::tr/descendant"));
        System.out.println("Number of descendant nodes:"+descendants.size());
        
        // following -selects everything in the document after the closing tag of the current node
        driver.close();
                
	}

}
