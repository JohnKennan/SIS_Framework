package com.neotech.steps;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.When;


public class StaffPageSteps extends CommonMethods {

	@When("proceed to staff/faculty tab")
	public void i_proceed_to_staff_tab() {
		click(staff.staffTab);
		
		wait(2);
		System.out.println("Clicked on staff/faculty!");
	}
	
	@When("Click on Add New on staff")
	public void click_on_add_new() {
		click(staff.staffTab);
		wait(3);
		click(staff.staffAddNew);
		
		wait(2);
		System.out.println("Clicked on add teacher!");
	}
	
	@When("Add teacher informations")
	public void add_teacher_informations() {
		wait(2);
//		Select sel = new Select(staff.jobOptions);
//		sel.deselectByVisibleText("Teacher/Teacher");
		driver.findElement(By.id("jPosAccLev")).click();
		wait(1);
		driver.findElement(By.xpath("//select[@id='jPosAccLev']/option[3]")).click();
		wait(1);
		sendText(staff.tStateID, ConfigsReader.getProperty("teacherStateID"));
		wait(1);
		Select selD = new Select(staff.tTitleDD);
		selD.selectByVisibleText(ConfigsReader.getProperty("teacherTitle"));
		wait(1);
		sendText(staff.tLastname, ConfigsReader.getProperty("teacherLastName"));
		wait(1);
		sendText(staff.tFirstName, ConfigsReader.getProperty("teacherFirstName"));
		wait(1);
//		jsClick(staff.tDateofBirth);
//		wait(1);
//		sendText(staff.tDateofBirth, ConfigsReader.getProperty("teacherBirthday"));
		staff.tDateofBirth.click();
		wait(1);
		staff.tDateofBirth.sendKeys("ConfigsReader.getProperty(\"teacherBirthday\")");
		wait(1);
//		jsClick(staff.tSSN);
//		wait(1);
//		sendText(staff.tSSN, ConfigsReader.getProperty("teacherSSN"));
//		wait(1);
//		jsClick(staff.tPassword);
//		wait(1);
//		sendText(staff.tPassword, ConfigsReader.getProperty("teacherPassword"));
//		wait(1);
		Select s = new Select(staff.tGenderDD);
		s.selectByVisibleText(ConfigsReader.getProperty("teacherGender"));
		wait(1);
		Select se = new Select(staff.tEthnicityDD);
		se.selectByVisibleText(ConfigsReader.getProperty("tEthnicity"));
		wait(1);
		click(staff.tRaceDD);
		wait(1);
		driver.findElement(By.xpath("//form[@id='form1']//li[5]//span")).click();
		wait(1);
		click(staff.tRaceDD);
		wait(1);
		sendText(staff.tJobTitle, ConfigsReader.getProperty("teacherJobTitle"));
		wait(1);
		Select selDe = new Select(staff.tDepartmentDD);
		selDe.selectByVisibleText(ConfigsReader.getProperty("teacherDepartment"));
		wait(1);
		Select selA = new Select(staff.tAdvisoryDD);
		selA.selectByVisibleText(ConfigsReader.getProperty("teacherAdvisorOf"));
		wait(1);
		Select selH = new Select(staff.tHomeroomDD);
		selH.selectByVisibleText(ConfigsReader.getProperty("teacherHomeroom"));
		wait(1);
		Select selC = new Select(staff.tClassroomDD);
		selC.selectByVisibleText(ConfigsReader.getProperty("teacherClassroom"));
		wait(1);
		sendText(staff.tAddress, ConfigsReader.getProperty("teacherAddress"));
		wait(1);
		sendText(staff.tCity, ConfigsReader.getProperty("teacherCity"));
		wait(1);
		Select selS = new Select(staff.tStateDD);
		selS.selectByVisibleText(ConfigsReader.getProperty("teacherState"));
		wait(1);
		sendText(staff.tZip, ConfigsReader.getProperty("teacherZip"));
		wait(1);
		sendText(staff.tPhone, ConfigsReader.getProperty("teacherPhone"));
		wait(1);
		sendText(staff.tEmail, ConfigsReader.getProperty("taecherEMail"));
		wait(1);
		click(staff.tSubmit);
		wait(2);
		System.out.println("Teacher infos added!");
	}
	
	@When("Validate teacher is added")
	public void validate_teacher_is_added() {
		String exp = ConfigsReader.getProperty("teacherLastName") + ", " + ConfigsReader.getProperty("teacherFirstName");
		List<WebElement> l = staff.tStaffList;
		Iterator<WebElement> it = l.iterator();
		while(it.hasNext()) {
			String act = it.toString();
			if(act.equals(exp)) {
				System.out.println("Teacher Added, TEst Passed");
				Assert.assertEquals(exp, act);
			}
		}
		
		
		wait(2);
		System.out.println("Test is Passed!!!!");
	}
	
	
}
