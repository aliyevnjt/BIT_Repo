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


		

		// some comment .....
		// change from Fehmi
		// Nijat
		// New line
		//Cenab qizil Shlyager
		
	}

	// comment from Kamran's laptop
	// Khazar

	@After
	public void tearDown() {
		driver.quit();
	}
}
