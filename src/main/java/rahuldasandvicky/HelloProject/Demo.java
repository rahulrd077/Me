package rahuldasandvicky.HelloProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static ChromeDriver driver;
	
	public static void  main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver for version 74\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	}
}
