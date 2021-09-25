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

public class BFIPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public BFIPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),BFIPage.class);
		
	}
	

	private static String CustRegion="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='0']//android.widget.EditText[@index='2']/parent::android.view.ViewGroup";
	
	private static String CustRegionValJava="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Jabodetabek')]/parent::android.view.ViewGroup";
	
    
	private static String CustomerAge="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1']//android.widget.EditText[@index='2']";
	
	private static String Brand="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']//android.view.ViewGroup[@index='1']";
	
	
	private static String SearchBrandTextbox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.EditText[contains(@text,'Search by Brand')]";
	
	
	private static String SearchBoxVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='3']//android.view.ViewGroup";
	
	
	private static String Model="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='1']";
	
	private static String SearchModelTextbox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.EditText[contains(@text,'Search by Model')]";
	
	private static String SearchModelTextboxVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='3']//android.view.ViewGroup";
	
	
    private static String Version="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='1']";
	
	private static String SearchVersionVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'VTISE24AT')]/parent::android.view.ViewGroup";
	

	private static String MfgYear="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='6']//android.view.ViewGroup[@index='1']";
		
	private static String MfgYearVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'2021')]/parent::android.view.ViewGroup";
	
	
	private static String InsuranceType="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='7']//android.view.ViewGroup[@index='1']";
	
	private static String InsuranceTypeVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'All Risk')]/parent::android.view.ViewGroup";
	
	private static String UsageType="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='8']//android.view.ViewGroup[@index='1']";
		
	private static String UsageTypeVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Commercial')]/parent::android.view.ViewGroup";
		
		
	private static String Tenure="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='9']//android.view.ViewGroup[@index='1']";
		
	private static String TenureVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'1')]/parent::android.view.ViewGroup";
		
	private static String MRPTextbox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='11']//android.widget.EditText[@index='2']";
	
	private static String ContinueButton="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='13']";
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	
	private static String PaymentEditBox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']//android.widget.EditText[@index='2']";
	
	private static String ContinueButtonP="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']/following-sibling::android.view.ViewGroup";
	
	private static String ProceedButton="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='4']";
	
	
	
	
	
	
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	/************************************* Page Objects for Customer Detail Page *************************/
	
	
	private static String CustName="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.EditText[@index='2']";
	
	private static String CustPhone="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.widget.EditText[@index='2']";
	
	
	private static String CustType="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='5']//android.widget.TextView[contains(@text,'Type*')]/parent::android.view.ViewGroup";
	
	
	private static String NewAPP="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'New Application')]/parent::android.view.ViewGroup";
	
	private static String LeadSource="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='6']//android.widget.TextView[contains(@text,'Lead Source*')]/parent::android.view.ViewGroup";
	
	
	private static String DealershipVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Dealership')]/parent::android.view.ViewGroup";
	
	
	private static String FinancierBranch="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='7']//android.widget.TextView[contains(@text,'Financier Branch*')]/parent::android.view.ViewGroup";
	
	
	private static String BranchName="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='10']//android.widget.EditText[contains(@text,'Search by Branch Name')]";
	
	
	private static String BranchNameVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='10']//android.widget.ScrollView[@index='3']//android.widget.TextView[contains(@text,'BFI Dumai')]/parent::android.view.ViewGroup";
	
	private static String selectall="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='9']/android.widget.ImageView[@index='0']";
	
	
	private static String btnSubmit="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='9']//android.widget.TextView[contains(@text,'SUBMIT')]/parent::android.view.ViewGroup";
	
	/************************************* Page Objects for Customer Detail Page *************************/
	
	
	
	/************************************* Page Objects for Documents Page *************************/
	
	private static String FrontSide="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='10']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'+')]/parent::android.view.ViewGroup";
	
	private static String CameraIcon="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']";
	
	
	private static String Camera="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='19']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']";
	
	private static String tickicon="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='19']//android.view.ViewGroup[@index='3']//android.widget.ImageView[@index='0']";
	
	
	private static String IdCardCustomer="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='10']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='3']//android.widget.ImageView[@index='2']";
	
	/************************************* Page Objects for Documents Page *************************/
	
	
	
	public static String getCustomerAge()
	{
		System.out.println("trying to find the CustomerAge");
		return CustomerAge;
		
		
	}
	
	
	
	
	public static String getCustRegion()
	{
		System.out.println("trying to find the Customer Region value in dropdown");
		return CustRegion;
		
		
	}
	
	public static String getCustRegionValJava()
	{
		System.out.println("trying to find the Customer Region Java value in dropdown");
		return CustRegionValJava;
		
		
	}
	
	
	
	public static String getBrand()
	{
		System.out.println("trying to find the Brand dropdown");
		return Brand;
		
		
	}
	
	public static String getSearchBrandTextbox()
	{
		System.out.println("trying to find the SearchBrandTextbox");
		return SearchBrandTextbox;
		
		
	}
	
	public static String getSearchBoxVal()
	{
		System.out.println("trying to find the SearchBoxVal");
		return SearchBoxVal;
		
		
	}
	
	public static String getModel()
	{
		System.out.println("trying to find the Model dropdown");
		return Model;
		
		
	}
	
	public static String getSearchModelTextbox()
	{
		System.out.println("trying to find the SearchModelTextbox");
		return SearchModelTextbox;
		
		
	}
	
	public static String getSearchModelTextboxVal()
	{
		System.out.println("trying to find the SearchModelTextboxVal");
		return SearchModelTextboxVal;
		
		
	}
	
	public static String getVersion()
	{
		System.out.println("trying to find the Version dropdown");
		return Version;
		
		
	}
	
	public static String getSearchVersionVal()
	{
		System.out.println("trying to find the SearchVersionVal dropdown");
		return SearchVersionVal;
		
		
	}
	
	public static String getMfgYear()
	{
		System.out.println("trying to find the MfgYear dropdown");
		return MfgYear;
		
		
	}
	
	public static String getMfgYearVal()
	{
		System.out.println("trying to find the MfgYearVal dropdown");
		return MfgYearVal;
		
		
	}
	
	public static String getInsuranceType()
	{
		System.out.println("trying to find the InsuranceType dropdown");
		return InsuranceType;
		
		
	}
	
	public static String getInsuranceTypeVal()
	{
		System.out.println("trying to find the InsuranceTypeVal dropdown");
		return InsuranceTypeVal;
		
		
	}
	
	
	public static String getUsageTypeVal()
	{
		System.out.println("trying to find the UsageTypeVal dropdown");
		return UsageTypeVal;
		
		
	}
	
	public static String getUsageType()
	{
		System.out.println("trying to find the UsageType dropdown");
		return UsageType;
		
		
	}
	
	public static String getTenure()
	{
		System.out.println("trying to find the Tenure dropdown");
		return Tenure;
		
		
	}
	
	public static String getTenureVal()
	{
		System.out.println("trying to find the TenureVal dropdown");
		return TenureVal;
		
		
	}
	
	public static String getMRPTextbox()
	{
		System.out.println("trying to find the MRPTextbox");
		return MRPTextbox;
		
		
	}
	
	public static String getContinueButton()
	{
		System.out.println("trying to find the ContinueButton");
		return ContinueButton;
		
		
	}
	
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	public static String getPaymentEditBox()
	{
		System.out.println("trying to find the PaymentEditBox");
		return PaymentEditBox;
		
		
	}
	
	
	
	public static String getContinueButtonP()
	{
		System.out.println("trying to find the ContinueButtonP");
		return ContinueButtonP;
		
		
	}
	
	
	public static String getProceedButton()
	{
		System.out.println("trying to find the ProceedButton");
		return ProceedButton;
		
		
	}
	
	
	
	
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	/************************************* Page Objects for Customer Details Page *************************/
	
	public static String getCustName()
	{
		System.out.println("trying to find the CustName");
		return CustName;
		
		
	}
	
	public static String getCustPhone()
	{
		System.out.println("trying to find the CustPhone");
		return CustPhone;
		
		
	}
	
	public static String getCustType()
	{
		System.out.println("trying to find the CustType");
		return CustType;
		
		
	}
	
	public static String getNewAPP()
	{
		System.out.println("trying to find the NewAPP");
		return NewAPP;
		
		
	}
	
	public static String getLeadSource()
	{
		System.out.println("trying to find the LeadSource");
		return LeadSource;
		
		
	}
	
	public static String getDealershipVal()
	{
		System.out.println("trying to find the DealershipVal");
		return DealershipVal;
		
		
	}
	
	public static String getFinancierBranch()
	{
		System.out.println("trying to find the FinancierBranch");
		return FinancierBranch;
		
		
	}
	
	public static String getBranchName()
	{
		System.out.println("trying to find the BranchName");
		return BranchName;
		
		
	}
	
	public static String getBranchNameVal()
	{
		System.out.println("trying to find the BranchNameVal");
		return BranchNameVal;
		
		
	}
	
	public static String getselectall()
	{
		System.out.println("trying to find the selectall");
		return selectall;
		
		
	}
	
	public static String getbtnSubmit()
	{
		System.out.println("trying to find the btnSubmit");
		return btnSubmit;
		
		
	}
	
	/************************************* Page Objects for Customer Details Page *************************/
	
	
	/************************************* Page Objects for Documents Page *************************/
	
	public static String getFrontSide()
	{
		System.out.println("trying to find the FrontSide");
		return FrontSide;
		
		
	}
	
	public static String getCameraIcon()
	{
		System.out.println("trying to find the Camera Icon");
		return CameraIcon;
		
		
	}
	
	public static String getCamera()
	{
		System.out.println("trying to find the Camera");
		return Camera;
		
		
	}
	
	
	public static String gettickicon()
	{
		System.out.println("trying to find the tickicon");
		return tickicon;
		
		
	}
	
	
	public static String getIdCardCustomer()
	{
		System.out.println("trying to find the IdCardCustomer");
		return IdCardCustomer;
		
		
	}
	
	
	/************************************* Page Objects for Documents Page *************************/

}
	


/****************  Creating Page Objects of Stock Listing Page *****************/
