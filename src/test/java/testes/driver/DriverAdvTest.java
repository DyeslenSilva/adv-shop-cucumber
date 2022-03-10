package testes.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class DriverAdvTest {
	
	private static WebDriver driver;

	
//	@BeforeAll
//	public static void before_or_after_all() {
//		DriverAdvTest.setDriver();
//		driver = new ChromeDriver();
//		System.out.println("Before");
//	}
//	
	public DriverAdvTest() {
		DriverAdvTest.setDriver();
		driver = new ChromeDriver();
		driver.navigate().to("https://advantageonlineshopping.com/#/");
	}
	
	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
	}

	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
