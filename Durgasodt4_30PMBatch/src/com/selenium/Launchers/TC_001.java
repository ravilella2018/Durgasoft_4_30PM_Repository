package com.selenium.Launchers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("sony");
		
		loc.clear();
		
		loc.sendKeys("samsung");
		
		
		driver.findElement(By.className("nav-input")).click();
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
			

	}

}
