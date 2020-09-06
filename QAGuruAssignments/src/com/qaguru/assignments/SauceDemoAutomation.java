package com.qaguru.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 1. Open URL
2. Enter user name.
3. Enter password.
4. Click on Login button.
5. Click on ADD TO CART button of first product.
6. Click on Cart icon from top right corner.
7. Click on CHECKOUT button
8. Enter first name, last name & zip code
9. Click on CONTINUE button
10. Scroll down to bottom in checkout screen.
11. Click on FINISH button
12. Verify THANK YOU FOR YOUR ORDER message display.
 */

public class SauceDemoAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		// 1. Open URL
		driver.get("https://www.saucedemo.com/");
		
		//2. Enter user name.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//3. Enter password.
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//4. Click on Login button.
		driver.findElement(By.id("login-button")).click();
		
		//5. Click on ADD TO CART button of first product.
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		
		//6. Click on Cart icon from top right corner.
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		//7. Click on CHECKOUT button
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	
		
		//8. Enter first name, last name & zip code
		driver.findElement(By.id("first-name")).sendKeys("Nanthana");
		driver.findElement(By.id("last-name")).sendKeys("Thanonklin");
		driver.findElement(By.id("postal-code")).sendKeys("95008");
		
		//9. Click on CONTINUE button
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		//10. Scroll down to bottom in checkout screen.
		//11. Click on FINISH button
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		
		//12. Verify THANK YOU FOR YOUR ORDER message display.
		driver.close();
	}

}
