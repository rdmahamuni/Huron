package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About_pomclass
{
 //1
	private WebDriver driver;
	
	//2
	
	@FindBy (xpath="//button[@id= 'react-burger-menu-btn']")
	private WebElement menutab;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	
	//3
	public void meutabclik()
	{
		menutab.click();
	}
 
	public void aboutclick()
	{
		about.click();
	}
	
	//4
	public About_pomclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
