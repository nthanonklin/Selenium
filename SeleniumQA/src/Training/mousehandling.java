package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://discover.com/");
		
		WebElement onlineBanking = driver.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[2]/a/div/span[1]"));
		WebElement checkingAccount = driver.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[2]/ul/li[2]/a"));
		
		//Under online banking, click on checking account
		//https://www.discover.com/online-banking/checking/?ICMPGN=PUB_HNAV_BANK_CHECKING
		Actions action = new Actions(driver);
				action.moveToElement(onlineBanking);
				action.moveToElement(checkingAccount).click().build().perform();		
	}

}
