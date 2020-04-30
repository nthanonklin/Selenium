package com.maven.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "/Users/nthanonk/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

}
