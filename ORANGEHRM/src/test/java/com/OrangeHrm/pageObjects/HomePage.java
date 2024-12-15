package com.OrangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "(//span[.='PIM'])[1]")
	private WebElement PIM_Button;
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement AddEmp_button;
	@FindBy(xpath = "//h6[.='Add Employee']")
	private WebElement AddEmp_Msg;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//h6[.='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement FNtf; 
	@FindBy(name = "middleName")
	private WebElement MNtf;
	@FindBy(name = "lastName")
	private WebElement LNtf;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement PIM_Button()
	{
		return PIM_Button;
	}
	public WebElement AddEmp_button()
	{
		return AddEmp_button;
	}
	public WebElement AddEmp_Msg()
	{
		return AddEmp_Msg;
	}
	public WebElement FNtf()
	{
		return FNtf;
	}
	public WebElement MNtf()
	{
		return MNtf;
	}
	public WebElement LNtf()
	{
		return LNtf;
	}
	public WebElement save()
	{
		return save;
	}
	public WebElement Dashboard()
	{
		return Dashboard;
	}
}
