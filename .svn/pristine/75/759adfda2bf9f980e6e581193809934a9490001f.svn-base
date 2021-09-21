package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.Claims_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class Claims extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	Claims_Locators locators;
	String error = "";
	String caseNO = "";
	
	public Claims(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new Claims_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void I_Need_To_Claim() throws InterruptedException 
	{   
		Thread.sleep(6000);
		clickOnElement(locators.I_Need_To_Claim);
//		waitForElementToAppear(locators.I_Need_To_Claim );
	}
	public void SelectClaim() throws InterruptedException 
	
	{ 
		Thread.sleep(3000);
		clickOnElement(locators.SelectClaim_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectClaim_Value);
		
	}
	
public void SelectClaimToIllness() throws InterruptedException 
	
	{ 
		Thread.sleep(6000);
		clickOnElement(locators.SelectClaim_Type);
		Thread.sleep(3000);
		clickOnElement(locators.SelectClaimToIllnessValue);
		
	}
	
    public void DateOfDisability() throws InterruptedException 
	{ 
		Thread.sleep(3000);
		clickOnElement(locators.DateOfDisability_Type);
		Thread.sleep(3000);
		clickOnElement(locators.DateOfDisability_Value);
		}

	public void DetailsOfDisability() 
	{
		System.out.println("DetailsOfDisability - " + testData.get("DetailsOfDisability"));
		enterText(locators.DetailsOfDisability, "fracturedBone", "Enter DetailsOfDisability");
	}
	public void LifeCoveredSelected() throws InterruptedException 
	
	{ 
		Thread.sleep(3000);
		clickOnElement(locators.LifeCoveredSelected);
	}
	public void ManuallySigned() throws InterruptedException 
	
	{ 
		Thread.sleep(6000);
		clickOnElement(locators.ManuallySigned);
	}
	
	 public void ClaimType_Drp() throws InterruptedException 
		{ 
			Thread.sleep(5000);
			clickOnElement(locators.ClaimType);
			Thread.sleep(1000);
			clickOnElement(locators.ClaimValue);
			}
	 public void DeathCertificateAvailable() throws InterruptedException 		
		{ 
			Thread.sleep(1000);
			clickOnElement(locators.DeathCertificateAvailable);
		}
	 
	 public void SelectLifeCovered() throws InterruptedException 		
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.SelectLifeCovered);
		}
	 public void DeceasedIDNumber() throws InterruptedException, AWTException
		{
		Thread.sleep(6000);
			System.out.println("DeceasedIDNumber - " + testData.get("DeceasedIDNumber"));
//			enterText(locators.DeceasedIDNumber, testData.get("DeceasedIDNumber"), "Enter DeceasedIDNumber");	
			enterValidationText(locators.DeceasedIDNumber, "5009045103080", "Enter DeceasedIDNumber");
//			clickOnElement(locators.DeceasedIDNumber);
		}
	 
	 public void AllFields() {
		 enterText(locators.DeceasedIDNumber, "5009245000000", "Enter DeceasedIDNumber");
		 enterText(locators.DeceasedSurname, "JOK", "Enter DeceasedSurname");
		 enterText(locators.DeceasedFirstName, "HENDRI", "Enter DeceasedFirstName");
		 enterText(locators.DeceasedPlaceOfDeath, "homes", "Enter DeceasedPlaceOfDeath");
	 }
	 
	 public void DeceasedSurname() throws AWTException
		{
			System.out.println("DeceasedSurname - " + testData.get("DeceasedSurname"));
			enterValidationText(locators.DeceasedSurname, "JOKA", "Enter DeceasedSurname");
				
		}
	 
	 
	 public void DeceasedFirstName() throws AWTException
		{
			System.out.println("DeceasedFirstName - " + testData.get("DeceasedFirstName"));
			enterValidationText(locators.DeceasedFirstName, "HENDRIK", "Enter DeceasedFirstName");
			
		}
	 public void DeceasedPlaceOfDeath() 
		{
			System.out.println("DeceasedPlaceOfDeath - " + testData.get("DeceasedPlaceOfDeath"));
			enterValidationText(locators.DeceasedPlaceOfDeath, "home", "Enter DeceasedPlaceOfDeath");
		}
	 
	 public void DeceasedDOB() throws InterruptedException 
	{ 
			Thread.sleep(5000);
			clickOnElement(locators.DeceasedDOB_Type);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedDOB_Year);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedDOB_Month);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedDOB_Day);
	}
	 public void DeceasedGender() throws InterruptedException 
		{ 
		
			clickOnElement(locators.DeceasedGender_Type);
			clickOnElement(locators.DeceasedGender_Value);
//			AllFields();
		}
	 
	 public void CauseOfDeath() throws InterruptedException 
		{ 
			Thread.sleep(1000);
			clickOnElement(locators.CauseOfDeath_Type);
			Thread.sleep(1000);
			clickOnElement(locators.CauseOfDeath_Value);
		}
	 
	 public void DateOfDeath() throws InterruptedException 
		{ 
				Thread.sleep(1000);
				clickOnElement(locators.DateOfDeath_Type);
				Thread.sleep(1000);
				clickOnElement(locators.YearOfDeath);
				Thread.sleep(1000);
				clickOnElement(locators.DeceasedDOB_Month);
				Thread.sleep(1000);
				clickOnElement(locators.DeceasedDOB_Day);
		}
	 
	 public void DeceasedMaritualStatus() throws InterruptedException 
		{ 
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedMaritualStatus_Type);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedMaritualStatus_Value);
		}
	 
	 public void IsDeathCertificateHandwritten() throws InterruptedException 		
		{ 
			Thread.sleep(1000);
			clickOnElement(locators.IsDeathCertificateHandwritten);
		}
	 
	 public void RelationshipTopolicyHolder() throws InterruptedException 
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.RelationshipTopolicyHolder_Type);
			Thread.sleep(3000);
			clickOnElement(locators.RelationshipTopolicyHolder_Value);
		}
	 public void DateOfFuneral() throws InterruptedException 
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.DateOfFuneral_Type);
			Thread.sleep(1000);
			clickOnElement(locators.YearOfDeath);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedDOB_Month);
			Thread.sleep(1000);
			clickOnElement(locators.DeceasedDOB_Day);
