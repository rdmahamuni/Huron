package test_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_02_Logout_test extends Test_base_class 
{ 
	   @Test
	  public void validaion()
	  {
		  
	  
	   // validation for log out
	  String expectedTitle = "Swag Labs";   
	  String ActualTitle = driver.getTitle();
	  System.out.println(ActualTitle);
	  Assert.assertEquals(ActualTitle,expectedTitle);
	  }
}
	  
	  
	  
	  
	  
	  
	  
	  
	  


