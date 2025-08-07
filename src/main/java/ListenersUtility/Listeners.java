package ListenersUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener,ISuiteListener{
//to get method go to class rightclick go to source and click override implementmethods
	public void onStart(ISuite suite) {
	Reporter.log("Suite exxecution started-configure report",true);	
			}

	public void onFinish(ISuite suite) {
		Reporter.log("Suite execution ended-report backup",true);
	}

	public void onTestStart(ITestResult result) {
		Reporter.log("Test method execution started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test success ",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("Test-fail -Screenshot",true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test-skipped",true);
	}
     
}
