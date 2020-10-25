package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/FeturesFile/LoginParameterisation.feature" ,
		glue="StepDefinations" ,
		format={"pretty","html:test-output"},
		dryRun=false,
		tags ="@toRun"
		
		)


public class TestRunner {

}
