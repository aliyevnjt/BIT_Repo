package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pages.HomePage;

public class CarGurusSearchForJob {
	
	HomePage hp = new HomePage();
	
	
	@Then("I click on careers")
	public void i_click_on_careers() throws InterruptedException {
	    hp.scroolDownThePage();
	    hp.careers.click();
	    hp.handleWindow();
	    //Thread.sleep(3000);
	    hp.untilClickable(hp.findJob);
	    hp.findJob.click();
	    
	    
	     
	}
}
