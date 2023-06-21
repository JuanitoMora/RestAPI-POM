package com.sophossolutions.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.stepdefinitions",
        features = "src/test/resources/com.sophossolutions/put_go_rest.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class PutGoRest {
}
