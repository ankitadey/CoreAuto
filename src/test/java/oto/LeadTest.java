package oto;

import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import io.appium.java_client.android.AndroidKeyCode;
import pages.DashBoardPage;
import pages.LeadPage;
import utility.CommonUtilMethods;


public class LeadTest extends Apache_POI_TC {
	
	String LeadName="LeadSix";
	
	@Test(priority=1)
	public void verifyLeadClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on Lead Link");
		
		
	    DashboardTest.driver1.findElementByXPath(DashBoardPage.getLeadLink()).click();
		
	    DashboardTest.logger.info("Lead Link is clicked");
	    DashboardTest.logger.info("Lead Page is opened");
	    
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void verifyClickAddLead() throws InterruptedException
	{
		
	    logger=report.createTest("Click on Add Lead Icon");
	    
		
	    driver1.findElementByXPath(LeadPage.getLeadAddIcon()).click();
		
	    logger.info("Add Lead Icon is clicked");
	    logger.info("Add Lead Page is opened");
	    
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void verifyFillLead() throws InterruptedException
	{
		
	    logger=report.createTest("Fill Lead Details");
	    
	    logger.info("Start filling lead details");
	    
	    driver1.findElementByXPath(LeadPage.getName()).sendKeys(LeadName);
	  
	    
	    Thread.sleep(3000);
	    
        driver1.findElementByXPath(LeadPage.getMobile()).sendKeys("8240724390");
	  
	    
	    Thread.sleep(3000);
	    
        driver1.findElementByXPath(LeadPage.getSource()).click();
	  
	    
	    Thread.sleep(5000);
	    
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		Thread.sleep(4000);
		
		 driver1.findElementByXPath(LeadPage.getSourceVal()).click();
		 
		 Thread.sleep(3000);
		 
        driver1.findElementByXPath(LeadPage.getFollowUpDate()).click();
		 
		Thread.sleep(4000);
		
		driver1.findElementById("android:id/button1").click();
		
		Thread.sleep(4000);
		
		driver1.findElementByXPath(LeadPage.getFollowUpTime()).click();
		 
		Thread.sleep(4000);
		
		
		driver1.findElementById("android:id/toggle_mode").click();
		
		Thread.sleep(4000);
        
		driver1.findElementByXPath(LeadPage.gethourval()).click();
		 
		Thread.sleep(4000);
		
		driver1.findElementByXPath(LeadPage.gethourval()).sendKeys("11");
		 
		Thread.sleep(4000);
		

        driver1.findElementById("android:id/input_minute").click();
		
		Thread.sleep(3000);
		
        driver1.findElementById("android:id/input_minute").sendKeys("15");
		
		Thread.sleep(3000);
		
        driver1.findElementById("android:id/button1").click();
		
		Thread.sleep(3000);
		
		driver1.findElementByXPath(LeadPage.getStatus()).click();
		 
		Thread.sleep(4000);
		
		driver1.findElementByXPath(LeadPage.getAddLeadButton()).click();
		 
		Thread.sleep(4000);
		
		
		/********************* Scroll Down Below ******************/
		
		cmn.scrollDown();
		Thread.sleep(4000);
		
		
		
		/********************* Scroll Down Below ******************/ 
		
		driver1.findElementByXPath(LeadPage.getsubmitbutton()).click();
		 
		Thread.sleep(4000);
		
		logger.info("Add Lead Page filled and redirected to Lead Listing Page");
		
	}
	
	
	@Test(priority=4)
	public void verifyLeadFinder() throws InterruptedException
	{
		
		logger=report.createTest("Verify the Lead Search");
		    
		logger.info("click on Lead Finder");
		driver1.findElementByXPath(LeadPage.getleadfinder()).click();
		 
		Thread.sleep(5000);
		System.out.println("Lead Entered is :"+LeadName);
		
		logger.info("click on Lead Search and Enter Lead Name");
		
		driver1.findElementByXPath(LeadPage.getSearchLeadTxtBox()).click();
		
		driver1.findElementByXPath(LeadPage.getSearchLeadTxtBox()).sendKeys(LeadName);
		
		/************* Pressing enter of Phone Keypad *************/
		
		driver1.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
		
		/************* Pressing enter of Phone Keypad *************/
		
		Thread.sleep(5000);
		
		logger.info("Lead is searched");
		
	}
	
	@Test(priority=5)
	public void verifyLeadFilter() throws InterruptedException
	{
		logger=report.createTest("Verify the Lead Filter");
	    
		logger.info("click on Lead Filter");
		
		driver1.findElementByXPath(LeadPage.getFilter()).click();
		 
		Thread.sleep(4000);
		
		driver1.findElementByXPath(LeadPage.getFilterstatus()).click();
		 
		driver1.findElementByXPath(LeadPage.getFiltersource()).click();
		
		driver1.findElementByXPath(LeadPage.getApplyFilter()).click();
		
		Thread.sleep(4000);
		
	}
	
	@Test(priority=6)
	public void verifyLeadSorting() throws InterruptedException
	{
        logger=report.createTest("Verify the Lead Sort");
	    
		logger.info("click on Lead Sort");
		
		driver1.findElementByXPath(LeadPage.getSort()).click();
		
		Thread.sleep(4000);
		
        driver1.findElementByXPath(LeadPage.getSortLastUpdated()).click();
		
		Thread.sleep(4000);
		
	}
	
	

	
}


