package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
/**
 * 
 * https://mvnrepository.com/artifact/org.seleniumhq.selenium/htmlunit-driver
 */

public class headlessbrowser {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://facebook.com/");
		System.out.println("The title of the page is: "+ driver.getTitle());
		driver.close();		
	}

}
