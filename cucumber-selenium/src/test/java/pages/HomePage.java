package pages;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getDriver();
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "q")
	 public WebElement searchBox;
	
	
	public void scroolDownThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	@FindBy(how = How.XPATH, using = "(//li//span[@class= 'slnk '])[3]")
	 public WebElement careers;
   
	@FindBy(how = How.XPATH, using = "//button[@class = 'nwh-main-cta']")
	 public WebElement findJob;
	
	
	public void handleWindow() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}
	
	public void untilClickable(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
    
	
	
	 
	
	 
}
