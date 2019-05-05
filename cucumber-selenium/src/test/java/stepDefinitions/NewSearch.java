package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pages.HomePage;
import utils.Driver;

public class NewSearch {
	
	HomePage homePage = new HomePage();

	@Then("Another search for something")
	public void another_search_for_something() {
		
		homePage.searchBox.sendKeys("another hello" + Keys.ENTER);
	}
}
