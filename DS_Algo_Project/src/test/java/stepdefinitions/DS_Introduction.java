package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import app_hooks.App_Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.DS_IntroductionPageObjects;

import utilities.ExcelReader;

public class DS_Introduction {
	
	
		
		public static WebDriver driver;
		
		By signinLink = By.xpath("//a[text()='Sign in']");
		By usernameTextbox = By.xpath("//input[@name='username']");
		By passwordTextbox =By.xpath("//input[@name='password']");
		By loginbtn = By.xpath("//input[@value='Login']");
		
		String URL = "https://dsportalapp.herokuapp.com/login";
		
		By Getstarted_btn = By.xpath("//a[@href='data-structures-introduction']");
		By Time_cmp = By.xpath("//a[@href='time-complexity']");
		By try_here = By.xpath("//a[@class='btn btn-info']");
		By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		By run = By.xpath("//button[text() = \"Run\"]");
		By practice_qa = By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
		By empty_pp = By.xpath("//html[@lang = \"en\"]");
		By signoutbtn = By.xpath("//a[text()='Sign out']");
		
		@Given("I navigate to the login page")
		public void i_navigate_to_the_login_page() {
			
			 App_Hooks.getInstance().getDriver().get(URL);
			 
		}
	   @When("I submit username and password")
		public void i_submit_username_and_password() {
		   
			App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys("quantum@testers");
			App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys("numpyninja1234");
			}

		@Then("I should be logged in")
		public void i_should_be_logged_in() {
			
			App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
		   
		}


		@Given("the user is on the DS Algo Home Page")
		public void the_user_is_on_the_ds_algo_home_page() {
		   
			//App_Hooks.getInstance().getDriver().get(URL);
			
		}

		@When("the user clicks  Get Started button below the Data structures-Introduction")
		public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
		    
			 App_Hooks.getInstance().getDriver().findElement(Getstarted_btn).click();
		}

		@Then("The user should land in {string} page")
		public void the_user_should_land_in_page(String string) {
			String currentURL =App_Hooks.getInstance().getDriver().getCurrentUrl();
			   String expectedURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
			   Assert.assertEquals(currentURL, expectedURL);
			   System.out.println("User is on the signin page");
		   }

		@When("the user clicks Time Complexity link")
		public void the_user_clicks_time_complexity_link() throws InterruptedException {
		    
			 App_Hooks.getInstance().getDriver().findElement(Time_cmp ).click();
			
		}

		@Then("the user should be redirected to \"Time Complexity\"TC page")
		public void the_user_should_be_redirected_to_time_complexity_tc_page() {
		    
		}

		@When("The user clicks Try Here  button of Time Complexity page")
		public void the_user_clicks_try_here_button_of_time_complexity_page() {
			
			
			 App_Hooks.getInstance().getDriver().findElement(try_here).click();
		}

		@Then("The user should be redirected to a page having an Python Editor with a url {string}")
		public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
		  
		}

		@Given("The user is on the Python Editor page")
		public void the_user_is_on_the_python_editor_page() {
		    
			
		}

//		@When("the user writes invalid code with {string} and rownumber<RowNumber>")
//		public void the_user_writes_invalid_code_with_print_hai_and_expected_output(String sheetName , int rowNumber) throws InvalidFormatException, IOException {
//			ExcelReader reader = new ExcelReader();
//			String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
//			System.out.println(excelPath);
//			List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
//			String text = testdata.get(rowNumber).get("Input");
//			DS_IntroductionPageObjects.getInstance().invalidCode(text);
//			
//		}

		
		@When("user adds invalid code with {string} and rownumber {int}")
		public void the_user_writes_invalid_code_with_and_rownumber_row_number(String sheetName,Integer rowNumber) throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();
			String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
			System.out.println(excelPath);
			List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
			String text = testdata.get(rowNumber).get("Input");
			DS_IntroductionPageObjects.getInstance().invalidCode(text);
		}
		
		
		
		@When("Click the Run Button")
		public void click_the_run_button() {
			
			App_Hooks.getInstance().getDriver().findElement(run).click();
		    
		}

		@Then("The user should able to see an error message in alert window")
		public void the_user_should_able_to_see_an_error_message_in_alert_window() throws InterruptedException {
			
			DS_IntroductionPageObjects.getInstance().runBtn();
			try {
				//Thread.sleep(5000);
												
				Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
				String actualErrorMessage = alert.getText();
				System.out.println(actualErrorMessage);
				Assert.assertEquals(actualErrorMessage, "NameError: name 'hello' is not defined on line 1");
				Thread.sleep(5000);
				alert.accept();
			}catch(UnhandledAlertException ex) {
				ex.printStackTrace();
			}
			
		}

		@When("user clicks get started on DS_introduction")
		public void user_clicks_get_started_on_ds_introduction() {
		    
			 App_Hooks.getInstance().getDriver().findElement(Getstarted_btn).click();
		}


		@When("user adds valid python code with {string} and rownumber {int}")
		public void user_writes_valid_python_code_with_print_and_expected_output(String sheetName , Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();
			String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
			System.out.println(excelPath);
			List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
			String text = testdata.get(rowNumber).get("Input");
			DS_IntroductionPageObjects.getInstance().validCode(text);
			}

		
		@When("Click the  python page run Button")
		public void click_the_python_page_run_button() throws InterruptedException {
			
			App_Hooks.getInstance().getDriver().findElement(run).click();
			//Thread.sleep(10000);
		}

		@Then("The user should able to see output in the console")
		public void the_user_should_able_to_see_output_in_the_console() {
			 
			System.out.println("print hello");
		   
		}

		@Given("The user is on the Time Complexity Data Structure Home Page")
		public void the_user_is_on_the_time_complexity_data_structure_home_page() {
			
			App_Hooks.getInstance().getDriver().findElement(Getstarted_btn).click();
			App_Hooks.getInstance().getDriver().findElement(Time_cmp ).click();
		}

		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_link() {
			
			App_Hooks.getInstance().getDriver().findElement(practice_qa ).click();
		}

		@When("the user will land on the practice question page")
		public void the_user_will_land_on_the_practice_question_page() {
		   
		}

		@Then("The user doesn't find any practice problems and the page is blank")
		public void the_user_doesn_t_find_any_practice_problems_and_the_page_is_blank() {
			 
		    App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
		}


		

		

	}

