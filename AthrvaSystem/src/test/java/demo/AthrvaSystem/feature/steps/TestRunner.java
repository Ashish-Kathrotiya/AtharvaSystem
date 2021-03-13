package demo.AthrvaSystem.feature.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/test.feature", glue = {
		"demo.AthrvaSystem.feature.steps"})

public class TestRunner {
}