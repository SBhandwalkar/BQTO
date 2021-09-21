package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.RPP_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class RPP extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	RPP_Locators locators;
	String error = "";
	String caseNO = "";
	
	public RPP(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new RPP_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void CancelMyPlan_Capture() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CancelMyPlan_Capture);
		clickOnElement(locators.CancelMyPlan_Capture);

	}
	
	public void SaveButton_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SaveButton_RPP);
		clickOnElement(locators.SaveButton_RPP);

	}
	
	

	public void ChangeMyAgreementScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyAgreementScreen);
		
	}
	
	
	
	
	public void SelectCaptureHyperlink() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectCaptureHyperlink );
		clickOnElement(locators.SelectCaptureHyperlink);
//		waitForElementToAppear(locators.SelectCaptureHyperlink );

	}
	public void CancellationReason() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CancellationReason_Type);
		clickOnElement(locators.CancellationReason_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CancellationReason_Value);
		clickOnElement(locators.CancellationReason_Value);
	}
	
	public void SelectedBank() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectedBank);
		clickOnElement(locators.SelectedBank);

	}
	
	public void CreteNewBankDetails() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CreteNewBankDetails);
		clickOnElement(locators.CreteNewBankDetails);

	}
	
	public void EffectiveDte() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EffectiveDte_Type);
		clickOnElement(locators.EffectiveDte_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EffectiveDte_Value);
		clickOnElement(locators.EffectiveDte_Value);
	}
	
	public void SelectBankName() throws InterruptedException 
	{  

		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectBankName_Type);
		clickOnElement(locators.SelectBankName_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectBankName_Value);
		clickOnElement(locators.SelectBankName_Value);
	}
	
	public void SelectAccount() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectAccount_Type);
		clickOnElement(locators.SelectAccount_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectAccount_Value);
		clickOnElement(locators.SelectAccount_Value);
	}
	
	public void AccountNo() throws InterruptedException
	{
		
		Thread.sleep(3000);
//		waitForElementToAppear(locators.AccountNo);
		System.out.println("AccountNo - " + testData.get("AccountNo"));
		enterValidationText(locators.AccountNo, "012345678", "Enter AccountNo");
	}
	public void AccountHolder() throws InterruptedException
	{
		
		Thread.sleep(3000);
//		waitForElementToAppear(locators.AccountHolder);
		System.out.println("AccountHolder - " + testData.get("AccountHolder"));
		enterValidationText(locators.AccountHolder, "T Test", "Enter AccountHolder");
	}
	public void PolicyOwner() throws InterruptedException 
	{  
		
	Thread.sleep(3000);
//		waitForElementToAppear(locators.PolicyOwner);
		clickOnElement(locators.PolicyOwner);
	}
	public void CancelButton() throws InterruptedException 
	{ 
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CancelButton);
		clickOnElement(locators.CancelButton);
	}
	public void CancellationDeclaration() throws InterruptedException 
	{ 
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CancellationDeclaration);
		clickOnElement(locators.CancellationDeclaration);
	}
	public void SelectedBeneficiary() throws InterruptedException 
	{  
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectedBeneficiary);
		clickOnElement(locators.SelectedBeneficiary);
	}
	
	public void UpdateDetails() throws InterruptedException 
	{ 
		Thread.sleep(3000);
//		waitForElementToAppear(locators.UpdateDetails);
		clickOnElement(locators.UpdateDetails);
	}
	
	public void SharePercentage() throws InterruptedException 
	{   
	
		Thread.sleep(5000);
//		waitForElementToAppear(locators.SharePercentage);
		System.out.println("SharePercentage - " + testData.get("SharePercentage"));
		enterText(locators.SharePercentage, "0", "Enter SharePercentage");
	}

	public void Cancel() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Cancel);
		clickOnElement(locators.Cancel);
	}
	
	public void ManualySigned() throws InterruptedException 
	{  
		Thread.sleep(6000);
//		waitForElementToAppear(locators.ManualySigned);
		clickOnElement(locators.ManualySigned);
	}
	
	public void RPOCapatureLink() throws InterruptedException 
	{  
		Thread.sleep(4000);
//		waitForElementToAppear(locators.RPOCapatureLink);
		clickOnElement(locators.RPOCapatureLink);
	}
	public void ChangeMyagreement() throws InterruptedException 
	{ 
		Thread.sleep(4000);
//		waitForElementToAppear(locators.ChangeMyagreement);
		clickOnElement(locators.ChangeMyagreement);
		Thread.sleep(1000);
	}
	public void SelectBoxRPO() throws InterruptedException 
	{  
		Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectBoxRPO);
		clickOnElement(locators.SelectBoxRPO);
	}
	public void AddRPO() throws InterruptedException 
	{ 
		Thread.sleep(4000);
//		waitForElementToAppear(locators.AddRPO);
		clickOnElement(locators.AddRPO);
	}
	
	public void UpdateDetailsRPO() throws InterruptedException 
	{  
	Thread.sleep(4000);
//		waitForElementToAppear(locators.UpdateDetailsRPO);
		clickOnElement(locators.UpdateDetailsRPO);
	}
	
	public void EnterFirstName() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EnterFirstName);
		System.out.println("EnterFirstName - " + testData.get("EnterFirstName"));
		enterText(locators.EnterFirstName, "Clement", "Enter EnterFirstName");
	}
	
	public void EnterSurname() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EnterSurname);
		System.out.println("EnterSurname - " + testData.get("EnterSurname"));
		enterText(locators.EnterSurname, "Appoles", "Enter EnterSurname");
	}
	public void SelectedGender() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectedGender_Type);
		clickOnElement(locators.SelectedGender_Type);
		Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectGender_Value);
		clickOnElement(locators.SelectGender_Value);	
	}
	
	public void COB() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.COB_Type);
		clickOnElement(locators.COB_Type);
		Thread.sleep(4000);
