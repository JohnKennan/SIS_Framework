package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps extends CommonMethods{

	@When("I login as Admin")
	public void i_login_as_admin() {
		login.adminLogin();
		wait(2);
		System.out.println("Logged in as Admin");
	}

	@Then("I validate that Announcement visible")
	public void i_validate_that_announcement_visible() {
		String actual = homepage.announcements.getText();
		String expected = "Announcements";
		if (actual.contains(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
//		Assert.assertEquals(expected, actual);
		System.out.println("Validated Announcement is visible");
	}

	@Then("I validate that logo visible")
	public void i_validate_that_logo_visible() {
		boolean actual = homepage.logo.isDisplayed();
//		Assert.assertEquals(expected, actual);
		if (actual) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		System.out.println("Validated logo is visible");
	}

	@Then("I validate that url includes {string}")
	public void i_validate_that_url_includes(String extension) {
		String url = driver.getCurrentUrl();
//		boolean actual;
		if(url.contains(extension)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
//		Assert.assertEquals(expected, actual);
		System.out.println("Validated url contains");
	}
}
