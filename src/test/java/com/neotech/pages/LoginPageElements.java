package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods {

	@FindBy(id = "tUsername")
	public WebElement username;

	@FindBy(id = "tPassword")
	public WebElement password;

	@FindBy(xpath = "//input[@id='bLogin']")
	public WebElement logInButton;
	
	@FindBy(id = "dAcademicYear_list")
	public WebElement academicYear;


	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}


	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		Select sel = new Select(academicYear);
		sel.selectByVisibleText(ConfigsReader.getProperty("academicYear"));
		click(logInButton);
		System.out.println("Admin Logged in");
		wait(1);
	}
	
	public void userLogin() {
		sendText(username, ConfigsReader.getProperty("newStudentLastName"));
		sendText(password, ConfigsReader.getProperty("newStudentPassword"));
		Select sel = new Select(academicYear);
		sel.selectByVisibleText(ConfigsReader.getProperty("academicYear"));
		click(logInButton);
		System.out.println("User Logged in");
		wait(1);
	}

}
