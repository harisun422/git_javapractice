package selenium_artifactid;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello {
	
	
	Logger logger;
	WebDriver driver;
	String str;
	Object obj;
	
	@BeforeTest
	void logging() {
		logger = LoggerFactory.getLogger(Hello.class);
		PropertyConfigurator.configure("log4j.properties");
				logger.info("Starting llogging");
				System.out.println("strted logging");
	}
	@Parameters({"browser"})
	@Test(groups= {"naukri"},priority=0)
	public void choosedriver(String browser) {
		System.out.println("Begin Remote run");
		DesiredCapabilities cap = new DesiredCapabilities();
		//DesiredCapabilities cap2 = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.LINUX);
		try {
		URL url = new URL("https://172.17.0.1:6750/wd/hub");
		
	
			System.setProperty("webdriver.chrome.driver","G:\\Learning\\Selenium\\chromedriver.exe");
			driver = new RemoteWebDriver(url,cap);
		}catch(MalformedURLException e) {
			System.out.println("invalid url");
		}
	}
	
	@Test(groups= {"certs","jira","naukris","tabs"},priority=10)
	public void instansiate_driver() {
		//PropertyConfigurator.configure("log4j.properties");
		logger.info("Starting llogging");
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Selenium\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		driver =new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		str=driver.manage().toString();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//obj=driver.manage().getCookies();
		System.out.println("strs"+str);
		//System.out.println("obj"+obj.toString());
	}
	@Test(groups={"jira"})
	public void openurl() {
		driver.manage().window().maximize();
		String url_jira= "https://www.atlassian.com/software/jira";
		driver.get(url_jira);
	}
	
	@Test(groups={"certs"},priority=1)
	public void certificate() throws MalformedURLException {
		String url = "https://expired.badssl.com/";
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(groups= {"tabs"},priority=2)
	public void newtab() {
		try {
		driver.manage().window().maximize();
		String currwindow = driver.getWindowHandle();
		driver.navigate().to("https://www.ultimatix.net/");
		//driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open('')");
		Set <String> tabs = driver.getWindowHandles();
		//driver.findElements(null);
		System.out.println(tabs.size());
		for(String e :tabs) {
			System.out.println(e);
			if(!e.equals(currwindow)) {
				driver.switchTo().window(e);
				driver.get("https://www.gmail.com/");
				System.out.println("new tab working");
			}
			else {
				System.out.println("new tab not working");
			}
			for(String e2 :tabs) {
				driver.switchTo().window(e2);
				Thread.sleep(5000);
			}
		}
	}catch(Exception e) {
		System.out.println("exception occured");
	}
	}
	@Test(groups= {"tabs"},priority=3)
	public void newwindow() {
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		//ArrayList<String> tabs = (ArrayList<String>) driver.getWindowHandles();
		//((JavaScriptExecutor) driver).execute_script("window.open('');");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("www.testng.org");
		
	}
	
	@Test(priority=2,groups={"naukri"})
	public void openpage2() throws MalformedURLException {
		try {
		URL url_ulti = new URL("https://www.naukri.com/");
		driver.navigate().to(url_ulti);
		obj=driver.manage().getCookies();
		System.out.println("obj000 :"+obj);
		Thread.sleep(5000);
		obj=driver.manage().getCookies();
		System.out.println("obj111 :"+obj);
		driver.manage().deleteAllCookies();
		obj=driver.manage().getCookies();
		System.out.println("obj222 after delete :"+obj);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3,groups= {"jira","naukri"})
	public void operations() throws Exception {
		String single = driver.getWindowHandle();
		Set<String> all= driver.getWindowHandles();
		System.out.println("single window handle"+single);
		System.out.println("all"+all);
		Iterator r =all.iterator();
		String m;
		while(r.hasNext()) {
			driver.switchTo().window(m=(String) r.next());
			String currentpage = driver.getCurrentUrl();
			System.out.println("current page : "+currentpage);
			System.out.println("title : "+driver.getTitle());
			System.out.println("size is : "+driver.manage().window().getSize());
			Thread.sleep(5000);
			if(!m.equalsIgnoreCase(single)) {
				System.out.println("closing");
				driver.close();
			}
		}
	/*
		
		driver.switchTo().window(single);
		By popups = By.xpath("//*[@id=\"geoLocPopUp\"]/span[text()=\"Later\"]");
		driver.findElement(popups).click();
				
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("completed");
		*/
	}
	
	@AfterTest
	void teardown() {
		driver.quit();
	}
	
}
