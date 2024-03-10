package app_hooks;

import org.openqa.selenium.WebDriver;
import constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import stepdefinitions.Common_Step_Def;
import utilities.Common_Utils;

public class App_Hooks {

	private static App_Hooks appHooks;
	 private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
	 
	 public static App_Hooks getInstance() {
			if(appHooks==null) {
				appHooks= new App_Hooks();
			}
			return appHooks;

		}
	 
	 public WebDriver getDriver() {
		    return drivers.get();
		  }
	 
	 @Before
	  public void setUp() {
	    WebDriver driver = Driver_Manager.getInstance().createDriver(Constants.BROWSER);
	    drivers.set(driver);
	    driver.manage().window().maximize();	  
	    Common_Step_Def.getInstance().login();
	  }

	  @After
	  public void tearDown() {
	    getDriver().quit();
	    drivers.remove();
	  }
	  
	  @BeforeAll
	  public static void beforeAll() {
		  Common_Utils.getInstance().loadProperties();
		  System.out.println(System.currentTimeMillis());
	  }
	  
	  @AfterAll
	  public static void afterAll() {
		  System.out.println(System.currentTimeMillis());
	  }
	
}
