package steps;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages1.Changingcolour;
import pages1.TestBase;

public class colourpage extends TestBase{
	Changingcolour changingcolour;
	
	 @Given ("Set SkyBlue Background button exists$")
	 public void Set_SkyBlue_Background_button_exists() {
		 initDriver();	
		 driver.get("https://techfios.com/test/106/");	
			
	 }
	 @When("I click on the button")
	 public void i_click_on_the_button() {
	changingcolour =PageFactory.initElements(driver, Changingcolour.class);	   
	changingcolour.clickonbutton();
	     
	 }

	@Then("the background color will change to sky blue")
	 public void the_background_color_will_change_to_sky_blue() {
	    
	 }

	@Given("User Set SkyWhite Background button exists")
	public void user_Set_SkyWhite_Background_button_exists() {
		 initDriver();	
		 driver.get("https://techfios.com/test/106/");	
			
	 }
	@When("User click on the button2")
	public void user_click_on_the_button2() {
		 changingcolour =PageFactory.initElements(driver, Changingcolour.class);	   
	changingcolour.clickonbutton2();
	     
	 }

	@Then("the background color will change to white")
	 public void the_background_color_will_change_to_white() {
		//Assert.assertEquals("pagefoundwhite", changingcolour.getClass());
	 }
}
