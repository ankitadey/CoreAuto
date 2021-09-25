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

public class StockListPage{
	
	 
	
	// Initialize the Page objects using driver having capabilities
	public StockListPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),StockListPage.class);
		
	}

	private static String StockFirst="//android.widget.FrameLayout[@index=0]//android.view.ViewGroup[@index='3']//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='2']";

	
	public static String getStockFirst()
	{
		System.out.println("trying to find the First Stock Field");
		return StockFirst;
		
		
	}
	

}
	




/****************  Creating Page Objects of Stock Listing Page *****************/