//			Thread.sleep(3000);
//			clickOnElement(locators.DateOfFuneral_Value);
		}
	 public void DetailsOfDeath() 
		{
			System.out.println("DetailsOfDeath - " + testData.get("DetailsOfDeath"));
			enterValidationText(locators.DetailsOfDeath, "accident", "Enter DetailsOfDeath");
		}
	 
	 public void ReasonForDeath() throws InterruptedException 
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.ReasonForDeath_Type);
			Thread.sleep(3000);
			clickOnElement(locators.ReasonForDeath_Value);
		}
	 
	 public void ReasonForDifferance() throws InterruptedException 
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.ReasonForDifferance_Type);
			Thread.sleep(3000);
			clickOnElement(locators.ReasonForDifferance_Value);
		}
	 
	 public void IConfirmCheckbox() throws InterruptedException 
		{
		 Thread.sleep(3000);
			clickOnElement(locators.IConfirmCheckbox);
		}
	 
	 public void CreatNewBank() throws InterruptedException 
		{
		 
		 Thread.sleep(4000);
		clickOnElement(locators.CreatNewBank);
		}
	 
	 public void BankSelected() throws InterruptedException 
		{
		    Thread.sleep(3000);
			clickOnElement(locators.SelectedBank_Type);
			 Thread.sleep(3000);
				clickOnElement(locators.SelectedBank_Value);
		}
	 public void SelectedAccount() throws InterruptedException 
		{
		    Thread.sleep(3000);
			clickOnElement(locators.SelectedAccount_Type);
			 Thread.sleep(3000);
				clickOnElement(locators.SelectedAccount_Value);
		}
	 public void EnterAccountNumber() 
		{
			System.out.println("EnterAccountNumber - " + testData.get("EnterAccountNumber"));
			enterValidationText(locators.EnterAccountNumber, "123456789", "Enter EnterAccountNumber");
		}
	 public void EnterAccountHolder() 
		{
			System.out.println("EnterAccountHolder - " + testData.get("EnterAccountHolder"));
			enterValidationText(locators.EnterAccountHolder, "T Test", "Enter EnterAccountHolder");
		}
	 public void CountryOfDeath() throws InterruptedException 
		{
		    Thread.sleep(3000);
			clickOnElement(locators.CountryOfDeath_Type);
			 Thread.sleep(3000);
				clickOnElement(locators.CountryOfDeath_Value);
		}
	 
	 public void SelectLifeCoveredNotInList() throws InterruptedException 
		{
		 Thread.sleep(3000);
			clickOnElement(locators.SelectLifeCoveredNotInList);
		}
	 
	 public void ParentChildRelationship() throws InterruptedException 
		{
		    Thread.sleep(3000);
			clickOnElement(locators.ParentChildRelationship_Type);
			 Thread.sleep(3000);
				clickOnElement(locators.ParentChildRelationship_Value);
		}
	 
	 public void IsDeceasedDisabled() throws InterruptedException 
		{
		 Thread.sleep(3000);
			clickOnElement(locators.IsDeceasedDisabled);
		}
	 public void ConfirmRelationshipToPolicyHolder() throws InterruptedException 
		{ 
			Thread.sleep(3000);
			clickOnElement(locators.RelationshipTopolicyHolder_Type);
			Thread.sleep(3000);
			clickOnElement(locators.ConfirmRelationshipTopolicyHolder_Value);
		}
	 
	 public void CreateNewBankDetails() throws InterruptedException 
		{
		 Thread.sleep(6000);

			clickOnElement(locators.CreateNewBankDetails);
			waitForElementToAppear(locators.CreateNewBankDetails);
		}
	 public void CreateNewBank() throws InterruptedException 
		{
		 Thread.sleep(6000);
			clickOnElement(locators.CreateNewBank);	
		}
	 public void Bank() throws InterruptedException 
		{
		 Thread.sleep(8000);
//		 waitForElementToAppear(locators.Bank);
			clickOnElement(locators.Bank);	
		}
	 
	 public void SelectSignDocument() throws InterruptedException 
		{
		 Thread.sleep(8000);
//		 waitForElementToAppear(locators.Bank);
			clickOnElement(locators.SelectSignDocument);	
		}
	 public void ResolutionEmailRequired() throws InterruptedException 
		{
		 Thread.sleep(1000);
//		 waitForElementToAppear(locators.Bank);
			clickOnElement(locators.ResolutionEmailRequired);	
		}
	 
	 public void ButtonNext() throws InterruptedException 
		{
		 Thread.sleep(2000);
			clickOnElement(locators.ButtonNext);	
		}
	 
	 public void SelectClaimTypeAndLifeCoveredScreen() throws InterruptedException 
		{
		 caseNO = retrieveTextAttribute(locators.SelectClaimTypeAndLifeCoveredScreen);
			
		}
	 
	 public void ReviewAndCorrespondance() throws InterruptedException 
		{
			retrieveTextAndCompare(locators.ReviewAndCorrespondance,"Please note that if the customer is unable to sign, please print the form and place customer's thumbprint in place of the signature along with 2 signatures of branch staff as witnesses.");
		}
	 public void LandingPage() {		
			
			caseNO = retrieveTextAttribute(locators.LandingPage);
			
		}
	 public void ClaimFormDetailLandingPage() throws InterruptedException {		
			Thread.sleep(2000);
			caseNO = retrieveTextAttribute(locators.ClaimFormDetailLandingPage);
			
		}
	 public void UpdateLifeCoverScreen() {		
			
			caseNO = retrieveTextAttribute(locators.UpdateLifeCoverScreen);
			
		}
	 
	 
	 public void ClaimantBankDetailPage() {		
			
			caseNO = retrieveTextAttribute(locators.ClaimantBankDetailPage);	
		}
	 public void CovidRelatedText() throws InterruptedException {		

			Thread.sleep(6000);
			retrieveTextAndCompare(locators.CovidRelatedText,"Is this claim related to Covid-19");
			
		}
}
