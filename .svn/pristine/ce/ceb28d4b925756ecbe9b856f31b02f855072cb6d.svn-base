package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.ChangeStatus_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class ChangeStatus extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	ChangeStatus_Locators locators;
	String error = "";
	String caseNO = "";
	
	public ChangeStatus(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new ChangeStatus_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void ChangeMyAgreementReviewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyAgreementReviewLandingScreen);
		
	}

	public void ChangeMyAgreementLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyAgreementLandingScreen);
		
	}
	
	public void ChangeMyPaymentReviewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyPaymentReviewLandingScreen);
		
	}
	
	
	public void ChangeMyPaymentDetailsLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyPaymentDetailsLandingScreen);
		
	}
	
	
	public void ChangeIncomeReviewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeIncomeReviewLandingScreen);
		
	}
	
	public void ChangeIncomeDetailLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeIncomeDetailLandingScreen);
		
	}
	
	public void ChangeAgreementReviewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeAgreementReviewLandingScreen);
		
	}
	
	
	public void ChangeAgreementLandingPage() {		

		caseNO = retrieveTextAttribute(locators.ChangeAgreementLandingPage);
		
	}
	
	
	public void ChangePremiumReviewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangePremiumReviewLandingScreen);
		
	}
	
	
	public void ChangePremiumDetailLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangePremiumDetailLandingScreen);
		
	}

	
	public void ChangePaymentDetailReiewLandingScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangePaymentDetailReiewLandingScreen);
		
	}
	
	public void ChangeMyPaymentDetailScreen() {		

		caseNO = retrieveTextAttribute(locators.ChangeMyPaymentDetailScreen);
		
	}
	
	
	public void Change_Payment_Detail() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Change_Payment_Detail);
		clickOnElement(locators.Change_Payment_Detail);
		
	}
	
	public void NextButon() throws InterruptedException 
	{
		Thread.sleep(6000);
		waitForElementToAppear(locators.NextButon);
		clickOnElement(locators.NextButon);
		
	}
	
	public void Stop_Order() throws InterruptedException
	{
		Thread.sleep(7000);
//		waitForElementToAppear(locators.Stop_Order);
		 checkIfSelectedanSelect(locators.Stop_Order);
		 clickOnElement(locators.Stop_Order );
		 
	}


	public void Details_Change() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Details_Change);
		System.out.println("Details_Change - " + testData.get("Details_Change"));
		enterText(locators.Details_Change, "Change my payment details", "Enter Details_Change");
		
	}
	

	public void Next() throws InterruptedException 
	{
		Thread.sleep(2000);;
		waitForElementToAppear(locators.Next);
		clickOnElement(locators.Next);
		
	}
	
	
	public void SignDocument() throws InterruptedException
	{
		Thread.sleep(6000);
//		waitForElementToAppear(locators.SignDocument);
		 checkIfSelectedanSelect(locators.SignDocument);
		 clickOnElement(locators.SignDocument );
		
	}
//	
	
	public void FormLink() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.FormLink);
