package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ParentalTabElements extends CommonMethods {

	@FindBy(id = "bAddNew")
	public WebElement ppAddNew;
	
	@FindBy(id = "ppTitle_list")
	public WebElement ppTitleDD;
	
	@FindBy(id = "ppFirstName")
	public WebElement ppFirstName;
	
	@FindBy(id = "ppLastName")
	public WebElement ppLastName;
	
	@FindBy(id = "ppPassword")
	public WebElement ppPassword;
	
	@FindBy(id = "ppRelation_list")
	public WebElement ppRelation;
	
	@FindBy(id = "ppAddress")
	public WebElement ppAddress;
	
	@FindBy(id = "ppCity")
	public WebElement ppCity;
	
	@FindBy(id = "ppState_list")
	public WebElement ppStateDD;
	
	@FindBy(id = "ppZipCode")
	public WebElement ppZip;
	
	@FindBy(id = "ppCellPhone")
	public WebElement ppPhone;
	
	@FindBy(id = "ppEmail1")
	public WebElement ppEMail;	
	
	@FindBy(id = "bSave")
	public WebElement ppSaveBtn;	
	
	@FindBy(id = "bAddNewSP")
	public WebElement spAddNew;
	
	@FindBy(id = "spTitle_list")
	public WebElement spTitleDD;
	
	@FindBy(id = "spFirstName")
	public WebElement spFirstName;
	
	@FindBy(id = "spLastName")
	public WebElement spLastName;
	
	@FindBy(id = "spPassword")
	public WebElement spPassword;
	
	@FindBy(id = "spRelation_list")
	public WebElement spRelation;
	
	@FindBy(id = "spAddress")
	public WebElement spAddress;
	
	@FindBy(id = "spCity")
	public WebElement spCity;
	
	@FindBy(id = "spState_list")
	public WebElement spStateDD;
	
	@FindBy(id = "spZipCode")
	public WebElement spZip;	
	
	@FindBy(id = "spCellPhone")
	public WebElement spPhone;
	
	@FindBy(id = "spEmail1")
	public WebElement spEMail;	
	
	@FindBy(id = "bSaveSP")
	public WebElement spSaveBtn;	
	
	@FindBy(id = "bDelete")
	public WebElement ppRemoveBtn;
	
	@FindBy(id = "bDeleteSP")
	public WebElement spRemoveBtn;
	
	public ParentalTabElements() {
		PageFactory.initElements(driver, this);
	}
}
