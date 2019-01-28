package com.myproject.Durgasoft4_30PMBatch;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class BasePage 
{
	private static final Logger log=Logger.getLogger(BasePage.class.getName());
	public static WebDriver driver;
	public static final String path="./data.properties";
	public static final String log4jpath="./log4j.properties";
	
	
	public static String loadData(String key) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(path);
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	
	public void click(String locatorKey) throws Exception 
	{
		//driver.findElement(By.xpath(loadData(locatorKey))).click();
		getElement(locatorKey).click();
		
	}
	
	public void select(String locatorKey, String value) throws Exception 
	{
		Select sel=new Select(getElement(locatorKey));
		sel.selectByVisibleText(loadData(value));
	}
	

	public void type(String locatorKey, String value) throws Exception 
	{
		getElement(locatorKey).sendKeys(loadData(value));		
	}

	public WebElement getElement(String locatorKey) throws Exception 
	{
		WebElement e=null;
		if(locatorKey.endsWith("_id"))
			e=driver.findElement(By.id(loadData(locatorKey)));
		else if(locatorKey.endsWith("_name"))
			e=driver.findElement(By.name(loadData(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			e=driver.findElement(By.xpath(loadData(locatorKey)));
		else if(locatorKey.endsWith("_class"))
			e=driver.findElement(By.className(loadData(locatorKey)));
		else 
			reportFailure("No locator is matched...." + loadData(locatorKey));
		return e;
	}

	public void reportFailure(String errorMsg) throws Exception 
	{
		takeScreenShot(errorMsg);
		
	}

	public void takeScreenShot(String errorMsg) throws Exception 
	{
		Date dt=new Date();
		String screenshotFileName = dt.toString().replace(":", "_").replace(" ", "_")+".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//failure//"+screenshotFileName));
		log.info(errorMsg);
		Reporter.log(errorMsg);
	}

	public void navigate(String urlKey) throws Exception 
	{
		driver.get(loadData(urlKey));
		
	}

	public void openBrowser(String browserKey) throws Exception 
	{
		if(loadData(browserKey).equalsIgnoreCase("CHROME"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(loadData(browserKey).equalsIgnoreCase("FF")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(loadData(browserKey).equalsIgnoreCase("IE"))
		{
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//drivers//IEDriverServer.exe" );
			driver=new InternetExplorerDriver();
		}
		else if(loadData(browserKey).equalsIgnoreCase("EDGE"))
		{
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe" );
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		PropertyConfigurator.configure(log4jpath);
	}
	

}
