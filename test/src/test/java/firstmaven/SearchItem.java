package firstmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static utils.Driver.*;

public class SearchItem {

	private WebDriver driver = getDriver();
	
	
	
	@Given("I am on Home Page")
	public void i_am_on_Home_Page() {
		
		driver.get("http://automationpractice.com/index.php");
	}

	@Then("I search for {string}")
	public void i_search_for(String item) {

		driver.findElement(By.id("search_query_top")).sendKeys(item + Keys.ENTER);
		closeDriver();
		
	}
}
