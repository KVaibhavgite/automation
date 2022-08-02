package com.findelements;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"on test start");
		System.out.println(result.getStatus() +"ontest start status");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());
	
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getOutputDirectory()+"99");
		System.out.println(context.getStartDate());
		ITestNGMethod[] tests = context.getAllTestMethods();
		System.out.println(tests);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(context.getFailedTests() +"failed test");
		System.out.println(context.getPassedTests() +"passed test");
		
		
	}
	
	
	
}
