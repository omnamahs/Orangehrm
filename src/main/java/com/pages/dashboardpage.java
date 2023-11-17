package com.pages;

import org.openqa.selenium.By;


import com.base.baseclass;

public class dashboardpage extends baseclass {
	public boolean gettingtimeworksection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	 }
	}
