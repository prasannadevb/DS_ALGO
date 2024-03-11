package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features = {"src/test/resources/features"},
				//tags = "@array and @tree",
		plugin = {"pretty", "html:target/result.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue= {"stepdefinitions","page_model","app_hooks"},
		dryRun = false
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

	
	@Override
	@DataProvider(parallel = true) public Object[][] scenarios() {

		return super.scenarios(); }

}
