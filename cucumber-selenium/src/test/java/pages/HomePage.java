package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class HomePage {
	WebDriver driver;

	public HomePage() {
		this.driver = Driver.getDriver();
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "q")
	 public WebElement searchBox;
	 
	 
}
