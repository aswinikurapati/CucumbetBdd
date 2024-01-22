package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\java\\feature\\google.feature",
    glue = "StepDefinition", // Corrected the package path for step definitions
    stepNotifications = true,
    snippets = SnippetType.CAMELCASE,
    tags = "@smoke"
    )
public class Rungoogle {

}