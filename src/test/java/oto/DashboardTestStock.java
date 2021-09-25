package oto;

import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import pages.DashBoardPage;
import pages.StockListPage;

public class DashboardTestStock extends Apache_POI_TC {
	
	@Test(priority=1)
	public void verifyStockClick() throws InterruptedException
	{
		Thread.sleep(5000);
	    logger=report.createTest("Click on Stock Link");
		
		
		driver1.findElementByXPath(DashBoardPage.getStockLink()).click();
		
		logger.info("Stock Link is clicked");
		
		Thread.sleep(5000);
		
	}
	
		
		
	
	
	
		
	}
	
	