//		waitForElementToAppear(locators.COB_Value);
		clickOnElement(locators.COB_Value);
	}
	public void SelectRelationship() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Relationship_Type);
		clickOnElement(locators.Relationship_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Relationship_Value);
		clickOnElement(locators.Relationship_Value);
		
	}
	
	public void SelectRelationshipType() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Relationship_Type);
		clickOnElement(locators.SelectRelationshipType);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Relationship_Value);
		clickOnElement(locators.Relationship_Value);
		
	}
	
	
	
	public void ID() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ID_Type);
		clickOnElement(locators.ID_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ID_Value);
		clickOnElement(locators.ID_Value);	
	}
	public void EnterID() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EnterID);
		System.out.println("EnterID - " + testData.get("EnterID"));
		enterText(locators.EnterID, "2103105103080", "Enter EnterID");
	}
	public void IDCountry() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.IDCountry_Type);
		clickOnElement(locators.IDCountry_Type);
	Thread.sleep(3000);
//		waitForElementToAppear(locators.IDCountry_Value);
		clickOnElement(locators.IDCountry_Value);	
	}
	public void Email() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Email_Types);
		clickOnElement(locators.Email_Types);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Email_Valued);
		clickOnElement(locators.Email_Valued);	
	}
	
	
	
	public void SelectedCheckBox() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectedCheckBox);
		clickOnElement(locators.SelectedCheckBox);
