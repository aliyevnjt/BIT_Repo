<<<<<<< HEAD
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

		// comment from Kamran's laptop
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
=======
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
		
		// steps in command: git add -A, git commit -m "dsd", git push
		
		// A useful link : http://rogerdudler.github.io/git-guide/
	}

	@After
	public void tearDown() {
//		driver.quit();
	}
}
>>>>>>> 5628b52804891c5dd9435b2a3895a798a016fb33
