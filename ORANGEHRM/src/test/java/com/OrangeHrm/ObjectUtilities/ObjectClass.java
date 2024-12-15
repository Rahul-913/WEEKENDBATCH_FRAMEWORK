package com.OrangeHrm.ObjectUtilities;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ObjectClass 
{	
	public static Actions MouseActions(WebDriver driver)
	{
		Actions act = new Actions(driver);
		return act;
	}

	public static Select HandleDropdown(WebElement element)
	{
		Select s = new Select(element);
		return s;
	}
	
	public static JavascriptExecutor JSE(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js;
	}
	
	public static Robot RobotKeys() throws Exception
	{
		Robot r = new Robot();
		return r;
	}
	
	
	
	
	
	
	
	
	
	
	
}
