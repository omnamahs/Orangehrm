package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class anotationdemo {
	@AfterSuite
	public void suite() {
		System.out.println("sending status report");
	}

	@BeforeMethod
public void beforemethod() {
	System.out.println("open the browser");
	System.out.println("launch the applictation");
}
	@Test
public void validatetitle() {
	System.out.println("validating title testcase");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("close the browser");
	}
}
