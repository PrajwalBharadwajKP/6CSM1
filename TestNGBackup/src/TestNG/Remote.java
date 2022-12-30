package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Remote {

	@Test
	public void m1() throws MalformedURLException {
		URL url =new URL("IP Adddress of remote system given by DEVOPS team");
		DesiredCapabilities decap=new DesiredCapabilities();
		decap.setBrowserName("chrome");
		WebDriver driver =new RemoteWebDriver(url, decap);	
	}
}