package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		tags="@arrayhome",
		features = {"src/test/resources/features"},
		plugin = {"pretty", "html:target/result.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue= {"stepdefinitions","page_model"}
		)

public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	

	//location of step definition files

	@Override

		@DataProvider(parallel = true) public Object[][] scenarios() {

			return super.scenarios(); }

}

