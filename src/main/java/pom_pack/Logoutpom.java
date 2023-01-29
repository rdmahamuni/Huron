package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpom 
{

	//1
	private WebDriver driver;
	
	//2
	@FindBy (xpath="//button[@id= 'react-burger-menu-btn']")
	private WebElement menutab;
	
	@FindBy (xpath="(//a[@class='bm-item menu-item'])[3]")
	private WebElement logout;
	
	public void meutabclik()
	{
		menutab.click();
	}
	
	public void logoutclick()
	{
		logout.click();
	}
	
	public  Logoutpom(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
}
