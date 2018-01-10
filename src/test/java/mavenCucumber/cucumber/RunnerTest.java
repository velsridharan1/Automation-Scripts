package mavenCucumber.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource",plugin = { "html:target/cucumber-html-report",
		         "pretty:target/cucumber-pretty.txt","json:target/cucumber.json",
		         "junit:target/cucumber-results.xml" })
public class RunnerTest {

}
