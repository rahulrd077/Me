package rahuldasandvicky.HelloProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver for version 74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		
		Actions action = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(@class,'titreck')]"));
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		action.moveToElement(ele).clickAndHold().build().perform();
		
		
		
		
	}

}
