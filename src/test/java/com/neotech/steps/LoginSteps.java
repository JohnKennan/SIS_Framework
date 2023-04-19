package com.neotech.steps;

import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginSteps extends CommonMethods {


	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.logInButton);
	}

	@When("I select the academic year")
	public void i_select_the_academic_year() {
		Select sel = new Select(login.academicYear);
		sel.selectByVisibleText(ConfigsReader.getProperty("academicYear"));
	}
	
	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.password, ConfigsReader.getProperty("wrongPassword"));
	}
	
	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "TEST ACADEMY";
		String actual = homepage.dashboardHeader.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		System.out.println("Test is Passed!");
	}



	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		
		login.adminLogin();
	}
}
