package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.ConfigurationReader;
import utils.Driver;

public class Hooks {
	
	
	@After
	public void tearDown() {
		Driver.closeDriver();
	}
}
