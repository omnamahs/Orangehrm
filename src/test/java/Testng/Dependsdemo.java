package Testng;

//import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsdemo {
	@Test
public void login() {
	System.out.println("login");
	//Assert.fail("login is not working");
}
	@Test
public void sendfriendrequest() {
	System.out.println("sending friend request");
	//Assert.fail("sending friend request is not working");
}
	@Test(dependsOnMethods = { "sending friend request"})
public void acceptfriendrequest() {
	System.out.println("accepting friend request");
}
}
