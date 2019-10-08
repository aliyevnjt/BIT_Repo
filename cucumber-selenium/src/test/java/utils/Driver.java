package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver;
	private Driver() {}
	
	public static WebDriver getDriver() {
		if(driver==null) {
		switch (ConfigurationReader.getProperty("browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions op = new ChromeOptions();
			
			driver = new ChromeDriver(op);
			return driver;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;
		}
		}
		return driver;
	}
	
	public static void closeDriver() {
		if(driver!=null) {
			driver.close();
			driver.quit();
			driver = null;

		}
	}
	
}
