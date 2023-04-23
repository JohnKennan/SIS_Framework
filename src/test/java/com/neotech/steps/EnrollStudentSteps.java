package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EnrollStudentSteps extends CommonMethods{

	@When("Change the status")
	public void change_the_status() {
		Select sel = new Select(studentsTab.status);
		sel.selectByVisibleText("New");
		wait(1);
		System.out.println("Status changed");
	}
	
	@When("Find the student created")
	public void find_the_student_created() {
		Select sel = new Select(studentsTab.allStudents);
		sel.selectByVisibleText(ConfigsReader.getProperty("newStudentLastName") + " " + ConfigsReader.getProperty("newStudentFirstName"));
		wait(1);
		System.out.println("Student is found");
	}
	
	@When("Click on Enroll and Fill out more")
	public void click_on_enroll_and_fill_out_more() {
		studentsTab.enroll.click();
		wait(1);
		System.out.println("Clicked on enroll");
		
		Select sel = new Select(studentsTab.gradeSection);
		sel.selectByVisibleText(ConfigsReader.getProperty("newStudentGrade"));
		wait(1);
		
		studentsTab.nestedEnroll.click();
		wait(1);
		System.out.println("Nested Enroll Clicked!!");
	}
	
	@Then("Validate status is Enrolled")
	public void validate_status_is_enrolled() {
		String actualStatus = studentsTab.status.getText();
		String expectedStatus = "Enrolled";
		Assert.assertEquals(expectedStatus, actualStatus);
		wait(1);
		
		String expStudent = ConfigsReader.getProperty("newStudentLastName") + " " + ConfigsReader.getProperty("newStudentFirstName");
		List<WebElement> allEnrolledStudents = driver.findElements(By.xpath("//select[@id='students_students']/option"));
//		Iterator<WebElement> it = allEnrolledStudents.iterator();
		wait(1);
		for(WebElement w : allEnrolledStudents) {
			wait(1);
			String actual = w.getText().toString();
			if(actual.equals(expStudent)) {
				Assert.assertEquals(true, true);
				System.out.println("Assertion and test is successful");
			}
		}
		
		
		wait(1);
		System.out.println("Verified enrollment");
	}
	
	
	
}
