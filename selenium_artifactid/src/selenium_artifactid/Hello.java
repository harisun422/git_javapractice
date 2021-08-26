package selenium_artifactid;


import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
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
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
		System.out.println("strted logging");
		logger = LoggerFactory.getLogger(Hello.class);
		PropertyConfigurator.configure("log4j.properties");
				logger.info("Starting llogging");
				System.out.println("strted logging");
	}
	
	@Test(groups= {"remote"},priority=1)
	public void choosedriver() { 
		System.out.println("Begin Remote run");
		ChromeOptions co = new ChromeOptions();
		try {
		URL node1 = new URL("http://192.168.96.4:5050/wd/hub");
		 co.setCapability("browserName", "chrome");
	     co.setCapability("platform", "LINUX");
		co.addArguments("--disable-notification");
			//System.setProperty("webdriver.chrome.driver","G:\\Learning\\Selenium\\chromedriver.exe");
			driver = new RemoteWebDriver(node1,co);
			System.out.println("driver :"+driver);
		}catch(Exception e) {
			System.out.println("invalid url");
			//e.printStackTrace();
		}
	}
	
	@Test(groups= {"certs","jira","naukri","tabs"},priority=1)
	public void instansiate_driver() {
		//PropertyConfigurator.configure("log4j.properties");
		//logger.info("Starting llogging");
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
	@Parameters({"browser"})
	@Test(priority=5,groups={"naukri","remote"})
	public void openpage2(String param) throws MalformedURLException {
		try {
		System.out.println("Parameter passed is "+param);	
		URL url_ulti = new URL("https://www.naukri.com/");
		driver.navigate().to(url_ulti);
		//obj=driver.manage().getCookies();
		Set<Cookie> sobj =driver.manage().getCookies();
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.id("login_Layer"))).perform();
		Thread.sleep(14000);
		//driver.findElement(By.xpath("//*[contains(text(),\"New Tab\")]")).click();
		Thread.sleep(4000);
		System.out.println("obj000 :"+sobj);
		Thread.sleep(5000);
		sobj=driver.manage().getCookies();
		System.out.println("obj111 :"+sobj);
		driver.manage().deleteAllCookies();
		sobj=driver.manage().getCookies();
		System.out.println("obj222 after delete :"+sobj);
		
		driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3,groups= {"jira","naukri","remote"})
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
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@Test(groups={"naukri"},priority=6)
	void brokenlinks() throws IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<URL> urls=null;
		HttpURLConnection hconn;
		int respcode=200;
		for(WebElement we : links) {
			urls.add(new URL(we.getAttribute("href")));
			hconn = (HttpURLConnection)((new URL(we.getAttribute("href"))).openConnection());
			
			hconn.connect();
			
			respcode =hconn.getResponseCode();
			
			if(respcode>400) {
				System.out.println(we.getAttribute("href")+" link is broken");
			}else {
				System.out.println(we.getAttribute("href")+" link is valid");
			}
		}
		System.out.println("No of URLS : "+links.size());
	}
	
	
}
