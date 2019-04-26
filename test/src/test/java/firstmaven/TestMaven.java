package firstmaven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMaven {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		driver.get("http://newtours.demoaut.com/");
<<<<<<< HEAD
		// steps in command: git add -A, git commit -m "dsd", git push
		//change from Mehmet
=======

		// some comment .....
		// change from Fehmi
		// Nijat
		//change from Gozal

>>>>>>> 0a636357877ac26d3076497bb97001319230684b
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
