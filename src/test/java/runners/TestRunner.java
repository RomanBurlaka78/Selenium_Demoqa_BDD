package runners;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {


}
