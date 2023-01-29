package utility_pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class
{
	static WebDriver driver;
    public static void getscreenshot(  WebDriver driver ,String name) throws IOException
{
	 
	TakesScreenshot ts = (TakesScreenshot)driver;
	// file import from io 
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	File destfile = new File (" ./Screenshots/"+ name +".jpg");
	FileHandler.copy(sourcefile, destfile);
	
	
}
}
