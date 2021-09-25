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



/****************  Creating Page Objects of Stock Listing Page *****************/

public class FinancerListPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public FinancerListPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),FinancerListPage.class);
		
	}

	private static String DSFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.ImageView[@index='0']";

	private static String MUFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1']//android.widget.ImageView[@index='0']";

	private static String MAFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']";
	
	private static String CNAFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='3']//android.widget.ImageView[@index='0']";
	
	private static String BuanaLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ImageView[@index='0']";
	
	private static String SinarmasLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='5']//android.widget.ImageView[@index='0']";
	
	private static String AdiraLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='6']//android.widget.ImageView[@index='0']";
	
	private static String BFILink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.ImageView[@index='0']";
	
	private static String MPMFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1']//android.widget.ImageView[@index='0']";
	
	private static String BCAMFLink="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']";
	
	public static String getDSFLink()
	{
		System.out.println("trying to find the DSF Link");
		return DSFLink;
		
		
	}
	
	public static String getBCAMFLink()
	{
		System.out.println("trying to find the BCAMFLink Link");
		return BCAMFLink;
		
		
	}
	
	public static String getMUFLink()
	{
		System.out.println("trying to find the MUF Link");
		return MUFLink;
		
		
	}
	
	public static String getMAFLink()
	{
		System.out.println("trying to find the MAF Link");
		return MAFLink;
		
		
	}
	
	public static String getCNAFLink()
	{
		System.out.println("trying to find the CNAFLink");
		return CNAFLink;
		
		
	}
	
	public static String getBuanaLink()
	{
		System.out.println("trying to find the BuanaLink");
		return BuanaLink;
		
		
	}
	
	public static String getSinarmasLink()
	{
		System.out.println("trying to find the SinarmasLink");
		return SinarmasLink;
		
		
	}
	
	public static String getAdiraLink()
	{
		System.out.println("trying to find the AdiraLink");
		return AdiraLink;
		
		
	}
	
	public static String getBFILink()
	{
		System.out.println("trying to find the BFILink");
		return BFILink;
		
		
	}
	
	public static String getMPMFLink()
	{
		System.out.println("trying to find the MPMFLink");
		return MPMFLink;
		
		
	}
	

}
	




/****************  Creating Page Objects of Stock Listing Page *****************/
