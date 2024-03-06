package stepdefinitions;


import org.testng.Assert;

import constants.Constants;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.HomePageObjects;
import page_model.LoginPageObjects;


public class Login {

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.out.println(Constants.LOGINPAGE);
		Common_Step_Def.driver.get(Constants.LOGINPAGE);
		
	}

	@When("the user enters the login credentials")
	public void the_user_enters_the_login_credentials() {
		LoginPageObjects login = new LoginPageObjects();
		login.enterUsername();
		login.enterPassword();
		login.clickLogin();

	}

	@Then("the user navigates to homepage")
	public void the_user_navigates_to_homepage() {
		System.out.println("login feature home page");
		boolean actualValue = HomePageObjects.getInstance().isSignoutBtnDisplayed();
		Assert.assertTrue(actualValue);
	}


}



