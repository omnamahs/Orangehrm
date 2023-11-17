package Testng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class xmlparameter {
	@Parameters({"username", "password"})
	@Test(dataProvider = "getdatafromexcel")
//public void login(String uname, String pwd) {
	public void loginusingexceldata(String uname, String pwd) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.tagName("button")).click();
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][1]="Admin1";
		data[1][2]="admin231";
		return data;
	}
	@DataProvider
	public Object[][] getdatafromexcel() throws IOException{
		excelreder reader = new excelreder();
		return  reader.getdata();
	}
}
