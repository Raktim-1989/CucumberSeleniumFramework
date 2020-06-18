package cucumberoptions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
System.out.println("Test started1");
System.out.println("Test started2");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfully executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test finished");
		
	}

	
}
