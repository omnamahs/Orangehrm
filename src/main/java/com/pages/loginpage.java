package com.pages;

import org.openqa.selenium.By;

import com.base.baseclass;

public class loginpage extends baseclass{
public String getTitle() {
return driver.getTitle();
	
}
public dashboardpage login() {
	driver.findElement(By.name("username")).sendKeys("username");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.tagName("button")).click();
	return new dashboardpage();

}

}
