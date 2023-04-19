package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentsPageElements extends CommonMethods{
	
	
	@FindBy(xpath = "//form[@id='form1']//table[1]//tr[1]//table/tbody/tr/td/text()")
	public List<WebElement> studentsPageTabs;
	
	@FindBy(xpath = "//form[@id='form1']/table[2]//td[6]")
	public WebElement studentsTab;
	
	
	

	public StudentsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
