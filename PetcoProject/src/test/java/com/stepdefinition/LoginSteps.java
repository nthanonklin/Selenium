package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.baseclass.library;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends library{
	LoginPage lpage;
	
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws IOException  {
		launchApplication();
	}
	
	@When("^Petco page is opened$")
	public void petco_page_is_opened() {
		String title = getTitle();
		System.out.println(title);
		Assert.assertEquals("Pet Supplies, Pet Food, and Pet Products | Petco", title);
	}

	@Then("^Go to Account and Click signin button$")
	public void go_to_Account_and_click_signin_button() throws InterruptedException {
		lpage = new LoginPage(driver);
		lpage.ClickAccount(); 
	}

	@Then("^Login page is displayed$")
	public void login_page_is_displayed()  {
		
		String title = getTitle();
		System.out.println(title);
		Assert.assertEquals("Sign in", title);  
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String email, String password) {
		lpage.setemail(email);
		lpage.setpasswd(password);    
	}
	
	@Then("^Click the login$")
	public void click_the_login(){
		lpage.clicklogin();
	    
	}
	
	@Then("^Take screenshots and quit browser$")
	public void take_screenshots_and_quit_browser() throws IOException  {
		screenShot();
		//quit();
	    
	}

}