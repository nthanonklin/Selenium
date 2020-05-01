package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nthanonk");;
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("helloworld").perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//ENTER and RETURN will perform same action
		action.sendKeys(Keys.RETURN).perform();

	}

}
