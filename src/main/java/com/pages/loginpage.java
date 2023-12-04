package com.pages;

import org.openqa.selenium.By;

import com.base.baseclass;

public class loginpage extends baseclass{
public String getTitle() {
return driver.getTitle();
	
}
public dashboardpage login() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.tagName("button")).click();
	return new dashboardpage();

}

}
