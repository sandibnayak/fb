package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/FbLogIn.feature",
glue= {"com.fb.StepDefination"},
monochrome=true,
plugin= {"html:src/main/resources/com/Reports/HTML/fblogin",
		"json:src/main/resources/com/Reports/JSON/fblogin.json"})
public class TestRunner {

}
