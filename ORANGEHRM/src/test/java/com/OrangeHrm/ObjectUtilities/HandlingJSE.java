package com.OrangeHrm.ObjectUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingJSE
{
	//Pass data
	//clear data
	//scroll->element/pixels
	
	public static void PassData(WebDriver driver,String value,WebElement element)
	{
		JavascriptExecutor js = ObjectClass.JSE(driver);
		js.executeScript("arguments[0].value='"+value+"'",element);
	}
	public static void ClearData(WebDriver driver,String value,WebElement element)
	{
		JavascriptExecutor js = ObjectClass.JSE(driver);
		js.executeScript("arguments[0].value=''",element);
	}
	public static void ScrollPixels(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js = ObjectClass.JSE(driver);
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public static void ScrollElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ObjectClass.JSE(driver);
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
}
