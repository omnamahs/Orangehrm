package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class urlsize {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement Username= driver.findElement(By.id("email"));
	List<WebElement> urls = driver.findElements(By.tagName("a"));
	System.out.println("count of url is"+urls.size());
	for (int i = 0; i < urls.size(); i++) {
		System.out.println(urls.get(i).getText());
	}
}
}
