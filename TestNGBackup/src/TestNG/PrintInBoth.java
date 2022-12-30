package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintInBoth {
	@Test
	public void m1() {
		Reporter.log("hello",true);
	}
}