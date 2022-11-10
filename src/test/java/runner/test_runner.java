package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions (features= {"src/test/resources/loginn/loginn2.feature"},glue={"definition"},tags="@NegativeTesting",plugin={"html:reports/myreports.html"})
	public class test_runner extends AbstractTestNGCucumberTests{
		
		
	}