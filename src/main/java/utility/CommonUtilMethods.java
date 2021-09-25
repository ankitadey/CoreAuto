package utility;

import org.openqa.selenium.WebElement;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class CommonUtilMethods {
	
	public AndroidDriver<AndroidElement>  driver;
	
	public CommonUtilMethods(AndroidDriver<AndroidElement>  driver)
	{
		this.driver=driver;
		
	}
	
	/************ Scrolling towards downwards *********/
	
	public void scrollDown() {
	    //if pressX was zero it didn't work for me
	    int pressX = driver.manage().window().getSize().width / 2;
	    // 4/5 of the screen as the bottom finger-press point
	    int bottomY = driver.manage().window().getSize().height * 4/5;
	    // just non zero point, as it didn't scroll to zero normally
	    int topY = driver.manage().window().getSize().height / 8;
	    //scroll with TouchAction by itself
	    scroll(pressX, bottomY, pressX, topY);
	}
	
	/************ Scrolling towards downwards *********/

	/*
	 * don't forget that it's "natural scroll" where 
	 * fromY is the point where you press the and toY where you release it
	 */
	public void scroll(int fromX, int fromY, int toX, int toY) {
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(fromX, fromY).moveTo(toX, toY).release().perform();
	}
	
	/************ Scrolling towards downwards and click *********/
	
	public void scrollNClick(WebElement el){
        int retry = 0;
        while(retry <= 5){
            try{
                el.click();
                break;
            }catch (org.openqa.selenium.NoSuchElementException e){
            	scrollDown();
                retry++;
            }
        }
    }
	
	/************ Scrolling towards downwards and click *********/
	
}
