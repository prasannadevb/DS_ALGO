package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class LoginPageObjects {

	private static LoginPageObjects loginPageObjects;

	private LoginPageObjects() {};

	public static LoginPageObjects getInstance() {

		if(loginPageObjects==null) {
			loginPageObjects= new LoginPageObjects();
		}
		return loginPageObjects;

	}
	
    By signinLink 		= By.xpath("//a[text()='Sign in']"); 
	
    By loginbtn         = By.xpath("//input[@value='Login']");
	By usernameTextbox  = By.xpath("//input[@name='username']");
	By passwordTextbox  = By.xpath("//input[@name='password']");
	
	By errorMsg 		= By.xpath("//div[@class='alert alert-primary']");
	By signoutbtn 		= By.xpath("//a[text()='Sign out']");
	
	
	public void clickSignin() {
		Common_Step_Def.driver.findElement(signinLink).click();
	}
	
	public  void enterUsername () {
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);
		
	}
	public  void enterPassword () {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);
		
	}
	public  void clickLogin() {
		Common_Step_Def.driver.findElement(loginbtn).click();
		
	}
	public void clearUsername() {
		Common_Step_Def.driver.findElement(usernameTextbox).clear();
	}
	public void clearPassword() {
		Common_Step_Def.driver.findElement(passwordTextbox).clear();
	}
	public void invalidUsername() {
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("hello");
	}
	public void invalidPassword() {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys("hi123");
	}
	public String getAlert() {
		return Common_Step_Def.driver.findElement(errorMsg).getText();


	}
	
}