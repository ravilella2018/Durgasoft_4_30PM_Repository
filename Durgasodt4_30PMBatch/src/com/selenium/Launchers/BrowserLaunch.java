package com.selenium.Launchers;

public class BrowserLaunch extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		//launch(loadData("firefoxbrowser"), loadData("amazonurl"));
		
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		//driver.close();
		
		driver.quit();
		
		
	}

}
