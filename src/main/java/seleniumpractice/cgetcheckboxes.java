package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cgetcheckboxes {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement cbox1 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	System.out.println(cbox1.isDisplayed());
	System.out.println(cbox1.isSelected());
	System.out.println(cbox1.isEnabled());

	WebElement cbox2 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	System.out.println(cbox1.isDisplayed());
	System.out.println(cbox1.isSelected());
	System.out.println(cbox1.isEnabled());
	
	cbox1.click();
}
}
