package HooksPackage;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import WebDriverManagerPackage.driverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks 
{
  public static   WebDriver driver;
	
	public static Properties prop;
	
	@Before
	public void launchApplication()
	{
		driverManager.initDriver("chrome");
		
	}
	
	@After(order = 1)
	public void tear()
	{
		driverManager.closeDriver();
	}
}