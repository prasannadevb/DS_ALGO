package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class LoginPageObjects {

	//Start of login page elements
	
	 By loginbtn             = By.xpath("//input[@value='Login']");
	 By usernameTextbox      = By.xpath("//input[@name='username']");
	 By passwordTextbox      = By.xpath("//input[@name='password']");
	
	//End of login page elements
	
	//actions: enterUsername, enter password, clickloginbutton
	public  void enterUsername () {
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);
		
	}
	public  void enterPassword () {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);
		
	}
	public  void clickLogin() {
		Common_Step_Def.driver.findElement(loginbtn).click();
		
	}
	
}