//		 checkIfSelectedanSelect(locators.SignDocument);
		 clickOnElement(locators.FormLink );
		 
	}
	
	public void ChangeMyIntermediary() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeMyIntermediary);
		clickOnElement(locators.ChangeMyIntermediary);

	}
	
	public void UpdateDetailLink() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeMyIntermediary);
		clickOnElement(locators.UpdateDetailLink);

	}
	

	public void IntermediaryLink() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.IntermediaryLink);
		clickOnElement(locators.IntermediaryLink);
		
	}
	
	public void IntermediaryNext() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.IntermediaryNext);
		clickOnElement(locators.IntermediaryNext);
		
	}
	
	public void Change_Premium_Detail() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Change_Premium_Detail);
		clickOnElement(locators.Change_Premium_Detail);
	}
	
	public void DeferPaymentSelect() throws InterruptedException 
	{
		Thread.sleep(3000);;
//		waitForElementToAppear(locators.DeferPaymentSelect);
		clickOnElement(locators.DeferPaymentSelect);
	}
	
	public void ChangeDetail() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ChangeDetail);
		System.out.println("ChangeDetail - " + testData.get("ChangeDetail"));
		enterText(locators.ChangeDetail, "Stop paying premium", "Enter ChangeDetail");
	}
	
	public void ManuallySign() throws InterruptedException 
	{
		Thread.sleep(5000);
//		waitForElementToAppear(locators.ManuallySign);
		clickOnElement(locators.ManuallySign);
		
	}
	public void Arrear_Premium_Collection() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Arrear_Premium_Collection);
		clickOnElement(locators.Arrear_Premium_Collection);
		
	}
	public void Select_Premium() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Select_Premium);
		clickOnElement(locators.Select_Premium);
		
	}
	

	public void How_To_Pay_Arrears() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.How_To_Pay_Arrears);
		clickOnElement(locators.How_To_Pay_Arrears);
		
	}
	public void When_To_Pay_Arrears() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.When_To_Pay_Arrears);
		clickOnElement(locators.When_To_Pay_Arrears);
		
	}
	public void Account_Belong_To_Policy() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Account_Belong_To_Policy);
		clickOnElement(locators.Account_Belong_To_Policy);
		
	}
	
	public void Create_Bank() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Create_Bank);
		clickOnElement(locators.Create_Bank);
		
	}
	public void Selected_Bank() throws InterruptedException 
	{

		Thread.sleep(3000);
//		waitForElementToAppear(locators.Bank_Type);
		clickOnElement(locators.Bank_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Bank_Value);
		clickOnElement(locators.Bank_Value);
		
	}
	public void Select_Account_Type() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Select_Account_Type);
		clickOnElement(locators.Account_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Select_Account_Value);
		clickOnElement(locators.Select_Account_Value);
		
	}
	public void Account_Number() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Account_Number);
		System.out.println("Account_Number - " + testData.get("Account_Number"));
		enterValidationText(locators.Account_Number, "0123456789", "Enter Account_Number");
		
	
	}
	public void AcountHolder() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Account_Holder);
		System.out.println("AcountHolder - " + testData.get("AcountHolder"));
		enterValidationText(locators.AcountHolder, "Clement Appoles", "Enter AcountHolder");
	}
	public void ValidateButton() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ValidateButton);
		clickOnElement(locators.ValidateButton);
		
	}
	public void Reinstate_My_Contract() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Reinstate_My_Contract);
		clickOnElement(locators.Reinstate_My_Contract);
		
	}
	
	public void Payment_Method() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Payment_Method_Type);
		clickOnElement(locators.Payment_Method_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Payment_Method_Value);
		clickOnElement(locators.Payment_Method_Value);
		
	}
	public void Select_Reinstate_Box() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Select_Reinstate_Box);
		clickOnElement(locators.Select_Reinstate_Box);
		
	}
	public void Deduction_Day() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Deduction_Day);
		System.out.println("Deduction_Day - " + testData.get("Deduction_Day"));
		enterText(locators.Deduction_Day, "15", "Enter Deduction_Day");
	}
	
	public void Change_Shown_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Change_Shown_Button);
		clickOnElement(locators.Change_Shown_Button);
		
	}
	
	public void Selected_Agreement() throws InterruptedException 
	{
		Thread.sleep(3000);
		waitForElementToAppear(locators.Selected_Agreement);
		clickOnElement(locators.Selected_Agreement);
		
	}
	
	public void Details_Ragarding_Change() throws InterruptedException 
	{
		Thread.sleep(4000);
		waitForElementToAppear(locators.Details_Ragarding_Change);
		System.out.println("Details_Ragarding_Change - " + testData.get("Details_Ragarding_Change"));
		enterText(locators.Details_Ragarding_Change, "painfull", "Enter Details_Ragarding_Change");
	}
	
	public void Change_Shown() throws InterruptedException 
	{
		Thread.sleep(8000);
//		waitForElementToAppear(locators.Change_Shown);
		clickOnElement(locators.ChangeShown_RadioBtn);
		
	}
	
	public void Change_My_Agreement() throws InterruptedException 
	{
		Thread.sleep(4000);
		clickOnElement(locators.Change_My_Agreement);
	}
	public void Change_My_Income_Detail() throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementToAppear(locators.Change_My_Income_Detail);
		clickOnElement(locators.Change_My_Income_Detail);
		
	}
	public void Change_My_Security_Cession_Details_NGP() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Change_My_Security_Cession_Details_NGP);
		clickOnElement(locators.Change_My_Security_Cession_Details_NGP);
		
	}
	
	
	public void SelectedAgreement() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Change_My_Security_Cession_Details_NGP);
		clickOnElement(locators.SelectedAgreement);
		
	}
	
	
	
	public void Security_Cession_Select_Box() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Security_Cession_Select_Box);
		clickOnElement(locators.Security_Cession_Select_Box);
		
	}
	public void Add_Person_Btn() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Add_Person_Btn);
		clickOnElement(locators.Add_Person_Btn);
		
	}
	public void Add_Person_Link() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Add_Person_Link);
		clickOnElement(locators.Add_Person_Link);
		
	}
	public void Select_Title() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Select_Title_Type);
		clickOnElement(locators.Select_Title_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Select_Title_Value);
		clickOnElement(locators.Select_Title_Value);
		
	}
	public void Surname_Box() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Surname_Box);
		System.out.println("Surname_Box - " + testData.get("Surname_Box"));
		enterText(locators.Surname_Box, "Appoles", "Enter Surname_Box");
		Thread.sleep(3000);
	}
	public void Name_Box() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Name_Box);
		System.out.println("Name_Box - " + testData.get("Name_Box"));
		enterText(locators.Name_Box, testData.get("Name_Box"), "Enter Name_Box");
		
	}
	public void Add_Identification_Btn() throws InterruptedException 
	{
	Thread.sleep(2000);
//		waitForElementToAppear(locators.Add_Identification_Btn);
		clickOnElement(locators.Add_Identification_Btn);
		
	}
	public void Select_ID() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Select_ID_Type);
		clickOnElement(locators.Select_ID_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Select_ID_Value);
		clickOnElement(locators.Select_ID_Value);
		
	}
	
	public void ID_Number() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.ID_Number);
		System.out.println("ID_Number - " + testData.get("ID_Number"));
		enterText(locators.ID_Number, "9302055103080", "Enter ID_Number");
	}
	public void ID_Country() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ID_Country_Type);
		clickOnElement(locators.ID_Country_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.ID_Country_Value);
		clickOnElement(locators.ID_Country_Value);
		
	}
	public void Expiry_Date() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Expiry_Date_Type);
		clickOnElement(locators.Expiry_Date_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Expiry_Date_Value);
		clickOnElement(locators.Expiry_Date_Value);
		
	}
	public void Change_My_Beneficiary_Detail_Link() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Change_My_Beneficiary_Detail_Link);
		clickOnElement(locators.Change_My_Beneficiary_Detail_Link);
		
	}
	public void Select_Change_My_Beneficiary_Detail() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Select_Change_My_Beneficiary_Detail);
		clickOnElement(locators.Select_Change_My_Beneficiary_Detail);
		
	}
	public void Add_Beneficiary_Person_Button() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Add_Beneficiary_Person_Button);
		clickOnElement(locators.Add_Beneficiary_Person_Button);
		
	}
	public void Click_Update_Details() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Click_Update_Details);
		clickOnElement(locators.Click_Update_Details);
		
	}
	public void Capture_FirstName() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Capture_FirstName);
		System.out.println("Capture_FirstName - " + testData.get("Capture_FirstName"));
		enterText(locators.Capture_FirstName, "Abongile", "Enter Capture_FirstName");
	}
	
	public void Capture_LastName() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Capture_LastName);
		System.out.println("Capture_LastName - " + testData.get("Capture_LastName"));
		enterText(locators.Capture_LastName, "Maso", "Enter Capture_LastName");
	}
	public void Capture_SharePercentage() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Capture_SharePercentage);
		System.out.println("Capture_SharePercentage - " + testData.get("Capture_SharePercentage"));
		enterText(locators.Capture_SharePercentage, "50", "Enter Capture_SharePercentage");
	}
	
