package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {
public static void main(String[] args) {
	//hover();
	//keyboardevents();
	//clicks();
	//scrolling();
	dragdrop();
}
public static void hover() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.myntra.com/");
	WebElement kidsmenu= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
	Actions act = new Actions(driver);
	act.moveToElement(kidsmenu).perform();
	
}
public static void keyboardevents() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement test =driver.findElement(By.id("email"));
	Actions act = new Actions(driver);
	act.moveToElement(test).keyDown(Keys.SHIFT).sendKeys("testemail").keyUp(Keys.SHIFT).perform();
	act.keyDown(Keys.TAB).perform();
	}
public static void clicks() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	Actions act = new Actions(driver);
	WebElement test = driver.findElement(By.id("email"));
	//act.doubleClick().perform();
	act.contextClick(test).perform();
	}
public static void scrolling() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	
	Actions act = new Actions(driver);
	WebElement target =driver.findElement(By.xpath("//span[text()='Explore top offers in smartphones']"));
	act.scrollToElement(target).perform();
}
public static void dragdrop() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target1 = driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target1).perform();
}
	
}
