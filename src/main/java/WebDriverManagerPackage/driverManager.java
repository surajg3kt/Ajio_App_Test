package WebDriverManagerPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager 
{
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return threadLocal.get();
	}
	public static void setDriver(WebDriver driver) {
		threadLocal.set(driver);
	}
	public static void initDriver(String browser) {
		if(getDriver()==null) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				setDriver(new ChromeDriver());
			}else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				setDriver(new FirefoxDriver());
			}else {
				throw new RuntimeException("Invalid browser entry :"+browser);
			}
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			getDriver().get("https://www.ajio.com");
		}
	}
	public static void closeDriver() {
		if (getDriver()!=null) {
			getDriver().close();
			threadLocal.remove();
		}
	}
}