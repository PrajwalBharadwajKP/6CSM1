package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataFromXMLFile {
	@Parameters({ "Browser" })
	@Test
	public void m1(String Browser) throws InterruptedException {
		WebDriver driver;
		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		for (int i = 1; i <= 100; i++) {
			username.sendKeys("hello");
			password.sendKeys("hello");

			username.clear();
			password.clear();
		}
	}
}