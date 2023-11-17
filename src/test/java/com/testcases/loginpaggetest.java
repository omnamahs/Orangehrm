package com.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.loginpage;

public class loginpaggetest {
	//WebDriver driver;
	loginpage lp;
	@BeforeMethod
public void openbrowser() {
	//driver	= new  FirefoxDriver() ;
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 lp = new loginpage();
		lp.initialization();
		}
	@Test
	public void validatetitle() {
	//String acttitle=driver.getTitle();
		String acttitle= lp.getTitle();
	String exptitle= "OrangeHRM";
	Assert.assertEquals(acttitle, exptitle);
	
}
	@Test
	public void validatelogintest() {
		//driver.findElement(By.name("username")).sendKeys("username");
		//driver.findElement(By.name("password")).sendKeys("password");
		//driver.findElement(By.tagName("button")).click();
		lp.login();
		}
	@AfterMethod
	public void closebrowser() {
		//driver.close();
		lp.teardown();
	}
}
