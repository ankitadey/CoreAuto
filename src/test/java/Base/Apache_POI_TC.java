package Base;

import org.apache.commons.mail.EmailException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.remote.MobileCapabilityType;

import utility.EmailUtil;
import utility.ScreenshotUtility;
import utility.constant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
//import org.apache.log4j.xml.DOMConfigurator;
//import DbConnection.connection;
import java.util.Date;
import java.util.Properties;
import utility.AppCommonMethods;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Apache_POI_TC {
		
	static Date now = new Date();
	public static String TimeStamp = now.toString().replace(":", "-");
	
	
	 public WebDriver driver;
	 
	 public static AndroidDriver<AndroidElement>  driver1;
	 //protected HomePage homePage;
	 
      public static ExtentReports report;
	 
	 public static com.aventstack.extentreports.ExtentTest logger;
	 public static ExtentHtmlReporter extent;
	 
	 public static FileInputStream fis;
	 Properties prop;
	 
	 protected String email;
	 
	 protected String pass;
	 
	 public int App_Open=0;
	 
	 Properties prop1;
     FileInputStream fis1;
	 
    public static String ExistingCustVal,CustDistanceVal;
    
    
	
	
 @BeforeSuite
	public void setUpSuite()
	{
	
		extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"\\Reports\\"+TimeStamp+constant.Project_Name + "_AutomationReport.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\resources\\global.properties");
			
			fis1=new FileInputStream(System.getProperty("user.dir")+"\\resources\\xpathconstants.properties");
			
			
		        
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	
@BeforeTest
public void Execution() throws Exception 
{

      
//	DOMConfigurator.configure("log4j.xml");
	
	if(constant.PlatForm_Name.equals("web"))
	{ 
		
		if(constant.Project_Name.equals("Herokuapp"))
		{
			
			 System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.get("https://the-internet.herokuapp.com/");

		      //  homePage = new HomePage(driver);
			driver.manage().window().maximize();
		
		       
		} else if (constant.Project_Name.equals("SFA"))
		{
			
			
		}
		
		
	}  
	
	else if(constant.PlatForm_Name.equals("app")){
		
		
	
						if(constant.Project_Name.equals("OTO"))
						{
							prop=new Properties();
							prop.load(fis);
							
							
							 File appDir = new File("src");
						     File app = new File(appDir,(String)prop.get("APPName"));
						     String device=(String) prop.get("device");
						    
							
						    email=(String) prop.get("uname");
						     pass=(String) prop.get("password");
						     
						    driver1= AppCommonMethods.capabilities(app,device);
					        Thread.sleep(5000);
					        
					        AppCommonMethods.clickLoginWithEmail();
					        
					        Thread.sleep(3000);
					        
					        AppCommonMethods.verifyLogin(email, pass);
					        
					        Thread.sleep(3000);
					        
					        prop1=new Properties();
					        
						    prop1.load(fis1);
					       
						    ExistingCustVal=(String)prop1.get("ExistingCust");
						    
						    
							CustDistanceVal=(String)prop1.get("CustDistanceVal");
							
							System.out.println("CustDistanceVal:"+CustDistanceVal);
					         
					      //  logger.info("Successful Login and navigated to Dashboard");
					        
					      
						}else if(constant.Project_Name.equals("SFA"))
									{ 
								      // Run This Code---------------
									  System.out.println("Empty Result");
										    	   
									}
	}
	
	else if(constant.PlatForm_Name.equals("API")){
		
		if(constant.Project_Name.equals("EvaluatorREST"))
		{
			
			System.out.println("Rest Assured Project");
		}
	}
	
}








@AfterMethod
public void tearDownMethod(ITestResult result) throws IOException
{
	//System.out.print(result.getStatus());
	
	 if (result.getStatus() == ITestResult.FAILURE) {
		 

		 String screenshotPath= ScreenshotUtility.getScreenshot(driver);
		 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " Test case FAILED due to below issues:", ExtentColor.RED));
	       
	     // logger.fail(result.getThrowable());
	        logger.addScreenCaptureFromPath(screenshotPath);
	        
	        //Email.sendEmail();
	        
	        
	        
	        
	    } else if (result.getStatus() == ITestResult.SUCCESS) {
	    	logger.log(
	                Status.PASS,
	                MarkupHelper.createLabel(result.getName()
	                        + " Test Case PASSED", ExtentColor.GREEN));
	    } else {
	    	logger.log(
	                Status.SKIP,
	                MarkupHelper.createLabel(result.getName()
	                        + " Test Case SKIPPED", ExtentColor.ORANGE));
	    	//logger.skip(result.getThrowable());
	    }

	
	
}



@AfterTest
public void tearDown()
{
	try
	{
		driver1.quit();
		
        
	}
	
	catch(Exception e)
	{
		System.out.println("Driver not closed:"+e.getMessage());
	}
}

@AfterSuite
public void EndSuite() throws EmailException
{
    report.flush();
    
	
	System.out.println("Close ExtentReport");
	//EmailUtil.sendEmail();

	
}

}