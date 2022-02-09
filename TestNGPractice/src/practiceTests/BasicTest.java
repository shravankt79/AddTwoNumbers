package practiceTests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class BasicTest {
 @BeforeMethod
  public void beforeMethod() {
      System.out.println("Launch the Browser");
  }
  @Test
  public void gmailLogin() {
    System.out.println("Gmail Logged in successfully");
  }
  @AfterMethod
  public void afterMethod() {
    System.out.println("Log out of Gmail and Close the Browser");  
  }
}
 