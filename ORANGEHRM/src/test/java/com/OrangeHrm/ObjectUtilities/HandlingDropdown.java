package com.OrangeHrm.ObjectUtilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown 
{
	public static void SelectOption(WebElement element,Object value)//1//ind
	{
		Select sel = ObjectClass.HandleDropdown(element);
		if(value instanceof Integer)
		{
				sel.selectByIndex((int) value);
		}
		else if (value instanceof String)
		{
			try 
			{
				sel.selectByValue((String) value);
				
			} catch (Exception e) 
			{
				sel.selectByVisibleText((String) value);
			}
		} 
	}
	public static void DeSelectOption(WebElement element,Object value)//1//ind
	{
		Select sel = ObjectClass.HandleDropdown(element);
		if(value instanceof Integer)
		{
				sel.deselectByIndex((int) value);
		}
		else if (value instanceof String)
		{
			try 
			{
				sel.deselectByValue((String) value);
				
			} catch (Exception e) 
			{
				sel.deselectByVisibleText((String) value);
			}
		}
		else
		{
			sel.deselectAll();
		}
	}
	
	public static WebElement fetchOptions(WebElement element)
	{
		Select sel = ObjectClass.HandleDropdown(element);
		List<WebElement> opts = sel.getOptions();
		WebElement val1 = opts.get(0);
		return val1;
	}
	
	
	

}
