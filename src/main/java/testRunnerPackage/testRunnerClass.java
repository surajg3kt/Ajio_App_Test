package testRunnerPackage;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"src/test/resources/features/Search.feature"},
glue = {"stepDefinitions","HooksPackage"},
plugin = {"pretty","html:target/HtMlReport.html"},
tags="@search")

public class testRunnerClass extends AbstractTestNGCucumberTests
{

}
