package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.ConfigurationReader;
import utils.Driver;

public class GoogleSearch {
	
	WebDriver driver;
	HomePage homePage = new HomePage();
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		driver = Driver.getDriver();
	    driver.get(ConfigurationReader.getProperty("url"));
	}

	@Then("search for something")
	public void search_for_something() {
		homePage.searchBox.sendKeys("hello" + Keys.ENTER);
	}
}
