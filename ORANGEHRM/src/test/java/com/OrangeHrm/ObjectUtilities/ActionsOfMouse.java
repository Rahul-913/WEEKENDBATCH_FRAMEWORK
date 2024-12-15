package com.OrangeHrm.ObjectUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsOfMouse
{
	public static void Rightclick(WebDriver driver,WebElement element)
	{
		ObjectClass.MouseActions(driver).contextClick(element).perform();
	}
	public static void MouseHover(WebDriver driver,WebElement element)
	{
		ObjectClass.MouseActions(driver).moveToElement(element).perform();
	}
	public static void DragAndDrop(WebDriver driver,WebElement src,WebElement dst)
	{
		ObjectClass.MouseActions(driver).dragAndDrop(src,dst).perform();
	}
	public static void Doubleclick(WebDriver driver,WebElement element)
	{
		ObjectClass.MouseActions(driver).doubleClick(element).perform();
	}
}
