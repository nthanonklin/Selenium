package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://filebin.net/");
		driver.findElement(By.xpath("//*[@id=\"fileField\"]")).sendKeys("/Users/nthanonklin/Desktop/install.txt ");;

	}

}
