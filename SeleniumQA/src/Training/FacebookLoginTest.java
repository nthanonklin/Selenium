package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		System.out.println("The title of the page is: " + driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("nthanonk");
		driver.findElement(By.id("pass")).sendKeys("password");
		//click on login to login to Facebook.com
		driver.findElement(By.id("loginbutton")).click();	
	}

}
