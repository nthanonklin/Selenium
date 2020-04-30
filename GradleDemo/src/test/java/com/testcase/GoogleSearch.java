package com.testcase;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
  @Test
  public static void main(String[]args)throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	 WebDriver driver = new ChromeDriver();
	 String url = "https://google.com/";
	 
	 driver.get(url);
	 WebElement find = driver.findElement(By.name("q"));
	 find.sendKeys("Covid-19");
	 Thread.sleep(2000);
	 
	 WebElement click = driver.findElement(By.name("btnK"));
	 click.submit();
	 Thread.sleep(3000);
	 
	 List<WebElement> list  = driver.findElements(By.tagName("a"));
	 
	 int linkCount = list.size();
	 System.out.println("Total number of links count on webpage = " + linkCount);
	 
	 driver.close();
	 
  }
}
