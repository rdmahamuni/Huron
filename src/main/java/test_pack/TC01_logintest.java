package test_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_logintest  extends Test_base_class 
{ 
  @Test
  public void validation()
  {  // validation for login
	   String expectedTitle = "Swag Labs";
	   String ActualTitle = driver.getTitle();
	   System.out.println(ActualTitle);
	    Assert.assertEquals(ActualTitle,expectedTitle);
  }
 
	       
}


