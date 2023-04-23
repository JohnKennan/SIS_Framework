package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;


public class UserPageSteps extends CommonMethods {

	@Then("Validate Student Name")
	public void validate_student_name() {
		String expected = ConfigsReader.getProperty("newStudentFirstName") + " " + ConfigsReader.getProperty("newStudentLastName");
		String actual = userPage.studentName.getText().toString();
		wait(1);
//		if (actual.equals(expected)) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test Failed");
//		}
//		System.out.println("Test is Passed!");
		
		Assert.assertEquals(expected, actual);
		System.out.println("Student Name Matches");
		wait(2);
	}
	
	@Then("Validate User Name")
	public void validate_user_name() {
		String expected = ConfigsReader.getProperty("newStudentUserName");
		String actual = userPage.userName.getText().toString();
		wait(1);
		Assert.assertEquals(expected, actual);
		System.out.println("User Name Matches");
		wait(2);
		System.out.println("Test is Passed!");
	}
	
	
	
}
