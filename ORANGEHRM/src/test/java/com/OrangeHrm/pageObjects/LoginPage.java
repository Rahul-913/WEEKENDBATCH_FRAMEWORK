package com.OrangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name = "username")
	private WebElement usnTf;

	@FindBy(name = "password")
	private WebElement pswTf;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement EnterUsn()
	{
		return usnTf;
	}
	
	public WebElement EnterPsw()
	{
		return pswTf;
	}
	public WebElement clikckLogin()
	{
		return loginBtn;
	}
	
	
	
	
	
	
	
	
	
	
}
