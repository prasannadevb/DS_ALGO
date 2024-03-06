package page_model;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class HomePageObjects {

	private static HomePageObjects homePageObjects;
	
	private HomePageObjects() {};
	
	public static HomePageObjects getInstance() {
		if(homePageObjects==null) {
			homePageObjects= new HomePageObjects();
		}
		return homePageObjects;
		
	}
	
	By signoutBtn = By.linkText("Sign out");
	By arraygetStartedBtn   = By.xpath("//a[@href='array']");
	
	
	
	public boolean isSignoutBtnDisplayed() {
		
	boolean isSignoutBtnDisplayed = Common_Step_Def.driver.findElement(signoutBtn).isDisplayed();
	return isSignoutBtnDisplayed;
	}
	
	public void clickGetStarted() throws InterruptedException {
		
		System.out.println("clicking the get started button");
		Thread.sleep(5000);
		System.out.println("Wait over");
		Common_Step_Def.driver.findElement(arraygetStartedBtn).click();
	}
}
