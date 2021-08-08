package selenium_artifactid;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Operations {

	WebDriver driver;
	ExtentReports er ;
	ExtentTest tests ;
	String reportpath;
	int i=1;
	int j=1000;
	public void searchText(By element,String text) {
		try {
		String E = driver.findElement(element).getText();
		if(E.equals(text)) 
			tests.log(LogStatus.PASS,E+" is displayed");
		else
			tests.log(LogStatus.FAIL,element+" is not displayed");
		}catch(Exception e) {
				tests.log(LogStatus.FAIL,element+" is not displayed");	
		}
	}
	
	
	
	public boolean verifyText(String searchtext) {
		try {
			WebElement E = driver.findElement(By.xpath("//*[contains(text(),searchtext)]"));
			String d1="This is text11234567728299  v737e73737    77777<br>Hello<br>Hari";
			String d2="this is text2<br>World<br>welcome";
			String desc="<span><div style=\"float:left;\">"+d1+"</div><divstyle=\"float:right;\">"+d2+"</div></span>";
			if(E!=null) 
				tests.log(LogStatus.PASS,tests.addScreenCapture(capturescreenshot())+searchtext+" is displayed <br>"+desc);
			//tests.addScreenCapture(capturescreenshotv_element(E))+tests.addScreenCapture(capturescreenshot())
			return true;
		}catch(Exception e) {
			System.out.print("Verify text failed"+e);
			tests.log(LogStatus.FAIL,tests.addScreenCapture(capturescreenshot())+searchtext+"does not exist");}
		
			return false;
		}
			
	public String capturescreenshot(){
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String filepath = System.getProperty("User.home");
			System.out.println("filepath is "+filepath);
		//File f= new File("/screenshots/i.jpg");
		//File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("G:/Learning/workspace_eclipse/selenium_artifactid/report/extentreport/todays/screenshot/"+i+".jpg"));
		}
		catch(Exception e) {
			System.out.println("Exception occured"+ e);
			
		}
		i++;
		return "screenshot/"+(i-1)+".jpg";
	}

	public String capturescreenshot_element(WebElement ele){
		File f=((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		try {
			//String filepath = System.getProperty("User.home");
			//System.out.println("filepath is "+filepath);
		//File f= new File("/screenshots/i.jpg");
		//File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("G:/Learning/workspace_eclipse/selenium_artifactid/report/extentreport/todays/screenshot/"+j+".jpg"));
		}
		catch(Exception e) {
			System.out.println("Exception occured"+ e);
		}
		j++;
		return "screenshot/"+(j-1)+".jpg";
	}


	private void getScreenshotAs(WebDriver webDriver) {
		// TODO Auto-generated method stub
		
	}
		
					
}