//			
	}
	
	
	
	public void EnterMail() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.EnterMail);
		System.out.println("EnterMail - " + testData.get("EnterMail"));
		enterText(locators.EnterMail, "clement@gmail.com", "Enter EnterMail");
	}
	public void Phone() throws InterruptedException 
	{
	Thread.sleep(2000);
//		waitForElementToAppear(locators.PhoneType);
		clickOnElement(locators.PhoneType);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Phone_Valued);
		clickOnElement(locators.Phone_Valued);	
	}
	public void SelectedCountry() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.SelectedCountry_Types);
		clickOnElement(locators.SelectedCountry_Types);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectedCountry_Valued);
		clickOnElement(locators.SelectedCountry_Valued);	
	}
	public void Number() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("Number - " + testData.get("Number"));
		enterText(locators.Number, "0722418883", "Enter Number");
	}
	public void PreferedNo() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.PreferedNo);
		clickOnElement(locators.PreferedNo);
	}
	public void ChangeDependentLifeAssuredDetail() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ChangeDependentLifeAssuredDetail);
	}
	
	
	public void Change_My_Beneficiary_Detail_Link_RPP() throws InterruptedException 
	{
		Thread.sleep(6000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Change_My_Beneficiary_Detail_Link_RPP);
	}
	
	public void Select_Change_My_Beneficiary_Detail_Checkbox() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Select_Change_My_Beneficiary_Detail_Checkbox);
	}
	
	public void Attach_Existing_Person() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Attach_Existing_Person);
	}
	public void Update_Details_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Update_Details_RPP);
	}
	
	public void RelationType() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationType);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationValue);
	}
	
	public void SelectID_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectID_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ID_Value);
	}
	
	public void IDNumber_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("IDNumber_RPP - " + testData.get("IDNumber_RPP"));
		enterText(locators.IDNumber_RPP, "9910045103060", "Enter IDNumber_RPP");
	}
	
	public void IDCountry_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.IDCountry_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.IDCountry_Value);
	}
	
	public void ExpiryDate_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ExpiryDate_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ExpiryDate_RPPValue);
	}
	
	
	
	public void AdditionalNamez() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("AdditionalNamez - " + testData.get("AdditionalNamez"));
		enterText(locators.AdditionalNamez, "Samuel", "Enter AdditionalNamez");
	}
	
	
	public void SelectCountryOfBirth() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectCountryOfBirth);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectCountryOfBirth_Value);
	}
	
	
	public void PercentageShare() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("PercentageShare - " + testData.get("PercentageShare"));
		enterText(locators.PercentageShare, "0", "Enter PercentageShare");
	}
	

	public void Relationships() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Relationships);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationValue);
	}
	
	public void RelationshipType() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationshipType);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationValue);
	}
	
	public void IdentityNumber() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("IdentityNumber - " + testData.get("IdentityNumber"));
		enterText(locators.IdentityNumber, "9402066503000", "Enter IdentityNumber");
	}
	
	
	public void Line3() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("Line3 - " + testData.get("Line3"));
		enterText(locators.Line3, "43 Nyasa Road", "Enter Line3");
	}
	
	public void ChangedEmail() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("ChangedEmail - " + testData.get("ChangedEmail"));
		enterText(locators.ChangedEmail, "cappoles@oldmutual.com", "Enter ChangedEmail");
	}
	
	
	public void PhoneChange() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("PhoneChange - " + testData.get("PhoneChange"));
		enterText(locators.PhoneChange, "0722418883", "Enter PhoneChange");
	}
	
	
	
	public void SelectedPerson() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectedPerson);
	}
	
	public void IDType() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.IDType);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ID_Value);
	}
	
	public void IdentityNo() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("IdentityNo - " + testData.get("IdentityNo"));
		enterText(locators.IdentityNo, "2108015103080", "Enter IdentityNo");
	}
	
	public void BirthCountry() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.BirthCountry);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.IDCountry_Value);
	}
	
	public void RelationToPolicyOwner() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationToPolicyOwner);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationValue);
	}
	
	
	public void RelationToPolicyOwnerType() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationToPolicyOwnerType);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.RelationValue);
	}
	
	public void PhoneType() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.PhoneTypez);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Phone_Valued);
	}
	
	public void SelectCheckBox() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectCheckBox);
	}
	
	public void UpdateDetailHyperLink() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.UpdateDetailHyperLink);
	}
	
	
	
	public void RoleUpDateScreen() throws InterruptedException {		

		Thread.sleep(6000);
		retrieveTextAndCompare(locators.RoleUpDateScreen,"Role updates");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);
		
	}
	
	public void UpdatePartyDetailsScreen() throws InterruptedException {		

		Thread.sleep(6000);
		retrieveTextAndCompare(locators.UpdatePartyDetailsScreen,"Update Party Details");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);
		
	}
	
	
	
	public void PhoneCountry() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.PhoneCountry);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectCountryOfBirth_Value);
	}
	
	public void PhoneNumber() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("PhoneNumber - " + testData.get("PhoneNumber"));
		enterText(locators.PhoneNumber, "0722418884", "Enter PhoneNumber");
	}
	
	public void SelectPreferred() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectPreferred);
	}
	
	public void SharePercentage_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("SharePercentage_RPP - " + testData.get("SharePercentage_RPP"));
		enterText(locators.SharePercentage_RPP, "0", "Enter SharePercentage_RPP");
	}
	
	public void BankName_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.BankName_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectBankName_Value);
	}
	
	public void Account_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Account_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectAccount_Value);
	}
	
	public void AccountNumber_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("AccountNumber_RPP - " + testData.get("AccountNumber_RPP"));
		enterText(locators.AccountNumber_RPP, "0123456789", "Enter AccountNumber_RPP");
	}
	
	public void AccountHolder_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("AccountHolder_RPP - " + testData.get("AccountHolder_RPP"));
		enterText(locators.AccountHolder_RPP, "Test", "Enter AccountHolder_RPP");
	}
	
	public void DOB_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.DOB_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.DOBType_RPP);
	}
	public void UpdateDetail() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.UpdateDetail);
	}
	

	public void Country_RPP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.Country_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.SelectedCountry_Valued);
	}
	
	public void ID_RPP() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ID_RPP);
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ChangeDependentLifeAssuredDetail);
		clickOnElement(locators.ID_Value);
	}
	
	
	public void EnterID_RPP() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("EnterID_RPP - " + testData.get("EnterID_RPP"));
		enterText(locators.EnterID_RPP, "2108025103080", "Enter EnterID_RPP");
	}
	

	public void Shares() throws InterruptedException 
	{   
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Number);
		System.out.println("Shares - " + testData.get("Shares"));
		enterText(locators.Shares, "100", "Enter Shares");
	}
	
	
}
