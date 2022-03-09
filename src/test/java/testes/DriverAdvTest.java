package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverAdvTest {
	
	private static WebDriver driver;
	
	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	private static WebDriver getDriver() {
		return driver;
	}
	
}
