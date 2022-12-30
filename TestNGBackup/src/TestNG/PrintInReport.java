package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintInReport {
	@Test
	public void m1() {
		Reporter.log("hello");
	}
}