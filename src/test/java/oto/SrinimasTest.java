package oto;

import org.testng.annotations.Test;

import pages.CNAFPage;
import pages.DSFFinancerPage;
import pages.FinancerListPage;
import pages.MAFPage;
import pages.SinarmasPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class SrinimasTest {

	@Test(priority=1)
	public void verifyFirstStockClick() 
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    
		
	}
	
	@Test(priority=2)
	public void verifySinarmasClick() throws InterruptedException
	{
		Thread.sleep(5000);
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on Sinarmas Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getSinarmasLink()).click();
		
	    DashboardTest.logger.info("Sinarmas Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addMAFFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling Sinarmas Form");
		
		
	    DashboardTest.driver1.findElementByXPath(SinarmasPage.getApprovedPrice()).sendKeys("5000");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getInstallmentType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getInstallmentTypeVal()).click();
		Thread.sleep(4000);
		DashboardTest.driver1.findElementByXPath(SinarmasPage.gettenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.gettenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getInstallmentVal()).sendKeys("500");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getTotalDownpaymentVal()).sendKeys("1000");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getTotalPayFromFinancier()).sendKeys("1000");
		Thread.sleep(4000);
		
		
		//DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Continue\"));");
		//DashboardTest.driver1.scrollTo("Continue");
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getPaymentNeededByDealer()).sendKeys("500");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getUploadImageIcon()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getCameraIcon()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getCamera()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.gettickicon()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addMAFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getBranchName()).sendKeys("MAF Cengkareng");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(SinarmasPage.getbtnSubmit()).click();
		Thread.sleep(5000);
		
	}
	
	
	
}


