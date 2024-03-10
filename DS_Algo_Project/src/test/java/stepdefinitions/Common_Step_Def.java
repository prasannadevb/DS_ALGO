package stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import page_model.ArrayPageObjects;
import utilities.Common_Utils;

public class Common_Step_Def {
	
	private static Common_Step_Def common_Step_Def;
public Common_Step_Def() {};
	
	public static Common_Step_Def getInstance() {
		if(common_Step_Def==null) {
			common_Step_Def= new Common_Step_Def();
		}
		return common_Step_Def;
		
	}
	public  WebDriver driver;
	
	
	
	public  Common_Step_Def getCommon_Step_Def() {
		return common_Step_Def;
	}

	public WebDriver getDriver() {
		return driver;
	}

	@Before
	public  WebDriver launchBrowser() {
		Common_Utils common_Utils = new Common_Utils();
		common_Utils.loadProperties();
		
			  driver= new ChromeDriver(); 
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	@After
	public  void quitBrowser() {
		driver.close();
		
	}
}
	