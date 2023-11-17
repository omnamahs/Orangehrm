package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathdemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']/div/div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']/div/div/input")).sendKeys("admin123");
		
	}
}
