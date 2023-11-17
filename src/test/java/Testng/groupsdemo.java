package Testng;

import org.testng.annotations.Test;

public class groupsdemo {
	@Test(groups = {"mobile"})
public void mobile() {
	System.out.println("testing mobile");
}
	@Test(groups= {"mobile"})
public void mobile1() {
	System.out.println("testing mobile1");
}
	@Test(groups = {"cricket"})
public void cricket() {
	System.out.println("playing cricket");
}
	@Test(groups = {"cricket"})
public void cricket1() {
	System.out.println("plying cricket1");
}
}
