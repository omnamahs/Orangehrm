package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public static WebDriver driver;
	public static Properties prop;
public void initialization() {
	driver	= new  FirefoxDriver() ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get(prop.getProperty("url"));
}
public void teardown() {
	driver.close();
}
public void readpropertyfile()  {
	 prop = new Properties();
	String configfile = "./src/main/resources/com/mukesh/config/configproperties";
	try {
		FileInputStream fis = new FileInputStream(configfile);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
	
}

	
	


