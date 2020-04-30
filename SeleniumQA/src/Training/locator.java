package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("nthanonklin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("candy");
		
		
		// xPath
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Nanthana");	
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//xPath partialLink
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		//xPath with and condition
		driver.findElement(By.xpath("//*[@type='text' and @name='lastname']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("4156761766");
		
	}

}
