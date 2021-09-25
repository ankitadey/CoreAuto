package oto;

import org.testng.annotations.Test;


import pages.FinancerListPage;
import pages.MPMFPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class MPMFTest  {
	
	
	@Test(priority=1)
	public void verifyFirstStockClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    Thread.sleep(5000);
	    
	    DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"CSUL\"));");
	   	
		
	}
	
	@Test(priority=2)
	public void verifyMPMFClick() throws InterruptedException
	{
		Thread.sleep(3000);
	    DashboardTest.logger=DashboardTest.report.createTest("Click on MPMF Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getMPMFLink()).click();
		
	    DashboardTest.logger.info("MPMF Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addMPMFFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling MPMF Form");
		
	
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getCustRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(MPMFPage.getCustRegionValJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getPlateNumberRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(MPMFPage.getPlateNumberRegionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getBrand()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getSearchBrandTextbox()).sendKeys("Honda");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getSearchBoxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getModel()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getSearchModelTextbox()).sendKeys("Accord");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getSearchModelTextboxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getVersion()).sendKeys("ASD");
		Thread.sleep(4000);
		DashboardTest.driver1.findElementByXPath(MPMFPage.getVehicleType()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(MPMFPage.getVehicleTypeVal()).click();
		Thread.sleep(4000);
		
	
		DashboardTest.driver1.findElementByXPath(MPMFPage.getMfgYear()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getMfgYearVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getInsuranceType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getInsuranceTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getUsageType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getUsageTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getTenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getTenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getMRPTextbox()).sendKeys("30000001");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addDSFPaymentDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(MPMFPage.getPaymentEditBox()).sendKeys("2000000");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getContinueButtonP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Proceed\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getProceedButton()).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void addDSFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(MPMFPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getBranchName()).sendKeys("MPMF Semarang");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MPMFPage.getbtnSubmit()).click();
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


