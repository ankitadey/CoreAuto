package oto;

import org.testng.annotations.Test;

import pages.MUFFinancerPage;
import pages.FinancerListPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class MUFTest  {
	
	
	@Test(priority=1)
	public void verifyFirstStockClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void verifyMUFClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on DSF Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getMUFLink()).click();
		
	    DashboardTest.logger.info("MUF Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addDSFFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling MUF Form");
		
		
	    DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustomerType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustomerTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustRegionValJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getPlateNumberRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getPlateNumberRegionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getBrand()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getSearchBrandTextbox()).sendKeys("Honda");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getSearchBoxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getModel()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getSearchModelTextbox()).sendKeys("Accord");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getSearchModelTextboxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getVersion()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getSearchVersionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getMfgYear()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getMfgYearVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getInsuranceType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getInsuranceTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getTenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getTenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getMRPTextbox()).sendKeys("30000001");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getPricingUpping()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getPricingUppingVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addDSFPaymentDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getPaymentEditBox()).sendKeys("2000000");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getContinueButtonP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Proceed\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getProceedButton()).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void addDSFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getLoanType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getLoanTypeVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getBranchName()).sendKeys("MUF Bekasi");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MUFFinancerPage.getbtnSubmit()).click();
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


