package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HooksPackage.hooks;
import WebDriverManagerPackage.driverManager;
import io.cucumber.java.en.*;

public class Search 
{
	public static WebDriver driver=driverManager.getDriver();
	public static Properties prop=hooks.prop;
	
	@Given("Navigate to homepage")
	public void navigateToHomePage() 
	{
	    
	}
	@When("user enter data into search field")
	public void user_enter_data_into_search_field() 
	{
	    driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("shoes");
	}

	@And("click on search icon")
	public void cick_on_search_icon() 
	{
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("related data should be displayed")
	public void related_data_should_be_displayed() 
	{
	    WebElement heading = driver.findElement(By.xpath("//div[@class='header2']"));
	    System.out.println(heading.getText());
	}
	
	@When("user enter data and click on search option")
	public void data_into_searchfield() 
	{
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("shoes");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("user select Women section")
	public void user_select_Women_section() 
	{
      driver.findElement(By.xpath("//input[@id='Women']/../label")).click();
	}
	
	@When("Women related data should be displayed")
	public void Women_related_data_should_be_displayed() 
	{
     WebElement filter_name=driver.findElement(By.xpath("//div[@class='fnl-plp-afliter']/span"));
     System.out.println(filter_name.getText());
	}

}
