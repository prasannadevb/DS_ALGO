package page_model;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class RegisterPageObjects {

	private static RegisterPageObjects registerPageObjects;

	private RegisterPageObjects() {};

	public static RegisterPageObjects getInstance() {

		if(registerPageObjects==null) {
			registerPageObjects= new RegisterPageObjects();
		}
		return registerPageObjects;

	}

	By registerLink = By.xpath("//a[text()=' Register ']");
	By regsitrationBtn = By.xpath("//input[@value='Register']");
	By usernameTxtbox  = By.xpath("//input[@name='username']");
By passwordTxtbox  = By.xpath("//input[@name='password1']");
	By passwordConfirmbox = By.xpath("//input[@name='password2']");
	By errorMsg = By.xpath("//div[@class='alert alert-primary']");
	
	public void clickRegisterLink() {
		Common_Step_Def.driver.findElement(registerLink).click();
	}
	
	public  void enterUsername (String username) {
		Common_Step_Def.driver.findElement(usernameTxtbox).sendKeys(username);
		
	}
	public  void enterPassword (String password) {
		Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys(password);
		
	}
	public  void clickRegister() {
		Common_Step_Def.driver.findElement(regsitrationBtn).click();
		
	}
	public void clearUsername() {
		Common_Step_Def.driver.findElement(usernameTxtbox).clear();
	}
	public void clearPassword() {
		Common_Step_Def.driver.findElement(passwordTxtbox).clear();
	}
	public void invalidUsername() {
		Common_Step_Def.driver.findElement(usernameTxtbox).sendKeys("@+= ");
	}
	public void invalidPassword() {
		Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("123");
	}
	public void invalidPassword1() {
		Common_Step_Def.driver.findElement(passwordTxtbox).sendKeys("numpy");
	}
	public void enterinvalidconfirmation() {
		Common_Step_Def.driver.findElement(passwordConfirmbox).sendKeys("numpy90");
		
	}
	public void enterconfirmation(String password) {
		Common_Step_Def.driver.findElement(passwordConfirmbox).sendKeys(password);
		
	}
	public void clearconfirmation() {
		Common_Step_Def.driver.findElement(passwordConfirmbox).clear();
		
	}
	

	public String getAlert() {
		return Common_Step_Def.driver.findElement(errorMsg).getText();

	}
	}
