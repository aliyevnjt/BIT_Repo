package stepDefinitions;


import cucumber.api.java.After;

import utils.Driver;

public class Hooks {
	
	
	@After
	public void tearDown() {

		//Driver.closeDriver();
	}
}
