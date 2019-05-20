package rahuldasandvicky.HelloProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExecuteLeadTest {
	
static	WebDriver driver ;
	
	@Test
	
	@Parameters("Browser")
	
	
	public void verifyPageTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Geckodriver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			
		}
		
	}
}
