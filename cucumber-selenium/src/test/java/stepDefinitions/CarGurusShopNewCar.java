package stepDefinitions;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CarGurusNewCarsPage;
import utils.ConfigurationReader;
import utils.Driver;

public class CarGurusShopNewCar {
	
	WebDriver driver = Driver.getDriver();
	CarGurusNewCarsPage newCarsPage = new CarGurusNewCarsPage();
	
	@Given("I am on car gurus home page")
	public void i_am_on_car_gurus_home_page() {
		System.out.println(System.getProperty("url"));
	   driver.navigate().to(System.getProperty("url"));
	   //comment from nijat
	}

	@When("I click on New Cars")
	public void i_click_on_New_Cars() {
		newCarsPage.newCars.click();
	}

	@Then("I click on Shop Cars and handle pop up menu")
	public void i_click_on_Shop_Cars_and_handle_pop_up_menu() {
		newCarsPage.shopCars.click();
		driver.switchTo().alert().accept();
	}

	@Then("I select all mandatory fields {string} , {string} , {string}, {string}, {string}, and {string}")
	public void i_select_all_mandatory_fields_and(String make, String model, String year, String distance, String trim, String zipcode) throws InterruptedException {
		
		
		newCarsPage.selectDropDown(make, newCarsPage.make);
		newCarsPage.selectDropDown(model, newCarsPage.model);
		newCarsPage.selectDropDown(year, newCarsPage.year);
		newCarsPage.selectDropDown(trim, newCarsPage.trim);
		newCarsPage.selectDropDown(distance, newCarsPage.distance);
		newCarsPage.zipCode.sendKeys(zipcode);
		newCarsPage.shopCars.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
