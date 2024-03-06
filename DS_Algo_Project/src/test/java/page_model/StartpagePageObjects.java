package page_model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Constants;
import stepdefinitions.Common_Step_Def;
import utilities.Logger_Load;

public class StartpagePageObjects {

	private WebDriver driver;
	// String URL = "https://dsportalapp.herokuapp.com";

	By GetStartedBtn = By.xpath("//button[text()=‘Get Started’]");

	boolean status = driver.findElement(GetStartedBtn).isDisplayed();
	{
		if (status) {
			Logger_Load.info("Successfully logged in");
		}

	}

	private static StartpagePageObjects startPageObjects;

	private StartpagePageObjects() {
	};

	public static StartpagePageObjects getInstance() {
		if (startPageObjects == null) {
			startPageObjects = new StartpagePageObjects();
		}
		return startPageObjects;

	}

	
	/*
	 * String HomepageURL = "https://dsportalapp.herokuapp.com/home";
	 * 
	 * public StartpagePageObjects(WebDriver driver) {
	 * 
	 * this.driver=driver;
	 * 
	 * }
	 */

	public void algo_Startpage() {

		// driver = new ChromeDriver();
		// driver.get(URL);
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Common_Step_Def.driver.findElement(GetStartedBtn).click();

	}
}
