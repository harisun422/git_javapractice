package stepdefinition;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class OwnListeners implements ITestListener,IReporter,IInvokedMethodListener {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("Test Reporting : "+xmlSuites +"\n"+ suites +"\n"+outputDirectory );
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started" + result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success" + result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed" + result);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed -success%" + result);
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started with : "+ context);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test finished with : "+ context);
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before Invocation  : "+ method +"result : "+testResult);
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invocation : "+ method +"result : "+testResult);
		
	}

}
