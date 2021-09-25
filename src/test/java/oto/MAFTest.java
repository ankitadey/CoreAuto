package oto;

import org.testng.annotations.Test;

import pages.CNAFPage;
import pages.DSFFinancerPage;
import pages.FinancerListPage;
import pages.MAFPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class MAFTest {

	@Test(priority=1)
	public void verifyFirstStockClick() 
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Stock Test Case");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    
		
	}
	
	@Test(priority=2)
	public void verifyCNAFClick() throws InterruptedException
	{
		Thread.sleep(5000);
		
	    DashboardTest.logger=DashboardTest.report.createTest("Financier List Test Case");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getMAFLink()).click();
		
	    DashboardTest.logger.info("MAF Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addMAFFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("MAF Financier Test Case");
	    DashboardTest.logger.info("Start Filling MAF Financier Form");
		
	    DashboardTest.driver1.findElementByXPath(MAFPage.getApprovedPrice()).sendKeys("5000");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getInstallmentType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getInstallmentTypeVal()).click();
		Thread.sleep(4000);
		DashboardTest.driver1.findElementByXPath(MAFPage.gettenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.gettenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getInstallmentVal()).sendKeys("500");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getTotalDownpaymentVal()).sendKeys("1000");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getTotalPayFromFinancier()).sendKeys("1000");
		Thread.sleep(4000);
		
		
		//DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Continue\"));");
		//DashboardTest.driver1.scrollTo("Continue");
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getPaymentNeededByDealer()).sendKeys("500");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getUploadImageIcon()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getCameraIcon()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getCamera()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.gettickicon()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addMAFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(MAFPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getBranchName()).sendKeys("MAF Cengkareng");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(MAFPage.getbtnSubmit()).click();
		Thread.sleep(5000);
		
		DashboardTest.logger.info("End Filling MAF Financier Form");
		
	}
	
	
	
}


