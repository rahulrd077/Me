package rahuldasandvicky.HelloProject;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyword {
static ChromeDriver driver ;
static FileInputStream file;
static Properties prop;
public void openbrowser() throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver for version 74\\chromedriver.exe");
	driver = new ChromeDriver();
	file = new FileInputStream ("D:\\Eclipse Workspace\\HelloProject\\objectrepository.properties");
	prop = new Properties();
	prop.load(file);

}

public void navigate (String Data){
	
	driver.get(Data);
	
}
public void inputuser(String Data, String objectName) {
	
	driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(Data);
}

public void inputpass(String Data, String objectName) {
	
	driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(Data);
}
 public void login(String objectName) throws Exception{
		
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
	}

 public void sel(String objectName) throws Exception{
	 
	 	 
	 driver.switchTo().frame("mainpanel");
	 
	 Actions ac = new Actions(driver);
	 
		WebElement ele =  driver.findElement(By.xpath(prop.getProperty(objectName)));
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
		 ac.moveToElement(ele).build().perform();
		 
 }
		 
		 public void sel2(String objectName) throws Exception{
			 
			 driver.switchTo().frame("mainpanel");
		
			 
			
			 
				Select sel= new Select( driver.findElement(By.xpath(prop.getProperty(objectName))));
				 
				 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				 
				sel.selectByIndex(7);
			 
			 
		 }
		 
		 
		
		
		 
		 
		
		
	}
