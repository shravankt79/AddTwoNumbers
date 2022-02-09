package firstwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First_WebdriverClass {

public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\Users\\shrav\\selenium-3.141.59\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
String appTitle=driver.getTitle();
String expTitle="Google";
if (appTitle.equals (expTitle)){
System.out.println("Verification Successfull");
}
else{
System.out.println("Verification Failed");

}
driver.close();
System.exit(0);
}
}