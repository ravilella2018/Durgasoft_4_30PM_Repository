package com.selenium.Launchers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		

		System.setProperty("webdriver.gecko.driver", "D:\\Browser_Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		
		System.setProperty("webdriver.ie.driver", "D:\\Browser_Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.snapdeal.com");
		
		
		System.setProperty("webdriver.edge.driver", "D:\\Browser_Drivers\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
				
		
	}

}
