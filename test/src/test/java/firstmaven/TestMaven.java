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
<<<<<<< Updated upstream
=======
import org.testng.Assert;

>>>>>>> Stashed changes
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMaven {

	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
<<<<<<< Updated upstream

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.cars.com/");
	
=======
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cars.com/");
>>>>>>> Stashed changes
	}

	@Test
	public void test1() {

		Assert.assertTrue(driver.getTitle().contains("New Cars")); // assert that we are on the correct website.

		WebElement selectAStockType = driver.findElement(By.name("stockType"));
		selectByText(selectAStockType, "New Cars");

<<<<<<< Updated upstream
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
=======
		WebElement makeOfTheCar = driver.findElement(By.name("makeId"));
		selectByText(makeOfTheCar, "Audi");

		WebElement model = driver.findElement(By.name("modelId"));
		selectByText(model, "S5");

		WebDriverWait wait = new WebDriverWait (driver, 10); //explicit wait
		WebElement search = driver.findElement(By.className("NZE2g"));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		
		
		driver.findElement(By.className("NZE2g")).click();
		// New Audi S5 for Sale
		// srp-header
		String header = driver.findElement(By.className("srp-header")).getText();
		Assert.assertEquals("New Audi S5 for Sale", header);

	}

	public static void selectByText(WebElement element, String visibletext) {

		Select sel = new Select(element);
		sel.selectByVisibleText(visibletext);
>>>>>>> Stashed changes

	}

	public static void selectByText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	@After
	public void tearDown() {
<<<<<<< Updated upstream


//		driver.quit();



=======
//		driver.quit();
>>>>>>> Stashed changes
	}
}
