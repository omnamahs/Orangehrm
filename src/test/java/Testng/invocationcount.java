package Testng;

import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount = 4)
public void test() {
	System.out.println("system is testing");
}
}
