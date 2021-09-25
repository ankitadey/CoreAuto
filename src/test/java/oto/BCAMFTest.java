package oto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import pages.AdiraPage;
import pages.BCAMFPage;
import pages.DSFFinancerPage;
import pages.FinancerListPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class BCAMFTest  {
	
	@Test(priority=1)
	public void verifyFirstStockClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    Thread.sleep(5000);
	    
	    DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"BCAMF\"));");
		
	}
	
	@Test(priority=2)
	public void verifyBCAMFClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on BCAMF Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getBCAMFLink()).click();
		
	    DashboardTest.logger.info("BCAMF Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addBCAMFFormBasicDetails() throws InterruptedException, IOException
	{
		
	   
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling BCAMF Form");
		
	    DashboardTest.driver1.findElementByXPath(BCAMFPage.getCustDistance()).click();
		Thread.sleep(4000);
		
		
		BCAMFPage.getCustDistanceVal(DashboardTest.CustDistanceVal,DashboardTest.driver1).click();
		Thread.sleep(4000);
		
		/*DashboardTest.driver1.findElementByXPath(AdiraPage.getExistingCustYes()).click();
		Thread.sleep(4000);*/
	  
		DashboardTest.driver1.findElementByXPath(AdiraPage.getCustRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(AdiraPage.getCustRegionValJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getOccupation()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(AdiraPage.getOccupationJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getPlateNumberRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(AdiraPage.getPlateNumberRegionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getBrand()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getSearchBrandTextbox()).sendKeys("Honda");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getSearchBoxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getModel()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getSearchModelTextbox()).sendKeys("Accord");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getSearchModelTextboxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getVersion()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getSearchVersionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getVehicleType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getVehicleTypeVal()).click();
		Thread.sleep(4000);
		

		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getMfgYear()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getMfgYearVal()).click();
		Thread.sleep(4000);
		
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getInsuranceType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getInsuranceTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getUsageType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getUsageTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getTenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getTenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getMRPTextbox()).sendKeys("30000001");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addDSFPaymentDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(AdiraPage.getPaymentEditBox()).sendKeys("2000000");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getContinueButtonP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Proceed\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getProceedButton()).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void addDSFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(AdiraPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getBranchName()).sendKeys("Adira Serang");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(AdiraPage.getbtnSubmit()).click();
		Thread.sleep(5000);
		
	}
	
	
	/*@Test(priority=6)
	public void addDocument() throws InterruptedException
	{
		
		
		DashboardTest.driver1.findElementByXPath(FinancerAddPage.getFrontSide()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(FinancerAddPage.getFrontSide()).click();
		
		Thread.sleep(5000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getCameraIcon()).click();
		
		Thread.sleep(5000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getCamera()).click();
		
		Thread.sleep(10000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getIdCardCustomer()).click();
		
		Thread.sleep(5000);
		
		
	}*/
}


