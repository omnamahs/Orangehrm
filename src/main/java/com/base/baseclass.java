package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public static WebDriver driver;
	
public void initialization() {
	driver	= new  FirefoxDriver() ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
public void teardown() {
	driver.close();
}
}
