package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Driver;

public class CarGurusSellMyCarPage {
	private WebDriver driver;

	public CarGurusSellMyCarPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@title='Sell My Car']")
	public WebElement sellMyCar;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
	public WebElement sellYourCar;
	
	@FindBy(name = "carDescription.postalCode")
	public WebElement zipCode;
	
	
	@FindBy(name = "carpicker.year")
	public WebElement year;
	
	@FindBy(name = "carpicker.model")
	public WebElement model;
	
	@FindBy(name = "carpicker.make")
	public WebElement make;
	
	@FindBy(name = "carpicker.trim")
	public WebElement trim;
	
	@FindBy(name = "carDescription.transmission")
	public WebElement transmission;
	
	
	@FindBy(name = "carDescription.engineId")
	public WebElement engineId;
	
	
	@FindBy(name = "carDescription.mileage")
	public WebElement mileage;
	
	
	@FindBy(name = "exteriorColor")
	public WebElement exteriorColor;
	
	@FindBy(name = "interiorColor")
	public WebElement interiorColor;
	
	@FindBy(xpath = "(//div[@class='icon-select'])[1]")
	public WebElement IamStillPaying;
	
	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement description;
	
	
	@FindBy(name = "firstName")
	public WebElement firstName;
	
	@FindBy(name = "lastName")
	public WebElement lastName;
	
	@FindBy(xpath = "//div[@for = 'pictureFile']")
	public WebElement chooseFile;
	
	
	@FindBy(xpath = "(//div[@class='icon-select'])[2]")
	public WebElement IamOlder18;
	
	@FindBy(xpath = "//button[@class='btn btn-block btn-lg btn-primary']")
	public WebElement signIn;
	
	public void selectDropDown(String visibleText, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	
}
