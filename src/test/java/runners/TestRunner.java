package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        dryRun = false,
        tags = "@scenario",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}

