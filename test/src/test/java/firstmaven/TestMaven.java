package firstmaven;

import java.util.concurrent.TimeUnit;
<<<<<<< HEAD
=======



>>>>>>> f995d03ba3f9862d59c31dc45d5bba26c326bca1
import org.junit.After;
import org.junit.Assert;
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
import org.junit.Assert;


public class TestMaven {

	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.cars.com/");
	}

	@Test
	public void test1() {

<<<<<<< HEAD
		Assert.assertTrue(driver.getTitle().contains("New Cars"));
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
		Assert.assertEquals(expectedHeader, actualHeader);

	}

	public static void selectByText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

=======

		Assert.assertTrue(driver.getTitle().contains("New Cars"));
		WebElement selectAstockType = driver.findElement(By.name("stockType"));
		selectBytext(selectAstockType, "New Cars");
		WebElement make = driver.findElement(By.name("makeId"));
		selectBytext(make, "Audi");
		WebElement modelId = driver.findElement(By.name("modelId"));
		selectBytext(modelId, "S5");
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		WebElement search =driver.findElement(By.className("NZE2g"));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		String header = driver.findElement(By.className("srp-header")).getText();
		Assert.assertEquals("New Audi S5 for Sale", header);
		
//		select.selectByVisibleText("New Cars");
//		WebElement make= driver.findElement(By.name("makeId"));
//        select = new Select(make);
//        select.selectByVisibleText("Audi");
//        WebElement modelId= driver.findElement(By.name("modelId"));
//        select = new Select(modelId);
//        select.selectByVisibleText("S5");
//        

		
	}
	
	public static void selectBytext(WebElement element, String visibleText) {
		Select select =  new Select(element);
		select.selectByVisibleText(visibleText);
>>>>>>> f995d03ba3f9862d59c31dc45d5bba26c326bca1
	}
	@After
	public void tearDown() {
<<<<<<< HEAD
//		driver.quit();
=======
		//driver.quit();
>>>>>>> f995d03ba3f9862d59c31dc45d5bba26c326bca1
	}
}
