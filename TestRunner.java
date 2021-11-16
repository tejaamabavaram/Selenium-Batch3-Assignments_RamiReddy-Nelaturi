package seleniumAssignments;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"stepDefinition"}
		)
public class TestRunner {

}
