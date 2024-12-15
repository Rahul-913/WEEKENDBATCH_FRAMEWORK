package com.OrangeHrm.genericScripts;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass implements ITestListener
{
	ExtentSparkReporter  reporter;
	ExtentReports report;
	public void onStart(ITestContext  context)
	{
		Date d = new Date();
		String d1 = d.toString().replace(":","-");
		System.out.println("Testcase Execution is Started");
		reporter = new ExtentSparkReporter("./ExtentReports/"+d1+" .html");//Generate the report
		reporter.config().setDocumentTitle("HYBRIDFRAMEWORK");
		reporter.config().setReportName("ORANGEHRM");
		reporter.config().setTheme(Theme.DARK);
		report = new ExtentReports();//Include the information
		report.attachReporter(reporter);
		report.setSystemInfo("TesterName","Admin");
		report.setSystemInfo("OS","windows");
		report.setSystemInfo("TestEnvironment","Windows 11");
		report.setSystemInfo("BUILD_ID","14122024.zip");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase Execution is Success "+result.getName());
		ExtentTest test = report.createTest(result.getName());
		System.out.println(test.getStatus().PASS);
		test.log(Status.PASS,result.getName()+" is Success");
		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase Execution is Failed "+result.getName());
		ExtentTest test = report.createTest(result.getName());
		System.out.println(test.getStatus().FAIL);
		test.log(Status.FAIL,result.getName()+" is Failed");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcase Execution is Skipped "+result.getName());
		ExtentTest test = report.createTest(result.getName());
		System.out.println(test.getStatus().SKIP);
		test.log(Status.SKIP,result.getName()+" is Skipped");
	}
	public void onFinish(ITestContext  context)
	{
		System.out.println("Testcase Execution is Completed");
		report.flush();

	}
}
