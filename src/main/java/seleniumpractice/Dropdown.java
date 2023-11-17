package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.orangehrm.com/en/contact-sales/");
	WebElement dropdown= driver.findElement(By.name("Country"));
	Select obj = new Select(dropdown);
obj.selectByValue("Australia");
List<WebElement> options = driver.findElements(By.tagName("option"));
System.out.println(options.size());
	
}
public static void dropdowntask() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.orangehrm.com/en/contact-sales/");
	WebElement country = driver.findElement(By.name("Country"));
	List<WebElement> options = country.findElements(By.tagName("option"));
	System.out.println(options.size());
	for (WebElement opt : options) {
		System.out.println(opt.getText());
		
	}
}
}