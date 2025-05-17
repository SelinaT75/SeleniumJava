package practiceSeleniumCodes.practiceSeleniumCodes;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestLoginPage extends baseClass{
	
	@Test
	
	public void logIn() {
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
	}
	

}
