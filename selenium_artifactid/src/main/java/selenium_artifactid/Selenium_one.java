package selenium_artifactid;

import java.io.File;
//import java.text.*;
import java.util.*;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;

public class Selenium_one extends Operations {
	int i=1;
	
	//@AfterTest
	public void loadpage() {
		System.out.println("In load Page method");
		System.out.println("user directory:"+System.getProperty("User.dir"));
		//
		tests.log(LogStatus.PASS, tests.addScreenCapture(capturescreenshot())+"some string");
	}
	@Test(groups={"gdhjd"})
	public void loadpage2() {
		//File f3 = new File("G:/Learning/workspace_eclipse/selenium_artifactid/report/extentreport/todays/testing/");
		File f3= new File("testing");
		System.out.print(f3.getParent() + " and "+ f3.getParentFile());
		System.out.println("page2");
		tests.log(LogStatus.FAIL, "Message");
		er.flush();
	}
	
	
	@BeforeSuite
	public void login() {
		//System.out.println("In login method , Parameter is " +just);
		Date todays = new Date();
		//DateFormat.format(todays);
		System.out.println("todaytext "+todays.toString());
		reportpath= "report/extentreport"+"/"+"todays"+"/"+"todays.html";
		er = new ExtentReports(reportpath,true);
		
	}
	@AfterSuite
	public void beforelogin() {
		System.out.println("In beforelogin method");
		tests.log(LogStatus.PASS, "Message....");
		driver.quit();
		er.flush();
		
	}
	
	
	@Test
	public void loadDriver() {
		tests = er.startTest("TestCase "+i);
		i++;
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.atlassian.com/software/jira");
		//https://jira.hl7.org/login.jsp
		//driver.searchText("");
		System.out.println("In driver method-1");
		verifyText("Buynow");
		System.out.println("In driver method-2");
		er.endTest(tests);
	}
}
