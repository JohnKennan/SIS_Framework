package com.neotech.steps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentsPageValidationSteps extends CommonMethods {
	
	@When("I proceed to Students tab")
	public void i_proceed_to_students_tab() {
		click(studentsTab.studentsTab);
	}

	@Then("I compare actual tabs with our data table")
	public void i_compare_actual_tabs_with_our_data_table(DataTable dataTable) {
		wait(3);
		List<String> expectedList = dataTable.asList();
		List<String> actualList = new ArrayList<>();
		List<WebElement> actualTabs = studentsTab.studentsPageTabs;
		Iterator<WebElement> it = actualTabs.iterator();
		while(it.hasNext()) {
			String s = it.next().getText().toString();
			actualList.add(s);
		}
		wait(2);
		
		System.out.println("Printing expectedList");
		for(int i = 0; i<expectedList.size(); i++) {
			System.out.println(expectedList.get(i).toString());
		}
		wait(2);
		System.out.println("Printing actualList");
		for(int i = 0; i<actualList.size(); i++) {
			System.out.println(actualList.get(i).toString());
		}
		
		Assert.assertEquals(expectedList, actualList);
		
		System.out.println("Test is Passed!!!");
	}
		
	@When("Click on Add New button")
	public void click_on_add_new_button() {
		jsClick(studentsTab.addNewButton);
		wait(1);
		System.out.println("Clicked on Add New button");
	}
	
	@When("I add new students informations")
	public void i_add_new_students_informations() {
		wait(1);
		studentsTab.stateID.sendKeys(ConfigsReader.getProperty("newStudentStateId"));
		wait(1);
		studentsTab.newStudentLastName.sendKeys(ConfigsReader.getProperty("newStudentLastName"));
		wait(1);
		studentsTab.newStudentFirstName.sendKeys(ConfigsReader.getProperty("newStudentFirstName"));
		wait(1);
		jsClick(studentsTab.newStudentSSN);
		wait(1);
		sendText(studentsTab.newStudentSSN, ConfigsReader.getProperty("newStudentSSN"));

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value=’703574596’;", "studentsTab.newStudentSSN");
		
		wait(1);
//		sendText(studentsTab.newStudentSSN, ConfigsReader.getProperty("newStudentSSN"));
		
		wait(1);
		studentsTab.newStudentEMail.sendKeys(ConfigsReader.getProperty("newStudentEMail"));
		wait(1);
		studentsTab.newStudentDateOfBirth.sendKeys(ConfigsReader.getProperty("newStudentDateOfBirth"));
		wait(1);
		
		Select selGender = new Select(studentsTab.genderDD);
		selGender.selectByVisibleText(ConfigsReader.getProperty("newStudentGender"));
		wait(1);
		
		Select selLunch = new Select(studentsTab.lunchTypeDD);
		selLunch.selectByVisibleText(ConfigsReader.getProperty("newStudentLunchType"));
		wait(1);
		
		Select selEthnicity = new Select(studentsTab.newStudentEthnicityDD);
		selEthnicity.selectByVisibleText(ConfigsReader.getProperty("newStudentEthnicity"));
		wait(1);
		
		//Below we do race picking staticly
		driver.findElement(By.xpath("//form[@id='form1']//button")).click();
		wait(1);
		driver.findElement(By.xpath("//form[@id='form1']//li[3]//span")).click();
		wait(1);
		driver.findElement(By.xpath("//form[@id='form1']//button")).click();
//		Select selRace = new Select(studentsTab.newStudentRaceDD);
//		selRace.selectByVisibleText(ConfigsReader.getProperty("newStudentRace"));
//		wait(1);
//		click(studentsTab.newStudentRaceDD);
		wait(1);
		
		studentsTab.newStudentPassword.sendKeys(ConfigsReader.getProperty("newStudentPassword"));
		wait(1);	
		
//		studentsTab.changePic.click();
//		wait(1);
		
//		Set<String> allWindows = driver.getWindowHandles();
//		String window1 = driver.getWindowHandle();
//		for(String windowID : allWindows) {
//			if(!windowID.equals(window1)) {
//				driver.switchTo().window(windowID);
//				}
//		}
//		wait(1);
//		driver.findElement(By.id("fileUpload")).sendKeys(System.getProperty("user.dir") + "/Desktop/SIS_Project/dwyane_wade.jpg");
//		wait(1);
//		driver.findElement(By.id("bSubmit")).click();
//		wait(1);
		
		
		System.out.println("Students all information written");
	}

	@When("I submit changes")
	public void i_submit_changes() {
		studentsTab.submitButton.click();
		wait(1);
		System.out.println("Submit Changes button clicked");
	}
	
	@When("I accept the alert")
	public void i_accept_the_alert() {
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();
		wait(1);
		System.out.println("Alert is accepted!!");
	}
	
	@Then("I validate student is created")
	public void i_validate_student_is_created() {
		String expected = "Enroll";
		String actual = studentsTab.enroll.getText().toString();
		wait(1);
		Assert.assertEquals("Enrolled words not visible", expected, actual);
		System.out.println("Test is passed!!");
	}
	

}
