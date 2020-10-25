package com.listeners;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestBase.TestBase;
import com.report.ExtentReport;

public class TestListeners implements ITestListener, IRetryAnalyzer{

	public void onFinish(ITestContext arg0) {
		//logger statements
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		try {
			ExtentReport.getScreenshot(TestBase.driver, "Project-");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	public void onTestStart(ITestResult arg0) {
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		
	}

	public boolean retry(ITestResult arg0) {
		
		return false;
	}

}
