package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import cucumber.api.java.en.Then;
import pages.CarGurusSellMyCarPage;

public class SellMyCar {
	
	CarGurusSellMyCarPage sellCar = new CarGurusSellMyCarPage();
	
	@Then("I click on Sell My Car")
	public void i_click_on_Sell_My_Car() {
		sellCar.sellMyCar.click();
	}

	@Then("I click on Sell your car")
	public void i_click_on_Sell_your_car() {
		sellCar.sellYourCar.click();
	}

	@Then("I type {string}")
	public void i_type(String zipCode) {
		sellCar.zipCode.sendKeys(zipCode);
	}

	@Then("I select {string}, {string}, {string}, {string} from dropdown menu")
	public void i_select_from_dropdown_menu(String make, String model, String year, String trim) throws InterruptedException {
		sellCar.selectDropDown(make, sellCar.make);
		sellCar.selectDropDown(model, sellCar.model);
		sellCar.selectDropDown(year, sellCar.year);
		Thread.sleep(3000);
		sellCar.selectDropDown(trim, sellCar.trim);
	}

	@Then("I type {string} and click on I am still paying ...")
	public void i_type_and_click_on_I_am_still_paying(String mileage) {
		sellCar.IamStillPaying.click();
	}

	@Then("I type {string} and {string} colors, and {string}")
	public void i_type_and_colors_and(String exterior, String interior, String description) throws InterruptedException {
		sellCar.exteriorColor.sendKeys(exterior);
		sellCar.interiorColor.sendKeys(interior);
		Thread.sleep(3000);
		sellCar.description.sendKeys(description);
	}
	
	@Then("I choose a {string}")
	public void i_choose_a(String file) throws AWTException {
		sellCar.chooseFile.click();
		StringSelection ss = new StringSelection(file);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    //sellCar.chooseFile.sendKeys(file);
	}

	@Then("I type {string} and {string}")
	public void i_type_and(String firstName, String lastName) {
	    sellCar.firstName.sendKeys(firstName);
	    sellCar.lastName.sendKeys(lastName);
	}

	@Then("I click on I am at least ... and sign in")
	public void i_click_on_I_am_at_least_and_sign_in() {
	    
	}
}
