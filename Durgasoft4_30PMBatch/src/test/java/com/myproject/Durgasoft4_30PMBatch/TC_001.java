package com.myproject.Durgasoft4_30PMBatch;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001 extends BasePage
{
	private static final Logger log=Logger.getLogger(TC_001.class.getName());
	
  @Test
  public void f() throws Exception 
  {
	  openBrowser("chromebrowser");
	  log.info("Opened the browser :-" + loadData("chromebrowser"));
	  Reporter.log("Opened the browser :-" + loadData("chromebrowser"));
	  
	  navigate("amazonurl");
	  log.info("Navigate to the Url :-" + loadData("amazonurl"));
	  Reporter.log("Navigate to the Url :-" + loadData("amazonurl"));
	  
	  select("amazondropdown_id","dropvalue");
	  log.info("Selected the item :-" + loadData("dropvalue")  + " by using locator :- " + loadData("amazondropdown_id"));
	  Reporter.log("Selected the item :-" + loadData("dropvalue")  + " by using locator :- " + loadData("amazondropdown_id"));
	  
	  type("amazonsearchtext_id","searchtext");
	  log.info("Entered the text :- " + loadData("searchtext") + " by using locator :-  " + loadData("amazonsearchtext_id"));
	  Reporter.log("Entered the text :- " + loadData("searchtext") + " by using locator :-  " + loadData("amazonsearchtext_id"));
	  
	  click("amazonsearchbutton_xpath");
	  log.info("Clicked on the amazon Search Button by using locator :- " + loadData("amazonsearchbutton_xpath"));
	  Reporter.log("Clicked on the amazon Search Button by using locator :- " + loadData("amazonsearchbutton_xpath"));
  }




}
