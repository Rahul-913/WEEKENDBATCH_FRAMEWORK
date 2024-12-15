package com.OrangeHrm.RunnerScripts.AdminStory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHrm.genericScripts.BasePage;

public class AdminModule extends BasePage
{
	@Test
	public void CheckDashBoardIsDisplayed()//smoke
	{
		String ExpectedMsg = "Dashboard";
		String ActualMsg = hp.Dashboard().getText();
		Assert.assertEquals(ActualMsg, ExpectedMsg);
	}
	@Test
	public void CheckAddComponents()//functional
	{
		hp.PIM_Button().click();
		hp.AddEmp_button().click();
		Assert.assertTrue(hp.FNtf().isDisplayed());
		Assert.assertTrue(hp.MNtf().isDisplayed());
		Assert.assertTrue(hp.LNtf().isDisplayed());
		Assert.assertTrue(hp.save().isDisplayed());
		System.out.println("Verification is successful");
	}
	@Test
	public void CheckEmpIsCreated()//integration
	{
		hp.PIM_Button().click();
		hp.AddEmp_button().click();
		hp.FNtf().sendKeys("FirstName");
		hp.MNtf().sendKeys("Middlename");
		hp.LNtf().sendKeys("LastName");
		hp.save().click();
	}

}
