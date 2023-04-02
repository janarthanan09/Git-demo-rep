package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lib\\.eclipse\\Cucumberprojecttest\\src\\test\\resources\\Features",
glue = "org.stepdefinition", dryRun = false)
public class TestRunnerr {

}
