package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.PersonalDetails_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class PersonalDetails extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	PersonalDetails_Locators locators;
	String error = "";
	
	public PersonalDetails(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new PersonalDetails_Locators();
	}

	/*=================================TC_10========================================*/
	
	/**
	 *  Verify fields displayed on Identification
	 * 
	 */
	public void Verify_Identifications() {		
		retrieveTextAttribute(locators.IDYType);
//		retrieveTextAndCompare(String.format(locators.IDYType, testData.get("IDYType")), testData.get("IDYType")); // Wait for login as
	
		retrieveTextAttribute(locators.IDNumber);
		retrieveTextAttribute(locators.IDCountry);
		retrieveTextAttribute(locators.IssueDate);
		retrieveTextAttribute(locators.Delete);
		retrieveTextAttribute(locators.AddIdentification);
		retrieveTextAttribute(locators.ExpiryDate);
		
		
	}
	/**
	 *  Verify fields displayed on Tax Registration
	 * @throws InterruptedException 
	 * 
	 */
	public void Verify_TaxRegistration() throws InterruptedException {	
		Thread.sleep(1000);
		clickOnElement(locators.Registrations);
		retrieveTextAttribute(locators.RegistrationNumber);
		retrieveTextAttribute(locators.RegistrationCountry);
		retrieveTextAttribute(locators.Resident);
		retrieveTextAttribute(locators.AddTaxRegistration);
		retrieveTextAttribute(locators.DeleteTab);
		
	}
	/**
	 *  Verify fields displayed on Nationality
	 * 
	 */
	public void Verify_Nationality() {		
		retrieveTextAttribute(locators.Country);
		retrieveTextAttribute(locators.AddNationality);
		retrieveTextAttribute(locators.DeleteNationality);
		
	}
//	/**
//	 *  Verify fields displayed on Permits
//	 * 
//	 */
	public void Verify_Permits() {	
		clickOnElement(locators.Permits);
		retrieveTextAttribute(locators.AddPermit);
//		clickOnElement(locators.AddPermit);
//		retrieveTextAttribute(locators.PermitType);
//		retrieveTextAttribute(locators.PermitCountry);
//		retrieveTextAttribute(locators.PermitNumber);
//		retrieveTextAttribute(locators.PermitIssueDate);
//		retrieveTextAttribute(locators.PermitExpiryDateNumber);
//		retrieveTextAttribute(locators.PermitDelete);
		
	}
//	/**
//	 *  Verify fields displayed on Address type
//	 * 
//	 */
	public void Verify_AddressType() throws InterruptedException 
	{	
		Thread.sleep(2000);
		clickOnElement(locators.AddressType);	
//		retrieveTextAttribute(locators.Residential);
		retrieveTextAttribute(locators.HomePostal);
		retrieveTextAttribute(locators.BussinesPostal);
		retrieveTextAttribute(locators.BussinessResidential);
		retrieveTextAttribute(locators.SecondOrAlternate);
	}
//	/**
//	 *  Verify fields displayed on Address
//	 * 
//	 */
	public void Verify_Address() {		
		retrieveTextAttribute(locators.Line1);
		retrieveTextAttribute(locators.Line2);
		retrieveTextAttribute(locators.Line3);
		retrieveTextAttribute(locators.Line4);
		retrieveTextAttribute(locators.Address_Country);
		retrieveTextAttribute(locators.PostalCode);
		retrieveTextAttribute(locators.PostalCodeSearch);
		retrieveTextAttribute(locators.AddressDelete);
		retrieveTextAttribute(locators.AddressPreferred);
	}
//	 *  Verify fields displayed on Address
//	 * 
//	 */
	public void Verify_EmailType()throws InterruptedException
	{		
		Thread.sleep(3000);
		clickOnElement(locators.EmailDrp_List);
		retrieveTextAttribute(locators.EmailBusiness);
//		retrieveTextAttribute(locators.EmailPersonal);
		retrieveTextAttribute(locators.Email);
		retrieveTextAttribute(locators.EmailDelete);
		retrieveTextAttribute(locators.EmailPreferred);
	}
	
//	 *  Verify fields displayed on Address
//	 * 
//	 */
	public void Verify_Phone()throws InterruptedException
	{		
		Thread.sleep(3000);
		clickOnElement(locators.PhoneType);
		Thread.sleep(1000);
		retrieveTextAttribute(locators.Phone_Business);
		retrieveTextAttribute(locators.Phone_Mobile);
		retrieveTextAttribute(locators.Phone_BusinessFax);
		retrieveTextAttribute(locators.Phone_BusinessMobile);
		retrieveTextAttribute(locators.Phone_HomeFax);
		retrieveTextAttribute(locators.Phone_Country);
		retrieveTextAttribute(locators.Dialing_Code);
		retrieveTextAttribute(locators.Number);
		retrieveTextAttribute(locators.Phone_Delete);
		retrieveTextAttribute(locators.Phone_Preferred);
	}
	//	 *  Verify fields displayed on Address
//	 * 
//	 */
	public void Verify_Tabs()throws InterruptedException
	{		
		
		retrieveTextAttribute(locators.CaseDetail_Tab);
		retrieveTextAttribute(locators.OriginalCustomerDetails_Tab);
		retrieveTextAttribute(locators.UpdateCustomerDetails_Tab);
	}
	
	public void Title() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Title_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Title_Value);
		
	}
	public void CountryOfBirth() throws InterruptedException 
	{
		Thread.sleep(5000);
		clickOnElement(locators.CountryOfBirth_Type);
		Thread.sleep(3000);
		clickOnElement(locators.CountryOfBirth_Value);
		
	}
	public void MaritualStatus() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.MaritualStatus_Type);
		Thread.sleep(3000);
		clickOnElement(locators.MaritualStatus_Value);
		
	}
	public void SourceOfIncome() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SourceOfIncome_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SourceOfIncome_Value);
		
	}
	public void EmploymentPosition() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.EmploymentPosition_Type);
		Thread.sleep(3000);
		clickOnElement(locators.EmploymentPosition_Value);
		
	}
	public void MaritualContract() throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.MaritualContract_Type);
		Thread.sleep(3000);
		clickOnElement(locators.MaritualContract_Value);
		
	}
	public void CorrespondaneLanguage() throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.CorrespondaneLanguage_Type);
		Thread.sleep(3000);
		clickOnElement(locators.CorrespondaneLanguage_Value);
		
	}
	public void Industry() throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.Industry_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Industry_Value);
		
	}
	public void Gender() throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.Gender_Type);
		Thread.sleep(3000);
		clickOnElement(locators.Gender_Value);
		
	}
	public void AdditionalNames() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AdditionalNames - " + testData.get("AdditionalNames"));
		enterText(locators.AdditionalNames, testData.get("AdditionalNames"), "Enter AdditionalNames");	
	}
	
	public void FirstName() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("FirstName - " + testData.get("FirstName"));
		enterText(locators.FirstName, testData.get("FirstName"), "Enter FirstName");	
	}
	public void Surname() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Surname - " + testData.get("Surname"));
		enterText(locators.Surname, testData.get("Surname"), "Enter Surname");	
	}
	
	public void Initials() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Initials - " + testData.get("Initials"));
		enterText(locators.Initials, testData.get("Initials"), "Enter Initials");	
	}
	
	public void DateOfBirth() throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.DateOfBirth_Type);
		Thread.sleep(3000);
		clickOnElement(locators.DateOfBirth_Value);
		
	}
}

