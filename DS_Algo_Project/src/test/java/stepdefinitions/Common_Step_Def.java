package stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utilities.Common_Utils;

public class Common_Step_Def {
	
	public static WebDriver driver;
	@BeforeAll
	public static void launchBrowser() {
		Common_Utils common_Utils = new Common_Utils();
		common_Utils.loadProperties();
		if(driver==null) {
			  driver= new ChromeDriver(); 
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	}
}
	