package com.alfuttaim.qa.util;

import com.alfuttaim.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT=30;
	
	public static long IMPLICIT_WAIT=30;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpannel");
		
		
	}
}
