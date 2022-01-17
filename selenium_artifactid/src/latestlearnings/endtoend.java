package latestlearnings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class endtoend{
	
	RemoteWebDriver rd;
	
	@Test(priority=-2)
	public void launchBrowser() {
		System.out.println("order pref launch url");
		System.setProperty("webdriver.chrome.driver","G:\\Learning\\Selenium\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		rd = new ChromeDriver(co);
		//rd.get("https://www.dream11.com");
		//rd.manage().window().maximize();
		//JavascriptExecutor js = ((JavascriptExecutor) rd);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	@Test(priority=3)
	public void openURL() throws InterruptedException {
		System.out.println("order pref openurl");
	String urls= "https://www.makemytrip.com/";
	rd.get(urls);
	rd.manage().window().maximize();
	Thread.sleep(5000);
	this.closepopup();
	}
	 
	public void closepopup() {
		By closePopup =By.xpath("//*[starts-with(@class,'langCardClose')]");
		//List<WebElement> t = rd.findElementsByCssSelector("div[class='langCardClose']");
		List <WebElement> t= rd.findElements(closePopup);
		if(t.size()==1) {
			System.out.println("Pop up found");
		Actions a = new Actions(rd);
		Action ac=a.moveToElement(rd.findElement(closePopup)).click().build();
		ac.perform();
		}
	}
	@Test(priority=4)
	public void enterinputs() throws InterruptedException {
		System.out.println("order pref enter inputs");
		System.out.println("current object "+this +" : "+this.getClass());
		//rd.switchTo().alert().dismiss();
		rd.findElement(By.className("landingContainer")).click();
		this.fromto("MAA","DEL");
		
	}
	
	public void fromto(String fromtext,String totext) throws InterruptedException {
		By frompt = By.xpath("//input[@id='fromCity']/..");
		By topt = By.xpath("//input[@id='toCity']/..");
		By from_sel = By.xpath("//input[@placeholder='From']/..//li//*[text()='"+fromtext+"']");
		By to_sel = By.xpath("//input[@placeholder='To']/..//li//*[text()='"+totext+"']");
		By search = By.xpath("//a[text()='Search']");
		
		rd.findElement(frompt).click();
		rd.findElement(frompt).sendKeys(fromtext);
		Thread.sleep(3000);
		rd.findElement(from_sel).click();
		Thread.sleep(6000);
		rd.findElement(topt).click();
		Thread.sleep(3000);
		rd.findElement(topt).sendKeys(totext); 
		Thread.sleep(3000);
		rd.findElement(to_sel).click();
		Thread.sleep(6000);
		rd.findElement(search).click();
		Thread.sleep(10000);
	}
	
	@Test(priority=-7)
	public void readExceldata() throws IOException {
		
		File f= new File("./Testdata/data002.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rr= sh.getRow(0);
		//int rowcount = sh.get.getLastCNum() - sh.getFirstRowNum();
		int colcount = rr.getLastCellNum();
		//System.out.println(sh.getLastRowNum());
		System.out.println(colcount);
		//System.out.println("rowcount : "+rowcount);
		for(int i=0;i<colcount;i++) {
			Cell c= sh.getRow(0).getCell(i);
			System.out.println("cell at col " +(i+1)+ " is "+c.getStringCellValue());
		}
		fis.close();
	}
	
	
	
	
	@Test(priority=5)
	public void tearDown() {
		rd.quit();
	}
}