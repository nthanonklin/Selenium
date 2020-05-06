package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver rdriver) {
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hdr-account")
	WebElement account;
	
	@FindBy(id="WC_AccountDisplay_FormInput_logonId_In_Logon_1")
	WebElement Email;
	
	@FindBy(id="WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")
	WebElement pwd;
	
	@FindBy(id="WC_AccountDisplay_links_2")
	WebElement login;
	
	public void ClickAccount() throws InterruptedException {
		account.click();
		Thread.sleep(1000);
	}
	
	public void setemail(String email) {
		Email.sendKeys(email);
	}
	public void setpasswd(String password) {
		pwd.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}	
	public void login(String email,String password) {
		Email.sendKeys(email);
		pwd.sendKeys(password);
		login.click();	
	}
	
}
