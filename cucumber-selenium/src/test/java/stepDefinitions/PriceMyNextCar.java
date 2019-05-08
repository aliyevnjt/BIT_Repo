package stepDefinitions;

import cucumber.api.java.en.Then;
import pages.KBBCarValues;
import pages.KBBHomePage;

public class PriceMyNextCar {
	
	KBBHomePage homePage = new KBBHomePage();
	KBBCarValues carValues = new KBBCarValues();
	
	
	@Then("I click on Car Values")
	public void i_click_on_Car_Values() {
	    homePage.topMenuBars.get(1).click();
	}

	@Then("I select {string} and {string} of the car")
	public void i_select_and_of_the_car(String make, String model) {
		carValues.selectMake(make);
		carValues.selectModel(model);
	}

	@Then("I click on Price My Next Car")
	public void i_click_on_Price_My_Next_Car() throws InterruptedException {
		Thread.sleep(4000);
	    carValues.priceMyNextCar.click();
	}
	
	@Then("I choose {string}")
	public void i_choose(String string) {
	    carValues.selectYear("2018");
	}
}
