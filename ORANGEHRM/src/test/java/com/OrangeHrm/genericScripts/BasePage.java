package com.OrangeHrm.genericScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OrangeHrm.pageObjects.HomePage;
import com.OrangeHrm.pageObjects.LoginPage;
import com.OrangeHrm.pageObjects.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage implements ApplicationConstants
{
	@Parameters("BrowserInit")
	@BeforeClass
	public void BrowserInitialization(String BrowserInit)
	{
		switch (BrowserInit) 
		{
		case "chrome":WebDriverManager.chromedriver().setup();			
			break;
		case "fire":WebDriverManager.firefoxdriver().setup();
		break;
		case "edge":WebDriverManager.edgedriver().setup();
		break;
		default:System.out.println("Invalid Initialization");
			break;
		}
	}
	LoginPage lp;
	public WebDriver driver;
	LogoutPage lo;
	ReadProperites rp;
	public HomePage hp;
	@Parameters("Browsers")
	@BeforeMethod
	public void BrowserSetUp(String BrowserName) throws Exception
	{
		switch(BrowserName)
		{
		case "chrome": driver = new ChromeDriver();
		break;
		case "fire": driver = new FirefoxDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		default:System.out.println("Invalid Browser");
	}
		driver.manage().timeouts().implicitlyWait(WaitTime,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		lo = new LogoutPage(driver);
		rp = new ReadProperites();
		driver.get(rp.ReadUrl());
		lp.EnterUsn().sendKeys(rp.ReadUsn());
		lp.EnterPsw().sendKeys(rp.ReadPsw());
		lp.clikckLogin().click();
	}
	
	@AfterMethod
	public void TearDown(ITestResult result) throws InterruptedException, IOException
	{
		if(result.FAILURE == result.getStatus())
		{
			CaptureDefects.getDefects(driver, result);
		}
		Thread.sleep(1000);		
		lo.logoutDropdown().click();
		lo.logoutOption().click();
		driver.quit();
	}
	@AfterClass
	public void Reports()
	{
		
	}
}
