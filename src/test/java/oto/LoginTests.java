package oto;

//import base.BaseTests;
import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import pages.DashBoardPage;
import pages.LoginPage;


import static org.testng.Assert.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTests extends Apache_POI_TC {
	
	DashBoardPage dash;
	
	
	@Test(priority=1)
	public void clickLoginWithEmail() throws InterruptedException, IOException
	{
		//service=startServer();
		
		//driver=capabilities();
		
		
	
		logger=report.createTest("Click on Email Link");
		
		logger.info("Open Home Screen");
		//driver1.findElementByXPath("//android.widget.TextView[contains(@text,'Login with Email')]").click();
		//LoginPage loginp=new LoginPage(driver1);
		//loginp.loginWithEmailLink.click();
		
		logger.info("Click on Email Link");
		
		driver1.findElementByXPath(LoginPage.getloginWithEmailLink()).click();
	    
	    logger.pass("Email Link is clicked");
	
		
	}
	
	@Test(priority=2)
	public void verifyLogin() throws InterruptedException, IOException
	{
		//service=startServer();
		
		//driver=capabilities();
		
	
		logger=report.createTest("Login to APP");
		
		logger.info("Open Login Screen");
		
		//driver1.switchTo().frame(driver1.findElementById("android:id/content"));
		//Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		driver1.findElementByXPath(LoginPage.getEmailId()).clear();
		
		
		//System.out.println("email value is:"+email);
		
		driver1.findElementByXPath(LoginPage.getEmailId()).sendKeys(email);
		
		Thread.sleep(3000);
		
		driver1.findElementByXPath(LoginPage.getPass()).clear();
		
        driver1.findElementByXPath(LoginPage.getPass()).sendKeys(pass);
		
		Thread.sleep(3000);
		
		dash=LoginPage.clickLoginButton(driver1);
		
		
		Thread.sleep(5000);
	    
	     logger.pass("Successful Login and navigated to Dashboard");
	     
	     driver1.findElementByXPath(dash.getLoanLink()).click();
	
		
	}

	
	
}
