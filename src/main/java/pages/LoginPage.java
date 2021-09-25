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



/****************  Creating Page Objects of Login Page *****************/

public class LoginPage{
	
	
	// Initialize the Page objects using driver having capabilities
	public LoginPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),LoginPage.class);
		
		
	}
	

	private static String loginWithEmailLink="//android.widget.TextView[contains(@text,'Login with Email')]";
	
	
	private static String loginWithMobileLink="//android.widget.TextView[contains(@text,'Login with Mobile')]";
	
	private static String txtEmailId="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='3']//android.widget.EditText[@index='2']";
	
	private static String txtPass="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='5']//android.widget.EditText[@index='2']";
	
	private static String btnLogin="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='8']";

	
	public static String getloginWithEmailLink()
	{
		System.out.println("trying to find the Login with Email Link field");
		return loginWithEmailLink;
		
		
	}
	
	public static String getloginWithMobileLink()
	{
		System.out.println("trying to find the Login with Mobile Link field");
		return loginWithMobileLink;
	}
	
	public static String getEmailId()
	{
		System.out.println("trying to find the Login with Email field");
		return txtEmailId;
	}
	
	public static String getPass()
	{
		System.out.println("trying to find the Login with Password field");
		return txtPass;
	}
	
	public static String getLoginButton()
	{
		System.out.println("trying to find the Login Button Field");
		return btnLogin;
	}
	
	public static DashBoardPage clickLoginButton(AppiumDriver driver)
	{
		driver.findElementByXPath(getLoginButton()).click();
		return new DashBoardPage(driver);
		
	}
	
	

}


/****************  Creating Page Objects of Login Page *****************/
