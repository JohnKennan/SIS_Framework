package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.When;


public class ParentalTabSteps extends CommonMethods {

	@When("Add primary parent")
	public void add_primary_parent() {
		click(parental.ppAddNew);
		wait(1);
		Select sel = new Select(parental.ppTitleDD);
		sel.selectByVisibleText(ConfigsReader.getProperty("primaryParentTitle"));
		wait(1);
		sendText(parental.ppFirstName, ConfigsReader.getProperty("primaryParentFirstName"));
		wait(1);
		sendText(parental.ppLastName, ConfigsReader.getProperty("primaryParentLastName"));
		wait(1);
		sendText(parental.ppPassword, ConfigsReader.getProperty("primaryParentPassword"));
		wait(1);
		Select selPP = new Select(parental.ppRelation);
		selPP.selectByVisibleText(ConfigsReader.getProperty("primaryParentRelation"));
		wait(1);
		sendText(parental.ppAddress, ConfigsReader.getProperty("primaryParentAddress"));
		wait(1);
		sendText(parental.ppCity, ConfigsReader.getProperty("primaryParentCity"));
		wait(1);
		Select selST = new Select(parental.ppStateDD);
		selST.selectByVisibleText(ConfigsReader.getProperty("primaryParentState"));
		wait(1);
		sendText(parental.ppZip, ConfigsReader.getProperty("primaryParentZip"));
		wait(1);
		sendText(parental.ppPhone, ConfigsReader.getProperty("primaryParentPhone"));
		wait(1);
		sendText(parental.ppEMail, ConfigsReader.getProperty("primaryParentEMail"));
		wait(1);
		System.out.println("Primary Parent Info`s written");
		click(parental.ppSaveBtn);		
		
		wait(2);
		System.out.println("Clicked on Save Primary Parent!");
	}
	
	
	@When("Add secondary parent")
	public void add_secondary_parent() {
		click(parental.spAddNew);
		wait(1);
		Select sel = new Select(parental.spTitleDD);
		sel.selectByVisibleText(ConfigsReader.getProperty("secondaryParentTitle"));
		wait(1);
		sendText(parental.spFirstName, ConfigsReader.getProperty("secondaryParentFirstName"));
		wait(1);
		sendText(parental.spLastName, ConfigsReader.getProperty("secondaryParentLastName"));
		wait(1);
		sendText(parental.spPassword, ConfigsReader.getProperty("secondaryParentPassword"));
		wait(1);
		Select selPP = new Select(parental.spRelation);
		selPP.selectByVisibleText(ConfigsReader.getProperty("secondaryParentRelation"));
		wait(1);
		sendText(parental.spAddress, ConfigsReader.getProperty("secondaryParentAddress"));
		wait(1);
		sendText(parental.spCity, ConfigsReader.getProperty("secondaryParentCity"));
		wait(1);
		Select selST = new Select(parental.spStateDD);
		selST.selectByVisibleText(ConfigsReader.getProperty("secondaryParentState"));
		wait(1);
		sendText(parental.spZip, ConfigsReader.getProperty("secondaryParentZip"));
		wait(1);
		sendText(parental.spPhone, ConfigsReader.getProperty("secondaryParentPhone"));
		wait(1);
		sendText(parental.spEMail, ConfigsReader.getProperty("secondaryParentEMail"));
		wait(1);
		System.out.println("Primary Parent Info`s written");
		click(parental.spSaveBtn);
		
		wait(2);
		System.out.println("Clicked on Save Secondary Parent!");
	}
	
	@When("Validate Parents added")
	public void validate_parents_added() {
		boolean pp = parental.ppRemoveBtn.isDisplayed();
		boolean sp = parental.spRemoveBtn.isDisplayed();
		
		Assert.assertEquals(pp, sp);
		wait(2);
		System.out.println("Checked on Parents! Test Passed");
	}
	
	
}
