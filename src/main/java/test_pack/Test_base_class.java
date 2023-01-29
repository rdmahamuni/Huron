package test_pack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import pom_pack.Loginpomclass;
import utility_pack.Utility_Class;

public class Test_base_class 
{

	WebDriver driver;
             Logger log       = Logger.getLogger("Huron pvt ltd"); 
	@Parameters( "browsername")
    @BeforeMethod 
    public void setup(String browsername, Object PropertyConfigurator) throws IOException
   {
		if(browsername.equals( "chome"))
   {System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");


	     driver = new ChromeDriver();}
 else {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\FireFoxdriver.exe");


     driver = new ChromeDriver();
 }
		PropertyConfigurator.Configure("log4j.properties");
		
	   driver.get("https://www.saucedemo.com/");
	   log.info( "url open");
	   
	   driver.manage().window().maximize();
	   log.info( "browser maximize");
	   
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	   Loginpomclass  x = new Loginpomclass (driver);
	   x.senduser();
	   x.sendpass();
	   x.logintab();
	   Utility_Class.getscreenshot( driver,"login page ");}
  
  
  @AfterMethod
 public void teardown()
 { driver.quit();
	   System.out.println("browser is closed");
 }
  
  
  
  
}
