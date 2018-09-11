
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber.html",
							"pretty:target/cucumber.json"},
				features="TestDefinition/test.feature",glue={"TestDefinition/stepDefinition"}
					)
public class TestRunner {
	
	private static Logger Log = Logger.getLogger(TestRunner.class);

}