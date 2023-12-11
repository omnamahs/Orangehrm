package orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class function {

WebDriver driver;
	
	@BeforeMethod
	public void launchapplication() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("open the browser");
		System.out.println("launch the application");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void getmethod() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		
	
		By punchtime=By.xpath("//i[@class='oxd-icon bi-stopwatch']");
		WebElement punchtimeElement=driver.findElement(punchtime);
		punchtimeElement.click();
		
		By timeText=By.xpath("(//*[text()='Attendance'])[1]");
		WebElement timeTextElement=driver.findElement(timeText);
		String actualText=timeTextElement.getText();
		Assert.assertEquals(actualText, "Attendance");
		
		
		By dashboard = By.xpath("//span[text()='Dashboard']");
		WebElement dashboardElement = driver.findElement(dashboard);
		dashboardElement.click();

	  
		By leave = By.xpath("//p[text()=' (11) Leave Requests to Approve']");
		WebElement leaveElement = driver.findElement(leave);
		leaveElement.click();
		
		By dashboard1 = By.xpath("//span[text()='Dashboard']");
		WebElement dashboardElement1 = driver.findElement(dashboard);
		dashboardElement1.click();	
			
		
			By Timesheets=By.xpath("//p[text()=' (6) Timesheets to Approve']");
			WebElement TimesheetsElement=driver.findElement(Timesheets);
			TimesheetsElement.click();
			
		
			By dashboard2 = By.xpath("//span[text()='Dashboard']");
			WebElement dashboardElement2 = driver.findElement(dashboard);
			dashboardElement2.click();
	    
	  
			By Pendingselfreview=By.xpath("//p[text()= '(1) Pending Self Review']");
			WebElement PendingselfreviewElement=driver.findElement(Pendingselfreview);
			PendingselfreviewElement.click();
			
		
			By dashboard3 = By.xpath("//span[text()='Dashboard']");
			WebElement dashboardElement3 = driver.findElement(dashboard);
			dashboardElement3.click();
			
	
			By AssignLeave=By.xpath("//div[@title='Assign Leave']");
			WebElement AssignLeaveElement=driver.findElement(AssignLeave);
			AssignLeaveElement.click();
		
			
			By dashboard4 = By.xpath("//span[text()='Dashboard']");
			WebElement dashboardElement4 = driver.findElement(dashboard);
			dashboardElement4.click();
				
			
				By LeaveList=By.xpath("//div[@title='Leave List']");
				WebElement LeaveListElement=driver.findElement(LeaveList);
				LeaveListElement.click();
				
				
				By dashboard5 = By.xpath("//span[text()='Dashboard']");
				WebElement dashboardElement5 = driver.findElement(dashboard);
				dashboardElement5.click();
				
			
				  By ApplyLeave=By.xpath("//div[@title='Timesheets']");
					WebElement ApplyLeaveElement=driver.findElement(ApplyLeave);
					ApplyLeaveElement.click();
					
					
					
					By dashboard6 = By.xpath("//span[text()='Dashboard']");
					WebElement dashboardElement6 = driver.findElement(dashboard);
					dashboardElement6.click();
					  
			
					  By MyLeave=By.xpath("//div[@title='Apply Leave']");
						WebElement MyLeaveElement=driver.findElement(MyLeave);
						MyLeaveElement.click();

						
						
						By dashboard7 = By.xpath("//span[text()='Dashboard']");
						WebElement dashboardElement7 = driver.findElement(dashboard);
						dashboardElement7.click();
						  
			
						  By MyTimesheets=By.xpath("//div[@title='My Timesheet']");
							WebElement MyTimesheetsElement=driver.findElement(MyTimesheets);
							MyTimesheetsElement.click();
							
							
							
							By dashboard8 = By.xpath("//span[text()='Dashboard']");
							WebElement dashboardElement8 = driver.findElement(dashboard);
							dashboardElement8.click();
							  
				
							  By BuzzLatestPostText=By.xpath("//p[@title='Buzz Latest Post']");
								WebElement BuzzLatestPostTextElement=driver.findElement(BuzzLatestPostText);
								String actualBuzzLatestPostText=((WebElement) BuzzLatestPostText).getText();
								Assert.assertEquals(actualBuzzLatestPostText, "BuzzLatestPost")	;
								
			
								By EOLT=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i");
								WebElement EOLTElement=driver.findElement(EOLT);
								EOLTElement.click();
								
						By EDSUText=By.xpath("//*[@id=\"2iuMI2Uz\"]");
					    WebElement EDSUTextElement=driver.findElement(EDSUText);
					    String actualEDSUText=((WebElement) EDSUText).getText();
						Assert.assertEquals(actualEDSUText, "EDSU")	;
						
				
				
						By EDLText=By.xpath("//*[@id=\"2iuMI2Uz\"]");
					    WebElement EDLTextElement=driver.findElement(EDLText);
					    String actualEDLText=((WebElement) EDLText).getText();
						Assert.assertEquals(actualEDLText, "EDL")	;
				
	}
	public void closebrowser() {
		System.out.println("close the browser");
		driver.close();
	}
}
