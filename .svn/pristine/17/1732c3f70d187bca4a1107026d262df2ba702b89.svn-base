package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.AcceleratorRoleUpdate_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class AcceleratorRoleUpdate extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	AcceleratorRoleUpdate_Locators locators;
	String error = "";
	
	public AcceleratorRoleUpdate(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new AcceleratorRoleUpdate_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void ExistingPersonSelected() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.ExistingPersonSelected);
		waitForElementToAppear(locators.ExistingPersonSelected);
	}
	
	public void BeneficiarySelected() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.BeneficiarySelected);
	}
	
	public void AttachExistingPersonButton() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.AttachExistingPersonButton);
		waitForElementToAppear(locators.AttachExistingPersonButton);
	}
	
	public void UpdateLink() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.UpdateLink);
		waitForElementToAppear(locators.UpdateLink);
	}
	public void Percentage() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Percentage - " + testData.get("Percentage"));
		enterText(locators.Percentage,"50", "Enter Percentage");
	}
	public void EditPercentage() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EditPercentage - " + testData.get("EditPercentage"));
		enterText(locators.EditPercentage,"50", "Enter EditPercentage");
	}
	
	public void Relation() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.Relation_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Relation_Value);
	}
	public void PreferedPhone() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.PreferedPhone);
		waitForElementToAppear(locators.PreferedPhone);
	}
	public void PreferedEmail() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.PreferedEmail);
		waitForElementToAppear(locators.PreferedEmail);
	}
	public void PreferedAdres() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.PreferedAdres);
		waitForElementToAppear(locators.PreferedAdres);
	}
	public void AddBeneficiaryPerson_Btn() throws InterruptedException 
	{   Thread.sleep(4000);
		clickOnElement(locators.AddBeneficiaryPerson_Btn);

	}
	public void AddBeneficiaryOrganization_Btn() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.AddBeneficiaryOrganization_Btn);
	}
	
	public void Organisation() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.Organisation_Type);
		Thread.sleep(5000);
		clickOnElement(locators.Organisation_Value);
	}
	public void RegistrationNo() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("RegistrationNo - " + testData.get("RegistrationNo"));
		enterText(locators.RegistrationNo,"12345", "Enter RegistrationNo");
	}
	public void RegistrationDate() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.RegistrationDate_Type);
		Thread.sleep(3000);
		clickOnElement(locators.RegistrationDate_Value);
	}
	public void CountryOfIncorp() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.CountryOfIncorp_Type);
		Thread.sleep(3000);
		clickOnElement(locators.CountryOfIncorp_Value);
	}
	
	public void SaveButtonAccelerator() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SaveButtonAccelerator);
	}
	
	
	public void Share_Percentage() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Share_Percentage - " + testData.get("Share_Percentage"));
		enterText(locators.Share_Percentage,"50", "Enter Share_Percentage");
	}
	public void AddName_Btn() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.AddName_Btn);
	}
	public void LegalName()throws InterruptedException
	{			
		retrieveTextAttribute(locators.LegalName);
	}
	public void NameField() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("NameField - " + testData.get("NameField"));
		enterText(locators.NameField,"Clive Inc", "Enter NameField");
	}
	public void Language() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.LanguageType);
		Thread.sleep(3000);
		clickOnElement(locators.LanguageValue);
	}
	
	public void Verify_Delete()throws InterruptedException
	{			
		retrieveTextAttribute(locators.Verify_Delete);
	}
	
	public void SelectHomePhone() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.PhoneType);
		Thread.sleep(3000);
		clickOnElement(locators.PhoneValue);
	}

	public void CountrySelected() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.CountrySelectedType);
		Thread.sleep(3000);
		clickOnElement(locators.CountrySelectedValue);
	}
	public void HomeNumber() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("HomeNumber - " + testData.get("HomeNumber"));
		enterText(locators.HomeNumber,"0217051111", "Enter HomeNumber");
	}
	
	public void Name() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Name - " + testData.get("Name"));
		enterText(locators.Name,"Name", "Enter Name");
	}

	public void Enter_Surname() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Enter_Surname - " + testData.get("Enter_Surname"));
		enterText(locators.Enter_Surname,"Name", "Enter Enter_Surname");
	}

	public void AdditionalName() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("AdditionalName - " + testData.get("AdditionalName"));
		enterText(locators.AdditionalName,"Name", "Enter AdditionalName");
	}

	public void SelectCOB() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SelectCOB_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectCOB_Value);
	}
	public void EnterInitials() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EnterInitials - " + testData.get("EnterInitials"));
		enterText(locators.EnterInitials,"C", "Enter EnterInitials");
	}
	
	public void DOB() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.DOB_Type);
		Thread.sleep(3000);
		clickOnElement(locators.DOB_Value);
	}
	public void SelectID() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SelectID_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectID_Value);
	}
	
	public void EnterIDNumber() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EnterIDNumber - " + testData.get("EnterIDNumber"));
		enterText(locators.EnterIDNumber,"2103135103080", "Enter EnterIDNumber");
	}
	
	public void Selected_Gender() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Gender_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Gender_Value);
	}
	
	public void CountryID() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.CountryID_Type);
		Thread.sleep(3000);
		clickOnElement(locators.CountryID_Value);
	}
	
	public void EnterSharePercentage() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EnterSharePercentage - " + testData.get("EnterSharePercentage"));
		enterText(locators.EnterSharePercentage,"0", "Enter EnterSharePercentage");
	}
	
	public void SelectRelation() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SelectRelation_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectRelation_Value);
	}
	public void SelectId() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SelectId_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectId_Value);
	}
	
	public void IDNo() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("IDNo - " + testData.get("IDNo"));
		enterText(locators.IDNo,"2103135103080", "Enter IDNo");
	}
	public void Select_Country() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.Select_Country_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Select_Country_Value);
	}
	
	public void DateOfExpiry() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.DateOfExpiry_Type);
		Thread.sleep(3000);
		clickOnElement(locators.DateOfExpiry_Value);
	}
	public void AddEmails() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.AddEmails_Type);
		Thread.sleep(3000);
		clickOnElement(locators.AddEmails_Value);
	}
	
	public void EnterEMail() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EnterEMail - " + testData.get("EnterEMail"));
		enterText(locators.EnterEMail,"clement@gmail.com", "Enter EnterEMail");
	}
	

	public void PreferedEmailSelect() throws InterruptedException 
	{   
		Thread.sleep(2000);
		clickOnElement(locators.PreferedEmailSelect);	
	}
	public void SelectPhoneType() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.SelectPhoneType_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectPhoneType_Value);
	}
	public void CountryOfPhone() throws InterruptedException 
	{   
		Thread.sleep(3000);
		clickOnElement(locators.CountryOfPhone_Type);
		Thread.sleep(3000);
		clickOnElement(locators.CountryOfPhone_Value);
	}

	public void PhoneNo() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("PhoneNo - " + testData.get("PhoneNo"));
		enterText(locators.PhoneNo,"0722418883", "Enter PhoneNo");
	}
	
	public void SignDocument_RPP() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.SignDocument_RPP);
	}
	public void SaveButton_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.SaveButton_Accelerator);
	}
	
	public void UpdateLink_Person() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.UpdateLink_Person);
	}
	
	
	
	public void Name_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Name_Accelerator - " + testData.get("Name_Accelerator"));
		enterText(locators.Name_Accelerator,"Clement", "Enter Name_Accelerator");
	}
	

	public void Surname_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(3000);
		System.out.println("Surname_Accelerator - " + testData.get("Surname_Accelerator"));
		enterText(locators.Surname_Accelerator,"Appoles", "Enter Surname_Accelerator");
	}
	
	public void AdditionalName_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(3000);
		System.out.println("AdditionalName_Accelerator - " + testData.get("AdditionalName_Accelerator"));
		enterText(locators.AdditionalName_Accelerator,"Clive", "Enter AdditionalName_Accelerator");
	}

	public void SelectCOB_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.SelectCOB_Accelerator);
		Thread.sleep(5000);
		clickOnElement(locators.SelectCOB_Accelerator_Value);
	}
	public void EnterInitials_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("EnterInitials_Accelerator - " + testData.get("EnterInitials_Accelerator"));
		enterText(locators.EnterInitials_Accelerator,"CC", "Enter EnterInitials_Accelerator");
	}

	public void DOB_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.DOB_Accelerator);
		Thread.sleep(5000);
		clickOnElement(locators.DOB_Accelerator_Value);
	}
	public void SelectID_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.SelectID_Accelerator);
		Thread.sleep(5000);
		clickOnElement(locators.SelectID_Accelerator_Value);
	}
	
	public void IDNumber_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("IDNumber_Accelerator - " + testData.get("IDNumber_Accelerator"));
		enterText(locators.IDNumber_Accelerator,"9302055103080", "Enter IDNumber_Accelerator");
	}
	
	public void SelectedGender_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.SelectedGender_Accelerator);
		Thread.sleep(5000);
		clickOnElement(locators.SelectedGender_Accelerator_Value);
	}
	public void CountryID_Accelerator() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.CountryID_Accelerator);
		Thread.sleep(5000);
		clickOnElement(locators.CountryID_Accelerator_Value);
	}
	

	public void Accelerator_ButtonNext() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.Accelerator_ButtonNext);
	}
	
	public void Accelerator_SharePercentage() throws InterruptedException 
	{   
		Thread.sleep(4000);
		System.out.println("Accelerator_SharePercentage - " + testData.get("Accelerator_SharePercentage"));
		enterText(locators.Accelerator_SharePercentage,"0", "Enter Accelerator_SharePercentage");
	}
	public void Accelerator_Relationship() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.Accelerator_Relationship);
		Thread.sleep(5000);
		clickOnElement(locators.Accelerator_Relationship_Value);
	}
	
	public void Accelerator_Relationship_Type() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.Accelerator_Relationship_Type);
		Thread.sleep(5000);
		clickOnElement(locators.Accelerator_Relationship_Value);
	}
	public void IdType() throws InterruptedException 
	{   
		Thread.sleep(5000);
		clickOnElement(locators.IdType);
		Thread.sleep(5000);
		clickOnElement(locators.SelectId_Value);
	}
	
	
	public void Change_My_Beneficiary_Detail() throws InterruptedException 
	{   
		Thread.sleep(2000);
		clickOnElement(locators.Change_My_Beneficiary_Detail);
	}

	

	public void Select_Change_My_Beneficiary_Checkbox() throws InterruptedException 
	{   
		Thread.sleep(4000);
		clickOnElement(locators.Select_Change_My_Beneficiary_Checkbox);
	}
	
}
