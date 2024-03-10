
package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = {"src/test/resources/features"},
		plugin = {"pretty", "html:target/result.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue= {"stepdefinitions","page_model"}
		)

//location of step definition files

public class JunitRunner extends AbstractTestNGCucumberTests {

	@Override

	@DataProvider(parallel = false) public Object[][] scenarios() {

		return super.scenarios(); }


}


