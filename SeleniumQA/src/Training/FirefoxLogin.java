package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogin {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "/Users/nthanonklin/eclipse-workspace/geckodriver ");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		System.out.println("The title of the page is " + driver.getTitle());
		driver.close();
				
	}
}
