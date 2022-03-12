package co.com.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/retotecnico.feature",
        tags = "@Historia",
        glue = "co.com.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
