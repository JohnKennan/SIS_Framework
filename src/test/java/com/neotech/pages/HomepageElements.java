package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class HomepageElements extends CommonMethods {

	@FindBy(id = "Header1_lblSchoolName")
	public WebElement dashboardHeader;

	@FindBy(id = "Header1_imgSchoolLogo")
	public WebElement announcements;
	
	@FindBy(xpath = "//form[@id='form1']//td[2]//tbody//span")
	public WebElement logo;
	
	@FindBy(xpath = "//form[@id='form1']//td[6]/a")
	public WebElement parentalTab;
	
	
	public HomepageElements() {
		PageFactory.initElements(driver, this);
	}

}
