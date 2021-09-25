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



/****************  Creating Page Objects of Lead Page *****************/

public class LeadPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public LeadPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),LeadPage.class);
		
	}

	private static String LeadAddIcon="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='2']//android.widget.TextView[contains(@text,'Leads')]/parent::android.view.ViewGroup/android.view.ViewGroup[@index='4']";

	
	private static String Name="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='1']/android.widget.EditText[@index='2']";
	
	private static String Mobile="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='4']/android.widget.EditText[@index='2']";
	
	private static String Source="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='8']//android.view.ViewGroup[@index='1']";
	
	private static String FollowUpDate="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='10']//android.view.ViewGroup[@index='1']";
	
	private static String FollowUpTime="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='11']//android.view.ViewGroup[@index='1']";
	
	private static String TimeVal="//android.widget.FrameLayout[@index='0']//android.view.View[@index='1']//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@index='1']";
	
	private static String SourceVal="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'OTO')]/parent::android.view.ViewGroup";
	
	
	private static String status="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.widget.ScrollView[@index='13']//android.widget.TextView[contains(@text,'Interested')]/parent::android.view.ViewGroup";
	
	private static String hourval="//android.widget.EditText[contains(@resource-id,'android:id/input_hour')]";
	
	private static String submitbutton="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='37']";
	
	private static String AddLeadButton="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='3']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='15']";
	
	
	private static String leadfinder="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='2']//android.widget.TextView[contains(@text,'Lead Finder')]/parent::android.view.ViewGroup";
	
	private static String SearchLeadTxtBox="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='2']//android.widget.EditText[contains(@text,'Search lead')]";
	
	
	private static String Filter="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='1']//android.view.ViewGroup[@index='1']";
	
	
	private static String Filterstatus="//android.widget.FrameLayout[@index='0']//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']//android.widget.TextView[contains(@text,'Interested')]/parent::android.view.ViewGroup";
	
	private static String Filtersource="//android.widget.FrameLayout[@index='0']//android.widget.ScrollView[@index='3']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'OTO')]/parent::android.view.ViewGroup";
	
	private static String ApplyFilter="//android.widget.FrameLayout[@index='0']//android.widget.TextView[contains(@text,'Apply Filter')]/parent::android.view.ViewGroup";
	
	private static String Sort="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'Sort')]/parent::android.view.ViewGroup";
	
	private static String SortLastUpdated="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'Last Updated')]/parent::android.view.ViewGroup";
	
	public static String getLeadAddIcon()
	{
		System.out.println("trying to find the LeadAddIcon Field");
		return LeadAddIcon;
		
		
	}
	
	
	public static String getName()
	{
		System.out.println("trying to find the Name Field");
		return Name;
		
		
	}
	
	public static String getMobile()
	{
		System.out.println("trying to find the Mobile Field");
		return Mobile;
		
		
	}
	
	public static String getSource()
	{
		System.out.println("trying to find the Source Field");
		return Source;
		
		
	}
	
	public static String getSourceVal()
	{
		System.out.println("trying to find the SourceVal Field");
		return SourceVal;
		
		
	}
	
	public static String getFollowUpDate()
	{
		System.out.println("trying to find the FollowUpDate Field");
		return FollowUpDate;
		
		
	}
	
	public static String getFollowUpTime()
	{
		System.out.println("trying to find the FollowUpTime Field");
		return FollowUpTime;
		
		
	}
	
	public static String getTimeVal()
	{
		System.out.println("trying to find the TimeVal Field");
		return TimeVal;
		
		
	}
	
	public static String getStatus()
	{
		System.out.println("trying to find the status Field");
		return status;
		
		
	}
	
	public static String gethourval()
	{
		System.out.println("trying to find the hourval Field");
		return hourval;
		
		
	}
	
	public static String getsubmitbutton()
	{
		System.out.println("trying to find the submitbutton Field");
		return submitbutton;
		
		
	}
	
	public static String getleadfinder()
	{
		System.out.println("trying to find the leadfinder Field");
		return leadfinder;
		
		
	}
	
	public static String getSearchLeadTxtBox()
	{
		System.out.println("trying to find the SearchLeadTxtBox Field");
		return SearchLeadTxtBox;
		
		
	}
	
	public static String getFilter()
	{
		System.out.println("trying to find the Filter Field");
		return Filter;
		
		
	}
	
	public static String getFilterstatus()
	{
		System.out.println("trying to find the Filterstatus Field");
		return Filterstatus;
		
		
	}
	
	public static String getFiltersource()
	{
		System.out.println("trying to find the Filtersource Field");
		return Filtersource;
		
		
	}
	
	public static String getApplyFilter()
	{
		System.out.println("trying to find the ApplyFilter Field");
		return ApplyFilter;
		
		
	}
	
	public static String getSort()
	{
		System.out.println("trying to find the Sort Field");
		return Sort;
		
		
	}
	
	public static String getSortLastUpdated()
	{
		System.out.println("trying to find the SortLastUpdated Field");
		return SortLastUpdated;
		
		
	}
	
	public static String getAddLeadButton()
	{
		System.out.println("trying to find the AddLeadButton Field");
		return AddLeadButton;
		
		
	}

}
	

/****************  Creating Page Objects of Lead Page *****************/
