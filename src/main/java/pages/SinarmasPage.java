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

public class SinarmasPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public SinarmasPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),SinarmasPage.class);
		
	}

	private static String ApprovedPrice="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.EditText[@index='2']";

	private static String InstallmentType="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.widget.TextView[contains(@text,'Installment Type*')]/parent::android.view.ViewGroup";
	
	private static String InstallmentTypeVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'ADDB')]/parent::android.view.ViewGroup";
	
	private static String tenure="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.widget.TextView[contains(@text,'Tenure (in months)*')]/parent::android.view.ViewGroup";
	
	private static String tenureVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'12')]/parent::android.view.ViewGroup";
	
	private static String InstallmentVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='3']//android.widget.EditText[@index='2']";
	
    private static String TotalDownpaymentVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='4']//android.widget.EditText[@index='2']";
	
    private static String TotalPayFromFinancier="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='5']//android.widget.EditText[@index='2']";
    
    private static String PaymentNeededByDealer="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='8']//android.widget.EditText[@index='2']";
    
    private static String UploadImageIcon="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='10']//android.view.ViewGroup[@index='0']";

    private static String CameraIcon="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']";
    
    private static String Camera="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='11']//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']";
	
    private static String tickicon="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='11']//android.view.ViewGroup[@index='4']//android.widget.ImageView[@index='0']";
	
	private static String ContinueButton="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='6']//android.widget.TextView[contains(@text,'Continue')]/parent::android.view.ViewGroup";
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	
	private static String PaymentEditBox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='4']//android.widget.EditText[@index='2']";
	
	private static String ContinueButtonP="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']/following-sibling::android.view.ViewGroup";
	
	private static String ProceedButton="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='4']";
	
	
	
	
	
	
	
	/************************************* Page Objects for Payment Page *************************/
	
	
	/************************************* Page Objects for Customer Detail Page *************************/
	
	
	private static String CustName="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.EditText[@index='2']";
	
	private static String CustPhone="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.widget.EditText[@index='2']";
	
	
	private static String CustType="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='5']//android.widget.TextView[contains(@text,'Type*')]/parent::android.view.ViewGroup";
	
	
	private static String NewAPP="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'New Application')]/parent::android.view.ViewGroup";
	
	private static String LeadSource="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='6']//android.widget.TextView[contains(@text,'Lead Source*')]/parent::android.view.ViewGroup";
	
	private static String DealershipVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Dealership')]/parent::android.view.ViewGroup";
		
	private static String FinancierBranch="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='7']//android.widget.TextView[contains(@text,'Financier Branch*')]/parent::android.view.ViewGroup";
	
	
	private static String BranchName="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']//android.widget.EditText[contains(@text,'Search by Branch Name')]";
	
	
	private static String BranchNameVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']//android.widget.ScrollView[@index='3']//android.widget.TextView[contains(@text,'MAF Cengkareng')]/parent::android.view.ViewGroup";
	
	private static String selectall="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.ScrollView[@index='2']//android.view.ViewGroup[@index='9']/android.widget.ImageView[@index='0']";
	
	
	private static String btnSubmit="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='7']//android.widget.TextView[contains(@text,'SUBMIT')]/parent::android.view.ViewGroup";
	
	/************************************* Page Objects for Approved Quote *************************/
	
	
	

	
	public static String getApprovedPrice()
	{
		System.out.println("trying to find the ApprovedPrice textbox");
		return ApprovedPrice;
		
		
	}
	
	public static String getInstallmentType()
	{
		System.out.println("trying to find the InstallmentType dropdown");
		return InstallmentType;
		
		
	}
	
	public static String getInstallmentTypeVal()
	{
		System.out.println("trying to find the InstallmentType dropdown");
		return InstallmentTypeVal;
		
		
	}
	
	public static String gettenure()
	{
		System.out.println("trying to find the Tenure dropdown");
		return tenure;
		
		
	}
	
	public static String gettenureVal()
	{
		System.out.println("trying to find the TenureVal dropdown");
		return tenureVal;
		
		
	}
	
	public static String getInstallmentVal()
	{
		System.out.println("trying to find the InstallmentVal");
		return InstallmentVal;
		
		
	}
	
	public static String getTotalDownpaymentVal()
	{
		System.out.println("trying to find the TotalDownpaymentVal");
		return TotalDownpaymentVal;
		
		
	}
	
	
	public static String getTotalPayFromFinancier()
	{
		System.out.println("trying to find the TotalPayFromFinancier");
		return TotalPayFromFinancier;
		
		
	}
	
	public static String getPaymentNeededByDealer()
	{
		System.out.println("trying to find the PaymentNeededByDealer");
		return PaymentNeededByDealer;
		
		
	}
	
	public static String getUploadImageIcon()
	{
		System.out.println("trying to find the UploadImageIcon");
		return UploadImageIcon;
		
		
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

	
	
	/************************************* Page Objects for Documents Page *************************/

}
	


/****************  Creating Page Objects of Stock Listing Page *****************/
