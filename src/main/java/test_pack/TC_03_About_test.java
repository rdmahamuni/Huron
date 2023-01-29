package test_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_03_About_test extends Test_base_class 
{ 
	   @Test
	   public void Validation()
	   {
	   String ExpectedTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
	   String ActualTitle = driver.getTitle();
	   System.out.println(ActualTitle);
	   
	   Assert.assertEquals(ActualTitle,ExpectedTitle);
	   }
	  
	  
	  
	  
	  
	  
	  
}
