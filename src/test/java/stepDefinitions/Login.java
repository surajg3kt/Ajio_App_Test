package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import HooksPackage.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	public  WebDriver driver=hooks.driver;
	public Properties prop=hooks.prop;
	
	@When("Open the browser and user enter the url")
	public void open_app() throws IOException
	{
	   driver.get(prop.getProperty("url"));
	}


	@Then("homepage should be displayed")
	public void homepage_should_be_displayed() 
	{
	   System.out.println(driver.getTitle());
	}

}