//	public void SelectTitle() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		clickOnElement(locators.SelectTitle_Type);
//		Thread.sleep(3000);
//		clickOnElement(locators.SelectTitle_Value);
//		
//	}
	public void SelectGender() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectGender_Type);
		clickOnElement(locators.SelectGender_Type);
	Thread.sleep(4000);
//		waitForElementToAppear(locators.SelectGender_Value);
		clickOnElement(locators.SelectGender_Value);
		
	}
	public void CaptureDateOfBirth() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.CaptureDateOfBirth_Type);
		clickOnElement(locators.CaptureDateOfBirth_Type);
		Thread.sleep(4000);
//		waitForElementToAppear(locators.CaptureDateOfBirth_Value);
		clickOnElement(locators.CaptureDateOfBirth_Value);
		
	}
	public void Initial() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Initial);
		System.out.println("Initial - " + testData.get("Initial"));
		enterText(locators.Initial,"M", "Enter Initial");	
	}
	public void Country() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Country_Type);
		clickOnElement(locators.Country_Type);
		Thread.sleep(4000);
//		waitForElementToAppear(locators.ID_Country_Value);
		clickOnElement(locators.ID_Country_Value);
		
	}
	
	public void Verify_RelationType()throws InterruptedException
	{		
		
		retrieveTextAttribute(locators.Verify_RelationType);
	}
	
	public void AddPhone() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.AddPhone);
		clickOnElement(locators.AddPhone);
		
	}
	
	public void SelectPhone() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Phone_Type);
		clickOnElement(locators.Phone_Type);
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Phone_Value);
		clickOnElement(locators.Phone_Value);
		

	}
	public void EnterNumber() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.EnterNumber);
		System.out.println("EnterNumber - " + testData.get("EnterNumber"));
		enterText(locators.EnterNumber,"0722418883", "Enter EnterNumber");	
		

	}
	
	public void PreferredSelected() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.PreferredSelected);
		clickOnElement(locators.PreferredSelected);
		
	}
	public void Capture_New_Bank_Details() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Capture_New_Bank_Details);
		clickOnElement(locators.Capture_New_Bank_Details);
		
	}
	
	public void BankName() throws InterruptedException 
	{

		Thread.sleep(3000);
//		waitForElementToAppear(locators.Bank_Type);
		clickOnElement(locators.BankName_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Bank_Value);
		clickOnElement(locators.Bank_Value);
		
	}
	public void Account() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Account_Type);
		clickOnElement(locators.AcountType);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Select_Account_Value);
		clickOnElement(locators.Select_Account_Value);
		
	}
	
	public void AccountNumber() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Account_Number);
		System.out.println("AccountNumber - " + testData.get("AccountNumber"));
		enterValidationText(locators.AccountNumber,"123456789", "Enter AccountNumber");	
	}
	public void Account_Holder() throws InterruptedException
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Account_Holder);
		System.out.println("Account_Holder - " + testData.get("Account_Holder"));
		enterValidationText(locators.Account_Holder,"T TEST", "Enter Account_Holder");	
	}
	public void SelectCountry() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.SelectCountry_Type);
		clickOnElement(locators.SelectCountry_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectCountry_Value);
		clickOnElement(locators.SelectCountry_Value);
		
	}
	public void Account_Belong_To_Policy_Owner() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Account_Belong_To_Policy_Owner);
		clickOnElement(locators.Account_Belong_To_Policy_Owner);
	}
	public void AddPremiumPayerPerson_Button() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.AddPremiumPayerPerson_Button);
		clickOnElement(locators.AddPremiumPayerPerson_Button);
	}
	public void PersonTitle() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.PersonTitle_Type);
		clickOnElement(locators.PersonTitle_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Select_Title_Value);
		clickOnElement(locators.Select_Title_Value);
		
	}
	public void Person_FirstName() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_FirstName);
		System.out.println("Person_FirstName - " + testData.get("Person_FirstName"));
		enterText(locators.Person_FirstName,"Clementine", "Enter Person_FirstName");
		
	}
	public void Person_Surname() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Person_Surname - " + testData.get("Person_Surname"));
		enterText(locators.Person_Surname,"Abu", "Enter Person_Surname");
		
	}
	public void PersonGender() throws InterruptedException 
	{
	Thread.sleep(2000);
//		waitForElementToAppear(locators.PersonGender_Type);
		clickOnElement(locators.PersonGender_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.SelectGender_Value);
		clickOnElement(locators.SelectGender_Value);
		
	}
	
	public void PersonCountry() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.PersonCountry_Type);
		clickOnElement(locators.PersonCountry_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.PersonCountry_Value);
		clickOnElement(locators.PersonCountry_Value);
		
	}
	public void PersonSourceOfIncome() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.PersonSourceIncome_Type);
		clickOnElement(locators.PersonSourceIncome_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.PersonSourceIncome_Value);
		clickOnElement(locators.PersonSourceIncome_Value);
		
	}
	public void Relationship() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Relationship_Type);
		clickOnElement(locators.Relationship_Type);
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Relationship_Value);
		clickOnElement(locators.Relationship_Value);
		
	}
	public void AddEmail() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.AddEmail);
		clickOnElement(locators.AddEmail);
		
	}
	public void ChangeStatus_NextButon() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeStatus_NextButon);
		
	}
	
	public void ChangeStatus_SaveButton() throws InterruptedException 
	{
		Thread.sleep(6000);
		clickOnElement(locators.ChangeStatus_SaveButton);
		
	}

	public void Reinstate_AccountType() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Reinstate_AccountType);
		Thread.sleep(1000);
		clickOnElement(locators.Select_Account_Value);
	}
	
	

	public void SaveBtn() throws InterruptedException 
	{
		Thread.sleep(2000);
		clickOnElement(locators.SaveBtn);
	}

	public void SelectAccountType() throws InterruptedException 
	{
		Thread.sleep(2000);
		clickOnElement(locators.SelectAccountType);
		Thread.sleep(1000);
		clickOnElement(locators.Select_Account_Value);
	}
	
	public void Cession_SelectID() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Cession_SelectIDType);
		Thread.sleep(1000);
		clickOnElement(locators.Select_ID_Value);
	}
	
	
	public void Cession_IDNumber() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Cession_IDNumber - " + testData.get("Cession_IDNumber"));
		enterText(locators.Cession_IDNumber,"9302055103080", "Enter Cession_IDNumber");
		
	}
	
	public void Cession_IDCountry() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Cession_IDCountryType);
		Thread.sleep(1000);
		clickOnElement(locators.ID_Country_Value);
	}
	
	public void Cession_ExpiryDate() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Cession_ExpiryDateType);
		Thread.sleep(1000);
		clickOnElement(locators.Expiry_Date_Value);
		Thread.sleep(2000);
	}
	
	
	
	public void Reinstate_AcountHolder() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Reinstate_AcountHolder - " + testData.get("Reinstate_AcountHolder"));
		enterText(locators.Reinstate_AcountHolder,"T Test", "Enter Reinstate_AcountHolder");
		
	}
	
	
	
	
	public void Reinstate_AccountNumber() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Reinstate_AccountNumber - " + testData.get("Reinstate_AccountNumber"));
		enterText(locators.Reinstate_AccountNumber,"0123456789", "Enter Reinstate_AccountNumber");
		
	}
	
	public void Person_Number() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Person_Number - " + testData.get("Person_Number"));
		enterText(locators.Person_Number,"0533038981", "Enter Person_Number");
		
	}
	
	public void Person_Type() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Person_PhoneType);
		Thread.sleep(1000);
		clickOnElement(locators.Person_PhoneValue);
	}
	
	public void Person_Country() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Person_CountryType);
		Thread.sleep(1000);
		clickOnElement(locators.Person_CountryValue);
	}
	 
	 
	
	public void EMailType() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.EMailType);
		Thread.sleep(1000);
		clickOnElement(locators.EMailTypeValue);
	}
	
	
	public void EmailAdress() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("EmailAdress - " + testData.get("EmailAdress"));
		enterText(locators.EmailAdress,"clement@gmail.com", "Enter EmailAdress");
		
	}
	public void Add_AddressBtn() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Add_AddressBtn);
	}
	
	public void AddressType() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.AddressType);
		Thread.sleep(1000);
		clickOnElement(locators.AddressSelectedValue);
	}
	
	public void Line1_Adress() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("Line1_Adress - " + testData.get("Line1_Adress"));
		enterText(locators.Line1_Adress,"43 Nyasa Road", "Enter Line1_Adress");
		
	}
	
	public void AdressCountry() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.AdressCountryType);
		Thread.sleep(1000);
		clickOnElement(locators.AdressCountryValue);
	}
	
	public void PostalCode() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("PostalCode - " + testData.get("PostalCode"));
		enterText(locators.PostalCode,"8301", "Enter PostalCode");
		
	}
	
	
	public void NewAccountNumber() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("NewAccountNumber - " + testData.get("NewAccountNumber"));
		enterText(locators.NewAccountNumber,"0123456789", "Enter NewAccountNumber");
		
	}
	
	public void NewAccount_Holder() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("NewAccount_Holder - " + testData.get("NewAccount_Holder"));
		enterText(locators.NewAccount_Holder,"Test", "Enter NewAccount_Holder");		
	}
	
	public void NewAccount() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.NewAccount);
		Thread.sleep(1000);
		clickOnElement(locators.Select_Account_Value);
	}
	
	public void NewBankName() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.NewBankName);
		Thread.sleep(1000);
		clickOnElement(locators.Bank_Value);
	}
	
	public void ChangePersonalDetaiils() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangePersonalDetaiils);
	}
	
	
	public void ChangePersonalDetaiilsScreen() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.ChangePersonalDetaiilsScreen);	
	}
	
	public void ChangePhoneNo() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("ChangePhoneNo - " + testData.get("ChangePhoneNo"));
		enterText(locators.ChangePhoneNo,"0722418883", "Enter ChangePhoneNo");		
	}
	
	public void ChangeBankingDetailsLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeBankingDetailsLink);
	}
	public void SelectBox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectBox);
	}
	public void DeductDay() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("DeductDay - " + testData.get("DeductDay"));
		enterText(locators.DeductDay,"1", "Enter DeductDay");		
	}
	
	public void Banks() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.BankValue);
		Thread.sleep(1000);
		clickOnElement(locators.Bank_Value);
	}
	public void NewAccountType() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.NewAccountType);
		Thread.sleep(1000);
		clickOnElement(locators.Select_Account_Value);
	}
	
	public void AccountNumbers() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("AccountNumbers - " + testData.get("AccountNumbers"));
		enterText(locators.AccountNumbers,"0123456789", "Enter AccountNumbers");		
	}
	
	
	public void AccountHolders() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("AccountHolders - " + testData.get("AccountHolders"));
		enterText(locators.AccountHolders,"Test", "Enter AccountHolders");		
	}

	
	
	public void SwitchMyFundsCheckBox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SwitchMyFundsCheckBox);
	}
	
	public void CaptureFullDetails() throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Person_Surname);
		System.out.println("CaptureFullDetails - " + testData.get("CaptureFullDetails"));
		enterText(locators.CaptureFullDetails,"Test", "Enter CaptureFullDetails");		
	}
	
	public void VerifyText() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyText1,"Please note that if multiple policy owners exist on any of the selected policy/ies, the request will require multiple signatures.");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyText2,"Please note that if the customer is unable to sign, please print the form and place customer's thumbprint in place of the signature along with 2 signatures of branch staff as witnesses.");		
	}
	

	public void PassportID() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.PassportIDType);
		Thread.sleep(1000);
		clickOnElement(locators.PassportIDValue);
	}
	
	public void ChangeMyPolicyOwnerLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeMyPolicyOwnerLink);
	}
	
	public void ChangeMyPolicyOwnerSelectBox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeMyPolicyOwnerSelectBox);
	}
	
	

	public void TextVerify() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.TextVerify,"Please complete the transfer of ownership form as per link provided on the next screen.  Please note that the contracting party is ceding all rights, title and interest in the policy/agreement to the cessionary/new owner. Once the Contracting Party Transfers ownership, the cession cannot be cancelled. The new owner would need to transfer ownership back to the original owner. ");
}
	
	public void AgreementReviewScreen() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.AgreementReviewScreen);	
	}
	
	public void CessionChangeRequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.CessionChangeRequest,"Cession change request.pdf");
		}
		
	
	public void Requirement() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.ChangeRequest,"Cession change request");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.SupportingEvidence,"Supporting evidence - Change status");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.TransferOfOwnership,"Transfer of ownership");
		}
	
	
	public void ChangeMyCorrespondanceLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeMyCorrespondanceLink);
	}
	
	public void SelectCorrespondanceBox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectCorrespondanceBox);
	}
	
	public void SelectCorrespondent() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectCorrespondent);
	}	
	
	public void ChangeMyIntermediaryScreen() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.ChangeMyIntermediaryScreen);	
	}
		
	public void CorrespondanceText() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.AdditionalText,"Additional forms are required to be completed, please see form links provided.");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.PleaseNoteText,"Please note that if the customer is unable to sign, please print the form and place customer's thumbprint in place of the signature along with 2 signatures of branch staff as witnesses.");
		}
	
	
	public void FormLinks() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.FormLinks,"Advisor Appointment Note (AAN)");
		}	
	public void ResolutionsEmail() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.ResolutionsEmail,"Resolution email required");
		}
	
	public void Documets() throws InterruptedException {		

		Thread.sleep(2000);
		retrieveTextAndCompare(locators.ANN,"Advisor Appointment Note (AAN)");
		Thread.sleep(2000);
		retrieveTextAndCompare(locators.TransactionSummary,"Transaction summary");
		}
	
	
	public void SelectDeferMyPremium() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectDeferMyPremium);
	}
	
	public void VerifyCaptureBox() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyCaptureBox,"Please capture full details regarding the change - Affordability options");
		}
	
	public void CaptureInstruction() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("CaptureInstruction - " + testData.get("CaptureInstruction"));
		enterText(locators.CaptureInstruction, "Change my payment details", "Enter CaptureInstruction");
