package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentsPageElements extends CommonMethods{
	
	
	@FindBy(xpath = "//*[@class='subMenuItem']")
	public List<WebElement> studentsPageTabs;
	
	@FindBy(xpath = "//form[@id='form1']/table[2]//td[6]")
	public WebElement studentsTab;
	
	@FindBy(id = "bAdd")
	public WebElement addNewButton;
	
	@FindBy(id = "tStateId")
	public WebElement stateID;
	
	@FindBy(id = "tLastName")
	public WebElement newStudentLastName;
	
	@FindBy(id = "tFirstName")
	public WebElement newStudentFirstName;
	
	@FindBy(id = "tSSN")
	public WebElement newStudentSSN;
	
	@FindBy(id = "tEmail")
	public WebElement newStudentEMail;
	
	@FindBy(id = "tBirthDay")
	public WebElement newStudentDateOfBirth;
	
	@FindBy(id = "gender_list")
	public WebElement genderDD;
	
	@FindBy(id = "lunchType")
	public WebElement lunchTypeDD;
	
	@FindBy(id = "ddEthnicity_list")
	public WebElement newStudentEthnicityDD;
	
	@FindBy(id = "ddRaceNew")
	public WebElement newStudentRaceDD;
	
	@FindBy(id = "tPassword")
	public WebElement newStudentPassword;
	
	@FindBy(id = "bSubmit")
	public WebElement submitButton;
	
	@FindBy(id = "bStatusChange")
	public WebElement enroll;
	
	@FindBy(id = "photoChange")
	public WebElement changePic;
	
	@FindBy(id = "students_students")
	public WebElement allStudents;
	
	@FindBy(id = "studentStatus_list")
	public WebElement status;
	
	@FindBy(id = "enrollGradeSection_list")
	public WebElement gradeSection;
	
	@FindBy(id = "bEnroll")
	public WebElement nestedEnroll;
	

	
	public StudentsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
