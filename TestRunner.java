package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "stepDefinition",
        plugin = {"pretty"},
        monochrome = true
)

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/java/feature/login.feature",
//        glue="src/test/java/stepDefinition/loginStep.java"
//)

public class TestRunner {


}
