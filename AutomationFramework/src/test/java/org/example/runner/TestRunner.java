package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"D:\\Automation\\Automation-Training\\AutomationFramework\\src\\main\\java\\Features\\signup.feature"},
        glue = {"stepDefinition"},
        plugin = {"pretty","html:target/cucumber-reports/valid-login.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
