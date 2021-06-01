package com.wordpress.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report2.html",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "com/wordpress/step_definitions",
        dryRun = false,
        tags =   "@smoke"
        // "@login"
        // "@fillInfo"
        // "@savedProfileDet"
)
public class CukesRunner {
}
