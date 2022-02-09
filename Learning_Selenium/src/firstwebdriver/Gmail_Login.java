package firstwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Gmail_Login{
   public static void main(String[] args) {
      //System.setProperty("webdriver.gecko.driver","C:\\Users\\shrav\\selenium-3.141.59\\geckodriver.exe");
      //WebDriver driver = new FirefoxDriver();
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\selenium-3.141.59\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();

      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://accounts.google.com/signin");
      //identify email
      WebElement l = driver.findElement(By.name("identifier"));
      l.sendKeys("shravankt85@gmail.com");
      WebElement b = driver.findElement(By.className("VfPpkd-RLmnJb"));
      b.click();
      //identify password
      WebElement p = driver.findElement(By.name("password"));
      p.sendKeys("Tanishka927");
      b.click();
      //close browser
      driver.close();
   }
}