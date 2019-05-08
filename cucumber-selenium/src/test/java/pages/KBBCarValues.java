package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Driver;

public class KBBCarValues {
	private WebDriver driver;

	public KBBCarValues() {
		this.driver = Driver.getDriver();
	     PageFactory.initElements(driver, this);
	     
	}
	
	
	@FindBy (id = "makeDropdown0") 
	private WebElement makeDropdown;
	
	@FindBy (id = "modelDropdown0") 
	private WebElement modelDropdown;
	
	@FindBy (id = "priceMyNextCar") 
	public WebElement priceMyNextCar;
	
	
	public void selectYear(String year) {
		new KBBCarValues().driver.findElement(By.partialLinkText(year)).click();
	}
	
	public void selectMake(String make) {
		Select select = new Select(makeDropdown);
		select.selectByVisibleText(make);
	}
	
	public void selectModel(String model) {
		Select select = new Select(modelDropdown);
		select.selectByVisibleText(model);
	}
	
	
}
