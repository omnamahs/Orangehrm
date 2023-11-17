package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framework {
//public static void main(String[] args) {
	//WebDriver driver = new FirefoxDriver();
	//driver.get("https://the-internet.herokuapp.com/tinymce");
	 
	 //driver.findElement(By.id("mce_0_ifr")).sendKeys("Mukesh");
	
	 //driver.switchTo().frame(0);
	//WebElement target=driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
	//driver.findElement(By.id("mce_0_ifr")).clear();
	//driver.findElement(By.id("mce_0_ifr")).sendKeys("Mukesh");
	//driver.switchTo().frame(target);
//}
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	WebElement target =driver.findElement(By.xpath("/html/body/section/div"));
	driver.switchTo().parentFrame();
	WebElement target1 =driver.findElement(By.xpath("/html/body/section/div/div"));
	driver.switchTo().frame(target1);
	WebElement targe2=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	driver.findElement(By.tagName("input")).sendKeys("mukesh");
	driver.switchTo().frame(0);
}
}

