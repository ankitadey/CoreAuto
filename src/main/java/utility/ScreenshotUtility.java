package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;




public class ScreenshotUtility {

	public static String getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"\\Screenshots\\"+getCurrentDateTime()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println("Current date and time is " +date1);
		 
		 return date1;
		 
	}

}
