package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitdemo {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumframework.com/practiceform/");
	driver.findElement(By.id("timingAlert")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent()).accept();
}
}
