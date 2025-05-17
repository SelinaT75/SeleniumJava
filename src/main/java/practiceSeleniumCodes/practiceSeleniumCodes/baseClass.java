package practiceSeleniumCodes.practiceSeleniumCodes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	WebDriver driver;

	@BeforeMethod

	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void driverTearDown() {
		driver.quit();
	}

}

