package runners1;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//@Test
@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/feature1/techfios.feature",
	glue="steps",
	tags="@Scinerio2",
	monochrome=true,
	dryRun=false,
	plugin= {
			"pretty",
			"html:target/reports/cucumber.html",
			"json:target/reports/cucumber.jason"
	}
		
		
		
		)


public class LoginRunner1 {

}
