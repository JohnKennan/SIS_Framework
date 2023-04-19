package com.neotech.steps;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentsPageValidationSteps extends CommonMethods {
	
	@When("I proceed to Students tab")
	public void i_proceed_to_students_tab() {
		click(studentsTab.studentsTab);
	}

	@Then("I get all tabs into a List of WebElements")
	public void i_get_all_tabs_into_a_list_of_web_elements() {
		List<WebElement> actual = studentsTab.studentsPageTabs;
		String[] expected = {"Personal", "Parental", "Academic", "Override Final Grade", "Schedule", "Discipline Stats", "Personal 2", "Enrollment", "Notes", "E-Portfolio", "Program Enrollment"};
		
		Iterator<WebElement> it = actual.iterator();
		
		while (it.hasNext())
		{
			String element = it.next().toString();
			
			for(int i = 0; i<expected.length; i++) {
				String exp = expected[i];
				
			}

		}
	}



}
