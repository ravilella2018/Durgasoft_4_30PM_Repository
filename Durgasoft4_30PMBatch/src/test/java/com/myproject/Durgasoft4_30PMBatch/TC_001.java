package com.myproject.Durgasoft4_30PMBatch;

import org.testng.annotations.Test;

public class TC_001 extends BasePage
{
	
  @Test
  public void f() throws Exception 
  {
	  openBrowser("chromebrowser");
	  
	  navigate("amazonurl");
	  
	  select("amazondropdown_id","dropvalue");
	  
	  type("amazonsearchtext_id","searchtext");
	  
	  click("amazonsearchbutton_xpath");
  }




}
