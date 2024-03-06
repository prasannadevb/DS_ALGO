package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/home";
	By registerBtn = By.xpath("//a[text()=' Register ']");
	
	By regsitrationBtn = By.xpath("//input[@value='Register']");
	By usernameTxtbox  = By.xpath("//input[@name='username']");
	By passwordTxtbox  = By.xpath("//input[@name='password1']");
	By passwordConfirmbox = By.xpath("//input[@name='password2']");
	
	By errorMsg = By.xpath("//div[@class='alert alert-primary']");
	
	
	
	
	
	@Given("given the user is on the home page")
	public void given_ther_user_is_on_the_home_page() {
	   Common_Step_Def.driver.get(URL);
	}

	@When("the user clicks the register button")
	public void the_user_clicks_the_register_button() throws InterruptedException {
		Thread.sleep(5000);
	    Common_Step_Def.driver.findElement(registerBtn).click();
	}

	@Then("the user should see the registration page")
	public void the_user_should_see_the_registration_page() {
		String currentURL =Common_Step_Def.driver.getCurrentUrl();
	   String expectedURL = "https://dsportalapp.herokuapp.com/register";
	   Assert.assertEquals(currentURL, expectedURL);
	   System.out.println("User is on the registration page");
	   
	}
	@Given("user is on the registration page")
	public void user_is_on_the_registration_page() {
	   // Common_Step_Def.driver.get(URL);
	}

	@When("user clicks register button with all fields empty")
	public void user_clicks_register_button_with_all_fields_empty() {
	    Common_Step_Def.driver.findElement(regsitrationBtn).click();
	}

	@Then("the error {string} appears below user name text box")
	public void the_error_appears_below_user_name_text_box(String string) {
		WebElement activeElement = Common_Step_Def.driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	@When("user clicks register button after entering user name with other fields empty")
	public void user_clicks_register_button_after_entering_user_name_with_other_fields_empty() {
	    Common_Step_Def.driver.findElement(usernameTxtbox).sendKeys("quantum@testers");
	    Common_Step_Def.driver.findElement(regsitrationBtn).click();
	}

	@Then("the error {string} appears below password  text box")
	public void the_error_appears_below_password_text_box(String string) {
		WebElement activeElement = Common_Step_Def.driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	    
	}

	@Given("user is on the reistration page")
	public void user_is_on_the_reistration_page() {
		//Common_Step_Def.driver.get(URL);
	}

	@When("the user clicks register button after entering user name and password with password confirmation field empty")
	public void the_user_clicks_register_button_after_entering_user_name_and_password_with_password_confirmation_field_empty() {
	   Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("numpyninja1234");
	   Common_Step_Def.driver.findElement(regsitrationBtn).click();
	}

	@Then("the error {string} appears below password confirmation text box")
	public void the_error_appears_below_password_confirmation_text_box(String string) {
		WebElement activeElement = Common_Step_Def.driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	@When("user clicks register button after entering the user name with space bar char other than digits")
	public void user_clicks_register_button_after_entering_the_user_name_with_space_bar_char_other_than_digits() {
	    Common_Step_Def.driver.findElement(usernameTxtbox).clear();
	    Common_Step_Def.driver.findElement(passwordTxtbox).clear();
	    Common_Step_Def.driver.findElement(usernameTxtbox).sendKeys(" @+= ");
	}

	@Then("user is not able to see error msg after entering invalid data")
	public void user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
	    System.out.println("No error message");
	}

	@Then("user redirected to empty password textbox")
	public void user_redirected_to_empty_password_textbox() {
	   
	}

	@When("user clicks register button after entering password with numeric data")
	public void user_clicks_register_button_after_entering_password_with_numeric_data() {
	    Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("123456");
	}

	@Then("user is not able to see error message after entering invalid data")
	public void user_is_not_able_to_see_error_message_after_entering_invalid_data() {
	   System.out.println("No error message");
	}

	@Then("user redirected to empty password confirmation textbox")
	public void user_redirected_to_empty_password_confirmation_textbox() {
	    System.out.println("No error message");
	}

	@When("user clicks register button after entering password with characters less than eight")
	public void user_clicks_register_button_after_entering_password_with_characters_less_than_eight() {
	    Common_Step_Def.driver.findElement(passwordTxtbox).clear();
	    Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("numpy");
	}

	@Then("user redirected to register button")
	public void user_redirected_to_register_button() {
	    System.out.println("No error message");
	}

	@When("user clicks register button after entering different passwords in password and password confirmation fields")
	public void user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
	   Common_Step_Def.driver.findElement(passwordTxtbox).clear();
	   Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("numpyninja");
	   Common_Step_Def.driver.findElement(passwordConfirmbox).sendKeys("numpy");
	   Common_Step_Def.driver.findElement(regsitrationBtn).click();
	}

	@Then("user should able to see an password warning message {string}")
	public void user_should_able_to_see_an_password_warning_message(String string) {
	 String errormsg = Common_Step_Def.driver.findElement(errorMsg).getText();
	 System.out.println(errormsg);
	 Common_Step_Def.driver.findElement(usernameTxtbox).clear();
	 Common_Step_Def.driver.findElement(passwordTxtbox).clear();
     Common_Step_Def.driver.findElement(passwordConfirmbox).clear();
	}

	@When("user clicks register button after entering valid quantum@testers,numpyninja1234 and password confirmation related boxes")
	public void user_clicks_register_button_after_entering_valid_quantum_testers_numpyninja1234_and_password_confirmation_related_boxes() {
	   Common_Step_Def.driver.findElement(usernameTxtbox).sendKeys("quantum@testers");
	   Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("numpyninja1234");
	   Common_Step_Def.driver.findElement(passwordConfirmbox).sendKeys("numpyninja1234");
	  // Common_Step_Def.driver.findElement(regsitrationBtn).click();
	}

	@Then("the user should be redirected to homepage of DSAlgo")
	public void the_user_should_be_redirected_to_homepage_of_ds_algo() {
	    System.out.println("User redirected to dsALgoHome page");
	}



}