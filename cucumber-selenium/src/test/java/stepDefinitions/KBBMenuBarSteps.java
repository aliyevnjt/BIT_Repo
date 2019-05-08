package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.KBBHomePage;
import utils.ConfigurationReader;
import utils.Driver;

public class KBBMenuBarSteps {
	
	WebDriver driver;
	KBBHomePage kbbHomePage = new KBBHomePage();
	List<String> listOfTopMenus = new ArrayList<>();
	@Given("I am on KBB Home Page")
	public void i_am_on_KBB_Home_Page() {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(ConfigurationReader.getProperty("url"));
	}

	@Then("I get all menus from top")
	public void i_get_all_menus_from_top() {
		listOfTopMenus.add("Home");
		listOfTopMenus.add("Car Values");
		listOfTopMenus.add("Cars for Sale");
		listOfTopMenus.add("Car Reviews");
		listOfTopMenus.add("Awards & Top 10s");
		listOfTopMenus.add("Research Tools");
	}

	@Then("I verify all the menus are exist and are clickable")
	public void i_verify_all_the_menus_are_exist_and_are_clickable() {
		int i = 0;
		for (WebElement element : kbbHomePage.topMenuBars) {
			Assert.assertTrue(element.isDisplayed());
			Assert.assertEquals(listOfTopMenus.get(i), element.getText());
			i++;
		}
		
	}
}
