package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Example {
	@Test
	public void assett_1() {
		Reporter.log("fail",true);
		SoftAssert s=new SoftAssert();
		s.assertEquals("g","g");
		Reporter.log("sdjfhs",true);
		s.assertAll();
		Reporter.log("sfsdf",true);
	}
}