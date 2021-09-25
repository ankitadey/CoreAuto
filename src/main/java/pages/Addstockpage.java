package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Addstockpage {
	
	private static final String TenureVal = null;

	private static final String ContinueButton = null;

	public Addstockpage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),Addstockpage.class);
	}
	
	private static String MakeModel="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']/android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Make Model*')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup";

	private static String SearchBrandTextbox="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.EditText[contains(@text,'Search by make model')]";
	
	private static String SearchBoxVal="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='3']//android.widget.TextView[contains(@text,'Honda Civic')]/parent::android.view.ViewGroup";
		
	private static String Version="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']/android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Version*')]/parent::android.view.ViewGroup";
		
	private static String SearchVersionVal="//android.widget.FrameLayout[@index=0]//android.widget.ScrollView[@index='2']//android.widget.TextView[contains(@text,'1.5L AT PRESTIGE')]/parent::android.view.ViewGroup";
		
    private static String MfgYear="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='3']//android.widget.TextView[contains(@text,'Manufacturing Year*')]/parent::android.view.ViewGroup";
    
    private static String OKbutton="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']//android.widget.TextView[contains(@text,'Okay')]/parent::android.view.ViewGroup";
    
    private static String Color="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Color*')]/parent::android.view.ViewGroup";
	
    private static String Color1="//android.widget.FrameLayout[@index=0]//android.widget.ScrollView[@index='2']//android.widget.TextView[contains(@text,Black)]/parent::android.view.ViewGroup";

	private static String kmsdriven="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']/android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='5']/android.widget.EditText[@index='2']";
	
    	
    private static String Numberofowners="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'Number of Owners*')]/parent::android.view.ViewGroup";
	
    private static String Numberofownerselect="//android.widget.FrameLayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[contains(@text,'1st Owner')]/parent::android.view.ViewGroup";
    
    private static String Regmonthandyear="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='7']//android.widget.TextView[contains(@text,'Registration Month and Year*')]/parent::android.view.ViewGroup";
    
    private static String Regmonthandyearselection="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']//android.widget.TextView[contains@text,'Okay']/parent::android.view.ViewGroup";
    
    private static String Regisrationcity="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Registration City*')]/parent::android.view.ViewGroup";
    
    private static String Regisrationcityselect="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='5']//android.widget.ScrollView[@index='3']//android.widget.TextView[@contains(@text,'Aceh Barat')]/parent::android.view.ViewGroup";
    
    private static String plateNo="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Plate No.*')]/parent::android.view.ViewGroup";
    
    private static String plateNotype="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Odd')]/parent::android.view.ViewGroup";

    private static String plateValidity="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Number Plate Validity Till')]/parent::android.view.ViewGroup";

    private static String plateValiditySelection="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='3']//android.widget.TextView[contains@text,'Okay']";
    
    private static String Stockprice="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Stock Price*')]/parent::android.view.ViewGroup";
  
    private static String Downpayment="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Down Payment')]/parent::android.view.ViewGroup";
    
    private static String Installment="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Installment')]/parent::android.view.ViewGroup";
    
    private static String InstallmentMonth="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='1']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'12')]/parent::android.view.ViewGroup";
    
    private static String InsuranceType="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Insurance Type*')]/parent::android.view.ViewGroup";

    private static String InsuranceTypeSelecion="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'No insurance')]/parent::android.view.ViewGroup";
    
    private static String Description="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.widget.ScrollView[@index='0']//android.widget.TextView[@contains(@text,'Description')]/parent::android.view.ViewGroup";
   
    private static String AddStock="//android.widget.Framelayout[@index='0']//android.view.ViewGroup[@index='4']//android.view.ViewGroup[@index='2']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='19']//android.widget.TextView[@contains(@text,'Add Stock')]";

    
    public static String getMakeModel()
	{
		System.out.println("trying to find the make model");
		return MakeModel;
	}
    
    public static String getSearchBrandTextbox()
   	{
   		System.out.println("trying to find the Search make model");
   		return SearchBrandTextbox;
   	}
    public static String getSearchBoxVal()
   	{
   		System.out.println("trying to find the Search Value");
   		return SearchBoxVal;
   	}
    
    public static String getVersion()
   	{
   		System.out.println("trying to find the Version field click");
   		return Version;
   	}
    
    public static String getSearchVersionVal()
   	{
   		System.out.println("trying to find the Version Value click");
   		return SearchVersionVal;
   	}
    
    public static String getMfgYear()
   	{
   		System.out.println("trying to find the Mfg year click");
   		return MfgYear;
   	}
    
    public static String getOKbutton()
   	{
   		System.out.println("trying to find the Ok Button click");
   		return OKbutton;
   	}
    
    public static String getColor()
   	{
   		System.out.println("trying to find the color field click");
   		return Color;
   	}
    
    public static String getColor1()
   	{
   		System.out.println("trying to find the color select");
   		return Color1;
   	}
    
    public static String getkmsdriven()
   	{
   		System.out.println("trying to find the kms driven");
   		return kmsdriven;
   	}
       
    public static String getNumberofowners()
   	{
   		System.out.println("trying to find the number of owner click");
   		return Numberofowners;
   	}
    
    public static String getNumberofownerselect()
   	{
   		System.out.println("trying to find the Numberofownerselect");
   		return Numberofownerselect;
   	}
    
    public static String getRegmonthandyear()
   	{
   		System.out.println("trying to find the Regmonthandyear");
   		return Regmonthandyear;
   	}
    
    public static String getRegmonthandyearselection()
   	{
   		System.out.println("trying to find the Reg month and yearselection");
   		return Regmonthandyearselection;
   	}
    
    public static String getRegisrationcity()
   	{
   		System.out.println("trying to find the Regisrationcity click");
   		return Regisrationcity;
   	}
    
    public static String getRegisrationcityselect()
   	{
   		System.out.println("trying to find the Regisrationcityselect");
   		return Regisrationcityselect;
   	}
    
    public static String getplateNo()
   	{
   		System.out.println("trying to find the plateNo");
   		return plateNo;
   	}
    
    public static String getplateNotype()
   	{
   		System.out.println("trying to find the plateNotype");
   		return plateNotype;
   	}
    
    public static String getplateValidity()
   	{
   		System.out.println("trying to find the plateValidity");
   		return plateValidity;
   	}
    
    public static String getplateValiditySelection()
   	{
   		System.out.println("trying to find the plateValiditySelection");
   		return plateValiditySelection;
   	}
    
    public static String getStockprice()
   	{
   		System.out.println("trying to find the Stockprice");
   		return Stockprice;
   	}

    public static String getDownpayment()
   	{
   		System.out.println("trying to find the Downpayment");
   		return Downpayment;
   	}
    
    
    public static String getInstallment()
   	{
   		System.out.println("trying to find the Installment");
   		return Installment;
   	}
    
    
    public static String getInstallmentMonth()
   	{
   		System.out.println("trying to find the InstallmentMonth");
   		return InstallmentMonth;
   	}
    
    public static String getInsuranceType()
   	{
   		System.out.println("trying to find the InsuranceType");
   		return InsuranceType;
   	}
    
    public static String getInsuranceTypeSelecion()
   	{
   		System.out.println("trying to find the InsuranceTypeSelecion");
   		return InsuranceTypeSelecion;
   	}
    
    public static String getDescription()
   	{
   		System.out.println("trying to find the Description");
   		return Description;
   	}
    
    public static String getAddStock()
   	{
   		System.out.println("trying to find the AddStock");
   		return AddStock;
   	}

}
