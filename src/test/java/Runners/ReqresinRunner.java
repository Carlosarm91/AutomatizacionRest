package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src\\test\\resources\\features\\reqresin.feature",
    glue = "StepDefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ReqresinRunner {}
