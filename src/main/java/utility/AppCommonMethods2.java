package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.LoginPage;

public class AppCommonMethods2 {
	
	static LoginPage login;
	
	 public static AndroidDriver<AndroidElement>  driver1;
	
	// public static FileInputStream fis;
	
	public static AndroidDriver<AndroidElement> capabilities(File app, String device) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 
		
		 
		/* if(device.contains("emulator"))
		 {
		    startEmulator();
		 }*/
		 
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		 //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		 capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 System.setProperty("webdriver.http.factory", "apache");
		 driver1 = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 return driver1;
	} 

	
	
	public void Wait(int TimeInSecs) 
	{
		try 
		{
			TimeInSecs = TimeInSecs*1000; //converting milliseconds to seconds
			Thread.sleep(TimeInSecs);
			//log.info("Applying some Wait on the WebDriver. Wait = " + TimeInSecs/1000 + " seconds." );
		}
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
			//log.error("Not able to apply Wait time on the WebDriver.");
		}
	}//End of method
	    	 
  	
}
