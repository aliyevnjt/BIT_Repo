package firstmaven;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestStepDefinitions {
	
	static WebDriver driver;
	
	@Given("I am on Home Page")
	public void i_am_on_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	

	@Then("I get a title of website and assert it equals to My Store")
	public void i_get_a_title_of_website_and_assert_it_equals_to_My_Store() {
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@Then("I hover over DRESS menu and click CASUAL DRESSES")
	public void i_hover_over_DRESS_menu_and_click_CASUAL_DRESSES() throws InterruptedException {
	   WebElement element = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).build().perform();
	   Thread.sleep(3000);
	   element = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
	   actions.moveToElement(element).click().build().perform();
	   
	    
	}

	@Then("I verify CASUAL DRESSES appears in breadcrumb")
	public void i_verify_CASUAL_DRESSES_appears_in_breadcrumb() {
		String breadcrumb = driver.findElement(By.xpath("//div[@class='breadcrumb clearfix']")).getText();
		Assert.assertTrue(breadcrumb.contains("Casual Dresses"));;
	}
	
}
