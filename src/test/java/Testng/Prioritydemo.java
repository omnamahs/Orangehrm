package Testng;

import org.testng.annotations.Test;

public class Prioritydemo {
	@Test(priority = 1)
public void mukesh() {
	System.out.println("mukesh");
}
	@Test(priority = 3)
public void abhi() {
	System.out.println("abhi");
}
	@Test(priority = 4)
public void dhanraj() {
	System.out.println("dhanraj");
}
	@Test(priority = 2)
public void prashis() {
	System.out.println("prashis");
}
}
