package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class UserPageElements extends CommonMethods{

	@FindBy(id = "lStdName")
	public WebElement studentName;
	
	@FindBy(id = "lUserName")
	public WebElement userName;
	
	
	
	public UserPageElements() {
		PageFactory.initElements(driver, this);
	}

}
