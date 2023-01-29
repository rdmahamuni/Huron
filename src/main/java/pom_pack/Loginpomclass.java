package pom_pack;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass 
{
//1.
	private WebDriver driver;

//2. 
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement  logintab;

//3
	public void senduser()
	{
	    username.click();
		username.sendKeys("standard_user");
	}
	
	public void sendpass()
	{
		password.click();
		password.sendKeys("secret_sauce");
	}
	
	public void logintab()
	{
		logintab.click();	
	}
	
//4
	
	public Loginpomclass(WebDriver driver)
	{
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	

}
