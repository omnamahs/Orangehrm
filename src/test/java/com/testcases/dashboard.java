package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.baseclass;
import com.pages.dashboardpage;
import com.pages.loginpage;

public class dashboard extends baseclass{
 
 loginpage lp;
	dashboardpage dp;
	@BeforeMethod
	public void openbrowser() {
		lp = new loginpage();
		lp.initialization();
		}
	@Test
	public void  timeworksection() {
		dp=lp.login();
 Assert.assertTrue(dp.gettingtimeworksection());
	}
	@AfterMethod
	public void closebrowser() {
		//driver.close();
		lp.teardown();
}
}