package allureReports;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class Tests extends BaseClass 
{
    public WebDriver driver;
    
    @BeforeClass
    public void setup()
    
    { 
      // this below lines to call and initialize driver from BaseClass	
    	 BaseClass bs=new BaseClass();
    	 bs.initialize_driver();
    	 
      // this below lines for call driver locally with in the class
    	//WebDriverManager.chromedriver().setup();
    	//driver = new ChromeDriver(); // creating the driver
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
    	driver.get("https://demo.nopcommerce.com/"); // launching the browser
    	driver.manage().window().maximize();
    		
    }
    
    @Test(priority=1, description="Verify Logo presence on Home Page") // Annotation by using TestNG
    @Description("Verify Logo presence on Home Page......") // Annotation by using Allure
    @Epic("EP001")   // Annotation from Allure
    @Feature("Feature1: Logo") // Annotation using Allure
    @Story("Story: Logo Presence") // Annotation using Allure
    @Step("Verify logo Presence") // Annotation using Allure
    @Severity(SeverityLevel.MINOR) // Annotation using Allure
    public void logoPresence()
    {
    	 boolean disstatus=driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
         Assert.assertEquals(disstatus, true);		
    }
    @Test(priority=2)
    @Description("Verify Logo presence on Home Page......") // Annotation by using Allure
    @Epic("EP001")   // Annotation from Allure
    @Feature("Feature2: Login") // Annotation using Allure
    @Story("Story: Valid login") // Annotation using Allure
    @Step("Verify login") // Annotation using Allure
    @Severity(SeverityLevel.BLOCKER) // Annotation using Allure
    public void loginTest()
    {
    	driver.findElement(By.linkText("Log in")).click();
    	driver.findElement(By.id("Email")).sendKeys("shravankt79@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("Test@123");
    	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    	
    	Assert.assertEquals(driver.getTitle(),"nopCommerce demo store"); // to Pass the test case
    	//Assert.assertEquals(driver.getTitle(),"nopCommerce demo store123"); // to fail the test case
      
    }
    @Test(priority=3)
    @Description("Verify User Registration......") // Annotation by using Allure
    @Epic("EP001")   // Annotation from Allure
    @Feature("Feature3: Registration") // Annotation using Allure
    @Story("Story:User registration") // Annotation using Allure
    @Severity(SeverityLevel.NORMAL) // Annotation using Allure
    public void registrationTest()
    {
    	throw new SkipException("Skipping this Test");
    	
    }
    @AfterClass
    public void tearDown()
    {
     driver.quit(); 
    	
    }
    
 }
    

