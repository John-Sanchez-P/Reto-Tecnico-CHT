package co.com.choucair.certification.testjoin.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/testJoin.feature",
        tags = "@historiausuario",
        glue = "co.com.choucair.certification.testjoin.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
