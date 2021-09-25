package oto;

import org.testng.annotations.Test;

import pages.AdiraPage;
import pages.BFIPage;
import pages.DSFFinancerPage;
import pages.FinancerListPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class BFITest  {
	
	
	@Test(priority=1)
	public void verifyFirstStockClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"CSUL\"));");
	}
	
	@Test(priority=2)
	public void verifyBFIClick() throws InterruptedException
	{
		Thread.sleep(3000);
	    DashboardTest.logger=DashboardTest.report.createTest("Click on BFI Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getBFILink()).click();
		
	    DashboardTest.logger.info("BFI Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addBFIFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling BFI Form");
		
	    
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustRegionValJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustomerAge()).sendKeys("18");
		Thread.sleep(4000);
		
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getBrand()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getSearchBrandTextbox()).sendKeys("Honda");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getSearchBoxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getModel()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getSearchModelTextbox()).sendKeys("Accord");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getSearchModelTextboxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getVersion()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getSearchVersionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getMfgYear()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getMfgYearVal()).click();
		Thread.sleep(4000);
		
	
		DashboardTest.driver1.findElementByXPath(BFIPage.getInsuranceType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getInsuranceTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getUsageType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getUsageTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getTenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getTenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getMRPTextbox()).sendKeys("30000001");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addDSFPaymentDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(BFIPage.getPaymentEditBox()).sendKeys("2000000");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getContinueButtonP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Proceed\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getProceedButton()).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void addDSFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getBranchName()).sendKeys("BFI Dumai");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(BFIPage.getbtnSubmit()).click();
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