//		enterText(locators.CaptureInstruction, , "Enter CaptureInstruction");	
	}
	
	public void MandatoryRequirements() throws InterruptedException {		

		Thread.sleep(2000);
		retrieveTextAndCompare(locators.SupportingEvidence,"Supporting evidence - Change status");
		Thread.sleep(2000);
		retrieveTextAndCompare(locators.PremiumDeferalRequest,"Premium deferral request");
		Thread.sleep(2000);
//		retrieveTextAndCompare(locators.SupportingEvidenceMoneyOut,"Supporting evidence - Money out");
		}
	
	
	public void StopPayingPremiumsPaidUp() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.StopPayingPremiumsPaidUp);
	}
	
	public void PaidUprequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.PaidUprequest,"Paid up request.pdf");
		}
	
	public void ChangeMyAnnualIncreaseTickBox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ChangeMyAnnualIncreaseTickBox);
	}
	
	
	public void VerifyPleaseCapure() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyPleaseCapure,"Please capture full details regarding the change - Manage annual increases");
		}
	
	public void InputDetails() throws InterruptedException 
	{
		Thread.sleep(6000);
		System.out.println("InputDetails - " + testData.get("InputDetails"));
		enterText(locators.InputDetails, "Change my payment details", "Enter InputDetails");
//		enterText(locators.CaptureInstruction, , "Enter CaptureInstruction");	
	}
	
	
	public void VerifyAnnualIncreaseRequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyAnnualIncreaseRequest,"Annual Increase Change request.pdf");
		}
	
	public void ViewRequirements() throws InterruptedException {		

		Thread.sleep(2000);
		retrieveTextAndCompare(locators.SupportingEvidence,"Supporting evidence - Change status");
		Thread.sleep(2000);
		retrieveTextAndCompare(locators.AnnualIncrease,"Annual increase change request");
		Thread.sleep(2000);
//		retrieveTextAndCompare(locators.SupportingEvidenceMoneyOut,"Supporting evidence - Money out");
		}
	
	
	
	public void RequireChangeNotShownAbove() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.RequireChangeNotShownAbove);
	}
	public void SelctOtherAgreement() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelctOtherAgreement);
	}
	
	
	public void VerifyOtherPaymentsChangeRequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyOtherPaymentsChangeRequest,"Other Payments Change request.pdf");
		}
	
	
	public void VerifyRequirements() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.SupportingEvidence,"Supporting evidence - Change status");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.PaymentDetailChangeRequest,"Payment details change request");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.DeductionMandate,"Stop order/salary deduction mandate");
		}
	
	
	public void SelectChangeMyStopOrder() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectChangeMyStopOrder);
	}
	
	
	public void VerifyPaymentDetailsChangeRequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyPaymentDetailsChangeRequest,"Payment details change request.pdf");
		}
	
	
	
	public void Descriptions() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.StopOrderMandateFrom,"Stop order mandate form");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.StopOrdeNeedsAnalysisFrom,"Stop order needs analysis form");
		}
	
	public void ViewRequirement() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.SupportingEvidence,"Supporting evidence - Change status");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.ProofOfStop,"Proof of stop order change");
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.DeductionMandate,"Stop order/salary deduction mandate");
		}
	
	public void ExpandTaxSection() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ExpandTaxSection);
	}
	public void DeleteTaxDetails() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.DeleteTaxDetails);
	}
	
	public void DecreasePremiumDetailsLink() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.DecreasePremiumDetailsLink);
	}
	
	public void SelectDebitOrder() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectDebitOrder);
	}
	public void NewPremium()
	{
		enterValidationText(locators.NewPremium, "25", "Enter NewPremium");
	}
	
	public void SelectMethodOfPayment() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectMethodOfPayment);
	}
	
	public void SalaryReferanceNo()
	{
		enterText(locators.SalaryReferanceNo, "473215", "Enter SalaryReferanceNo");
	}
	
	public void PayOfficeCode()
	{
		enterText(locators.PayOfficeCode, "MY", "Enter PayOfficeCode");
	}
	
	public void PayOfficeName()
	{
		enterText(locators.PayOfficeName, "sars", "Enter PayOfficeName");
	}
	public void PayOfficeAdress()
	{
		enterText(locators.PayOfficeAdress, "14 maureen", "Enter PayOfficeAdress");
	}
	public void PayOfficePostalCode()
	{
		enterText(locators.PayOfficePostalCode, "8301", "Enter PayOfficeName");
	}
	public void VerifyVCArequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyVCArequest,"2-in-One VCA request.pdf");		
	}
	
	public void AdressSelect() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.AdressSelect);
	}
	public void MobileSelect() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.MobileSelect);
	}
	
	public void SelectPaidUpBoolean() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectPaidUpBoolean);
	}
	
	public void VerifyPaidUpRequest() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.VerifyPaidUpRequest,"Paid up request.pdf");		
	}
	public void SelectChangeFromStopOrderToDebitLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectChangeFromStopOrderToDebitLink);
	}
	
	public void SelectBooleanStopOrderToDebit() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectBooleanStopOrderToDebit);
	}
	public void DeductionDay()
	{
		enterText(locators.DeductionDay, "1", "Enter DeductionDay");
	}
	
	public void AccountTypeDrpDwn() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.AccountTypeDrpDwn);
		Thread.sleep(1000);
		clickOnElement(locators.Select_Account_Value);
	}
	public void ClickSaveBtn() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.ClickSaveBtn);
	}
	
	public void SelectDecreaseMtPremiumDetailsLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectDecreaseMtPremiumDetailsLink);
	}
	public void SelectDebitOrderBoolean() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SelectDebitOrderBoolean);
	}
	
}

