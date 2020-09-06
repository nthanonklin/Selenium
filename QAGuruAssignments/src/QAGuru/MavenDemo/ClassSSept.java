package QAGuru.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;




public class ClassSSept {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserInt() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		// 1. Open URL
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}
	
	

}
