package firstmaven;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMaven {

	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.cars.com/");
	
	}
	
//	aman Allahim
//	eger bu yaziyi okuyorsaniz bilin ki ben coktaan cok uzak diyarlardan git push yapmisim demektir.
//	
//	FFFFFF  EEEEEE	H 	 H	M	  M	 I			
//	F	    E		H	 H	MM   MM	 I
//	FFFFFF  EEEE	HHHHHH	M M M M	 I		FEHMI EVDE SIGARA ICME, TERBIYESIZ FEHMI
//	F	    E		H	 H	M  M  M	 I
//	F		EEEEEE	H	 H	M	  M	 I

	@Test
	public void test1() {


		assertTrue(driver.getTitle().contains("New Cars"));

		System.out.println(driver.getTitle());

		WebElement selectAstockType = driver.findElement(By.xpath("//select[@name='stockType']"));
		WebElement selectAmake = driver.findElement(By.xpath("//select[@name='makeId']"));
		WebElement selectAmodel = driver.findElement(By.xpath("//select[@name='modelId']"));

		selectByText(selectAstockType, "New Cars");
		selectByText(selectAmake, "Audi");
		selectByText(selectAmodel, "S5");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = driver.findElement(By.xpath("//input[@class='NZE2g']"));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();

		String expectedHeader = "New Audi S5 for Sale";
		String actualHeader = driver.findElement(By.xpath("//h1[@class='srp-header']")).getText();

		assertEquals(expectedHeader, actualHeader);

	}

	public static void selectByText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	@After
	public void tearDown() {


//		driver.quit();



	}
}
