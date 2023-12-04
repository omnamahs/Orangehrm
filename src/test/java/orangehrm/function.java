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
private static final WebElement PerformanceElement = null;
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
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).click();
		
		//Click on Clock Button
		By punchtime=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button/i");
		WebElement punchtimeElement=driver.findElement(punchtime);
		punchtimeElement.click();
		
		
		//Time module navigate verification
		By timeText=By.xpath("(//*[text()='Attendance'])[1]");
		WebElement timeTextElement=driver.findElement(timeText);
		String actualText=timeTextElement.getText();
		Assert.assertEquals(actualText, "Attendance");
		
		// Click on Dashboard Button
		By dashboard = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
		WebElement dashboardElement = driver.findElement(dashboard);
		dashboardElement.click();

	   //Click on Leave request
		By leave = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p");
		WebElement leaveElement = driver.findElement(leave);
		leaveElement.click();
		
		
			
		// Click on Dashboard Button
		By dashboard1 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
		WebElement dashboardElement1 = driver.findElement(dashboard);
		dashboardElement1.click();	
			
		// click on timesheet approve
			By Timesheets=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/p");
			WebElement TimesheetsElement=driver.findElement(Timesheets);
			TimesheetsElement.click();
			
		// timesheet approve button verification
			By TimesheetsText=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]");
			WebElement TimesheetsTextElement=driver.findElement(TimesheetsText);
			String actualTimesheetsText=TimesheetsTextElement.getText();
			Assert.assertEquals(actualTimesheetsText, "Timesheets");
			
			
		// Click on Dashboard Button
			By dashboard2 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
			WebElement dashboardElement2 = driver.findElement(dashboard);
			dashboardElement2.click();
	    
	    //click on pending self review
			By Pendingselfreview=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/p");
			WebElement PendingselfreviewElement=driver.findElement(Pendingselfreview);
			PendingselfreviewElement.click();
			
			
		// Click on Dashboard Button
			By dashboard3 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
			WebElement dashboardElement3 = driver.findElement(dashboard);
			dashboardElement3.click();
			
		//click on quick launch assign leave
			By AssignLeave=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/button/svg");
			WebElement AssignLeaveElement=driver.findElement(AssignLeave);
			AssignLeaveElement.click();
		
		//Assign Leave verification
			By AssignLeaveText=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
			WebElement AssignLeaveTextElement=driver.findElement(TimesheetsText);
			String actualAssignLeaveText=AssignLeaveElement.getText();
			Assert.assertEquals(actualAssignLeaveText, "AssignLeave");
			
			// Click on Dashboard Button
			By dashboard4 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
			WebElement dashboardElement4 = driver.findElement(dashboard);
			dashboardElement4.click();
				
			// click on leavelist
				By LeaveList=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/button/svg/g/g/path[3]");
				WebElement LeaveListElement=driver.findElement(LeaveList);
				LeaveListElement.click();
				
			//LeaveList verification
				By LeaveListText=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
				WebElement LeaveListTextElement=driver.findElement(LeaveListText);
				String actualLeaveListText=LeaveListElement.getText();
				Assert.assertEquals(actualLeaveListText, "LeaveList");
				
				// Click on Dashboard Button
				By dashboard5 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
				WebElement dashboardElement5 = driver.findElement(dashboard);
				dashboardElement5.click();
				
			// clickon apply leave
				  By ApplyLeave=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button/svg");
					WebElement ApplyLeaveElement=driver.findElement(ApplyLeave);
					ApplyLeaveElement.click();
					
					// Apply leave Verification
					By ApplyLeaveText=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
					WebElement ApplyLeaveTextElement=driver.findElement(LeaveListText);
					String actualApplyLeaveText=ApplyLeaveElement.getText();
					Assert.assertEquals(actualApplyLeaveText, "ApplyLeave");
					
					// Click on Dashboard Button
					By dashboard6 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
					WebElement dashboardElement6 = driver.findElement(dashboard);
					dashboardElement6.click();
					  
			//Click On my leave
					  By MyLeave=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button/svg/g/g/path[1]");
						WebElement MyLeaveElement=driver.findElement(MyLeave);
						MyLeaveElement.click();
		
		  // my leave verification
						By MyLeaveText=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
						WebElement MyLeaveTextElement=driver.findElement(MyLeaveText);
						String actualMyLeaveText=MyLeaveElement.getText();
						Assert.assertEquals(actualMyLeaveText, "MyLeave");
						
						// Click on Dashboard Button
						By dashboard7 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
						WebElement dashboardElement7 = driver.findElement(dashboard);
						dashboardElement7.click();
						  
			// my timesheets click
						  By MyTimesheets=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[6]/button/svg/g/path");
							WebElement MyTimesheetsElement=driver.findElement(MyTimesheets);
							MyTimesheetsElement.click();
							
			//my timesheets verification
							By TimesheetsText1=By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]");
							WebElement TimesheetsTextElement1=driver.findElement(LeaveListText);
							String actualTimesheetsText1=TimesheetsElement.getText();
							Assert.assertEquals(actualTimesheetsText, "Timesheets")	;	
							
							// Click on Dashboard Button
							By dashboard8 = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a");
							WebElement dashboardElement8 = driver.findElement(dashboard);
							dashboardElement8.click();
							  
				// verifying buzz latest post
							  By BuzzLatestPostText=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[4]/div/div[1]/div/p");
								WebElement BuzzLatestPostTextElement=driver.findElement(BuzzLatestPostText);
								String actualBuzzLatestPostText=((WebElement) BuzzLatestPostText).getText();
								Assert.assertEquals(actualBuzzLatestPostText, "BuzzLatestPost")	;
								
			// click on employees on leave today setting button
								By EOLT=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i");
								WebElement EOLTElement=driver.findElement(EOLT);
								EOLTElement.click();
								
	         //configuration of employees on leave today verification
						By ConfigurationsText=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[5]/div/div[1]/i");
					    WebElement ConfigurationsTextElement=driver.findElement(ConfigurationsText);
					    String actualConfigurationsText=((WebElement) ConfigurationsText).getText();
						Assert.assertEquals(actualConfigurationsText, "Configurations")	;
					   
			//verification of employee distribution by sub unit
						By EDSUText=By.xpath("//*[@id=\"2iuMI2Uz\"]");
					    WebElement EDSUTextElement=driver.findElement(EDSUText);
					    String actualEDSUText=((WebElement) EDSUText).getText();
						Assert.assertEquals(actualEDSUText, "EDSU")	;
						
				
			// verification of employee distribution by location		
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
