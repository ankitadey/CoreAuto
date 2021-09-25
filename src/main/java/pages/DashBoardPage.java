package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



/****************  Creating Page Objects of DashBoard Page *****************/

public class DashBoardPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public DashBoardPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),DashBoardPage.class);
		
	}

	private static String LoanLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']";

	private static String LeadLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']";

	
	private static String SubmitLink="//android.widget.TextView[contains(@text,'Submit')]";
	
	private static String StockLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']";

	private static String Submit1Link="//android.widget.TextView[contains(@text,'Submit1')]";
	
	private static String StockAddIcon="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='2']//android.widget.TextView[contains(@text,'Active Stock')]/parent::android.view.ViewGroup/android.view.ViewGroup[@index='5']";
	
	
	public static String getLoanLink()
	{
		System.out.println("trying to find the Loan Link Field");
		return LoanLink;
		
		
	}
	
	public static String getLeadLink()
	{
		System.out.println("trying to find the Lead Link Field");
		return LeadLink;
		
		
	}
		
	public static String getSubmitLink()
	{
		System.out.println("trying to find the Submit Link Field");
		return SubmitLink;
		
		
	}
	public static String getStockLink()
	{
		System.out.println("trying to find the Stock Link Field");
		return StockLink;
		
		
	}
	
	public static String getStockAddIcon()
	{
		System.out.println("trying to find the Add Stock Link Field");
		return StockAddIcon;
		
		
	}
}




/****************  Creating Page Objects of DashBoard Page *****************/
