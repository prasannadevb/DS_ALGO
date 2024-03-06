package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.HomePageObjects;
import page_model.StartpagePageObjects;

public class Startpage {
	
	

	@Given("the user is on the get started page")
	public void the_user_is_on_the_get_started_page() {
		 Common_Step_Def.driver.get(Constants.URL);
	}
    
	@When("the user clicks the get start button")
	public void the_user_clicks_the_get_start_button() throws InterruptedException {
		StartpagePageObjects.getInstance().algo_Startpage();

	}
	@Then("the user should see the homepage")
	public void the_user_should_see_the_homepage() {
		
		 String currentUrl = Common_Step_Def.driver.getCurrentUrl(); String
		 expectedUrl ="https://dsportalapp.herokuapp.com/home";
		 Assert.assertEquals(currentUrl, expectedUrl);
		 System.out.println("User is on the hompage");
		
	}
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		//Common_Step_Def.driver.get("https://dsportalapp.herokuapp.com/home");
	}

	

	@When("the user clicks on the get started button in data structures introduction")
	public void the_user_clicks_on_the_get_started_button_in_data_structures_introduction() {
		

	}

	@Then("you are not logged in statement is diplayed")
	public void you_are_not_logged_in_statement_is_diplayed() {
		/*
		 * String msg = Common_Step_Def.driver.findElement(alertMsg).getText();
		 * System.out.println(msg);
		 */
	}

	

}