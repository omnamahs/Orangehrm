package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertdemo {
public static void main(String args[]) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	Alert al = driver.switchTo().alert();
	al.accept();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Alert al1 = driver.switchTo().alert();
	al1.sendKeys("mukesh");
	al1.accept();
	
}
}
