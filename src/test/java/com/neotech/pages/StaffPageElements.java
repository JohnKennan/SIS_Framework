package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StaffPageElements extends CommonMethods{
	
	@FindBy(xpath = "//form[@id='form1']//td[10]/a")
	public WebElement staffTab;
	
	@FindBy(id = "bAdd")
	public WebElement staffAddNew;
	
	@FindBy(id = "jPosAccLev")
	public WebElement jobOptions;
	
	@FindBy(id = "tStaffStateId")
	public WebElement tStateID;
	
	@FindBy(id = "myTitle_list")
	public WebElement tTitleDD;
	
	@FindBy(id = "tLastName")
	public WebElement tLastname;
	
	@FindBy(id = "tFirstName")
	public WebElement tFirstName;
	
	@FindBy(id = "tSSN")
	public WebElement tSSN;
	
	@FindBy(id = "tDateofBirth")
	public WebElement tDateofBirth;
	
	@FindBy(id = "dGender_list")
	public WebElement tGenderDD;
	
	@FindBy(id = "tPassword")
	public WebElement tPassword;
	
	@FindBy(id = "ddEthnicity_list")
	public WebElement tEthnicityDD;
	
	@FindBy(id = "ddRaceNew")
	public WebElement tRaceDD;
	
	@FindBy(id = "tJTitle")
	public WebElement tJobTitle;
	
	@FindBy(id = "dDepartment_list")
	public WebElement tDepartmentDD;
	
	@FindBy(id = "dAdvisory")
	public WebElement tAdvisoryDD;
	
	@FindBy(id = "dHomeroom")
	public WebElement tHomeroomDD;
	
	@FindBy(id = "dClassroom_list")
	public WebElement tClassroomDD;
	
	@FindBy(id = "tAddress")
	public WebElement tAddress;
	
	@FindBy(id = "tCity")
	public WebElement tCity;
	
	@FindBy(id = "state_list")
	public WebElement tStateDD;
	
	@FindBy(id = "tZip")
	public WebElement tZip;
	
	@FindBy(id = "tCellPhone")
	public WebElement tPhone;
	
	@FindBy(id = "tSchoolEmail")
	public WebElement tEmail;
	
	@FindBy(id = "bSubmit")
	public WebElement tSubmit;
	
	@FindBy(xpath = "//select[@id='staffList_staffs']/option")
	public List<WebElement> tStaffList;	
	
	
	
	
	public StaffPageElements() {
		PageFactory.initElements(driver, this);
	}
}
