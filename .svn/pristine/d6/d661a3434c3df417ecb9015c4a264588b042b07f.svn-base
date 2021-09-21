package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.ADHOC_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class ADHOC extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	ADHOC_Locators locators;
	String error = "";
	String caseNO = "";
	
	public ADHOC(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new ADHOC_Locators();
	}

	/*=================================TC_10========================================*/
	
	
	public void NewButton() throws InterruptedException 
	{  
	Thread.sleep(9000);
		clickOnElement(locators.NewButton);
	}
	
	public void Select_CEBADHOC() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.Select_CEBADHOC);
	}
	
	
	public void WorkClasifyScreen() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.WorkClasifyScreen);
		
	}
	
	public void RequestCountryDrp() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.RequestCountryDrp);
	}
	public void ChannelDrp() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ChannelDrp);
	}
	public void OperationsDrp() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.OperationsDrp);
		 Thread.sleep(1000);
			clickOnElement(locators.OperationsValue);
	}
	public void NewComment() throws InterruptedException 
	{   
		Thread.sleep(1000);
		System.out.println("NewComment - " + testData.get("NewComment"));
		enterText(locators.NewComment,"like", "Enter NewComment");
//		enterText(locators.NewComment,testData.get("NewComment"), "Enter NewComment");
	}

	public void Add() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.Add);
	}
	
	public void CommentHistory() throws InterruptedException {		

		Thread.sleep(6000);
		retrieveTextAndCompare(locators.CommentHistory,"Text");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	

	public void IdentifyPartyScreen() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.IdentifyPartyScreen);
		
	}
	public void RequestFromCustomer() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.RequestFromCustomer);
	}
	public void PartyType() throws InterruptedException {		

		Thread.sleep(3000);
		retrieveTextAndCompare(locators.PartyType,"Party Type");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	public void SearchCriteria() throws InterruptedException {		

		Thread.sleep(1000);
		retrieveTextAndCompare(locators.SearchCriteria,"Search Criteria");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	
	public void RequestFromIntermediary() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.RequestFromIntermediary);
	}
	
	
	public void SearchIntermediary() throws InterruptedException {		

		Thread.sleep(1000);
		retrieveTextAndCompare(locators.SalesCode,"Sales code");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Initials,"Initials");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Email,"EMail");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Surname,"Surname/Firm name");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	public void RequestFromExternalContact() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.RequestFromExternalContact);
	}
	
	public void ContactInformation() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ContactInformation);
	}
	
	public void RequestFromInternalContact() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.RequestFromInternalContact);

	}
	
	public void EmailSearch() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.EmailSearch,"Email");
	}
	
	public void ConsumerSearch() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.ConsumerSearch,"Consumer");
	}
	
	
	public void VerifySearchCriteria() throws InterruptedException {		

		Thread.sleep(1000);
		retrieveTextAndCompare(locators.IdentityNumber,"Identity number");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.AgreementNumber,"Agreement number");
		retrieveTextAndCompare(locators.DOB,"Initial, Surname, Date of birth");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.CustomerNumber,"Customer number");
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.CAseNumber,"Case number");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	
	public void EnterIDNo() throws InterruptedException 
	{   
		Thread.sleep(1000);
		System.out.println("EnterIDNo - " + testData.get("EnterIDNo"));
		enterText(locators.EnterIDNo,"7101080257081", "Enter EnterIDNo");
//		enterText(locators.EnterIDNo,testData.get("EnterIDNo"), "Enter EnterIDNo");
	}
	
	public void Search() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.Search);
	}
	
	
	public void SearchResults() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.SearchResults,"ID number");
	}
	public void SelectCustomer() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SelectCustomer);
	}
	
	public void ViewTabs() throws InterruptedException {		

		Thread.sleep(100000);
			retrieveTextAndCompare(locators.Transactions,"Transactions");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.View360, "360 View");
		retrieveTextAndCompare(locators.CustomerDetails,"Customer details");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Request ,"Request");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.CaseDetails,"Case details");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Documents,"Documents / Assistance");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.Comments,"Comments");
//		Thread.sleep(1000);
		retrieveTextAndCompare(locators.RelatedCases,"Related cases");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);		
	}
	
	public void CommentsToRedirectDepartment() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.CommentsToRedirectDepartment,"Comments to redirect department");
	}
	
	
	public void OtherEmail() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.OtherEmail,"Other email");
	}
	
	public void ServiceDeliveryUnit() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.ServiceDeliveryUnit,"Service delivery units");
		Thread.sleep(2000);	
//		retrieveTextAndCompare(locators.DeleteServiceDelivery,"Delete Service delivery units");
		Thread.sleep(2000);	
//		retrieveTextAndCompare(locators.AddServiceDelivery,"Add Service delivery units");
	}
	
	public void SDU() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SDU);
	}
	public void GatherEvidenceRadioButton() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.GatherEvidenceRadioButton);
	}
	
	public void UploadDocument() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.UploadDocument);		
//		Thread.sleep(4000);
//		clickOnElement(locators.ChooseFile);
	}
	public void ClosesButton() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.ClosesButton);
	}
	
	public void Body() throws InterruptedException 
	{   
		Thread.sleep(8000);
		System.out.println("Body - " + testData.get("Body"));
//		enterValidationText(locators.Body,"like", "Enter Body");
		enterText(locators.Body,testData.get("Body"), "Enter Body");
	}
	
	public void PreviewEmail() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.PreviewEmail);
	}
	
	public void ProceedSelected() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ProceedSelected);
	}
	
	public void ADHOC_ButtonNext() throws InterruptedException 
	{   Thread.sleep(3000);
		clickOnElement(locators.ADHOC_ButtonNext);
	}

	public void DecisionCancel() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.DecisionCancel);
	}
	public void TransactionComplete() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.TransactionComplete);
	}
	
	public void CommunicateResolution() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.CommunicateResolution);
	}
	
	public void ResolutionEmail() throws InterruptedException 
	{   Thread.sleep(5000);
		clickOnElement(locators.ResolutionEmail);
	}
	
	
	public void SummaryForCustomer() throws InterruptedException {		

		Thread.sleep(1000);
		caseNO = retrieveTextAttribute(locators.SummaryForCustomer);	
	}
	
	public void ReferanceLibrary() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ReferanceLibrary);
	}
	
	
	public void Tabs() throws InterruptedException 
	{   
		Thread.sleep(1000);
		clickOnElement(locators.MoneyOut);
		Thread.sleep(1000);
		clickOnElement(locators.Claims);
		Thread.sleep(1000);
		clickOnElement(locators.Enquiries);
		Thread.sleep(1000);
		clickOnElement(locators.Changestatus);
		Thread.sleep(1000);
		clickOnElement(locators.ComplainsAndFeedback);
		Thread.sleep(1000);
		clickOnElement(locators.Requirements);
		Thread.sleep(1000);
		clickOnElement(locators.FormsFactory);
		Thread.sleep(1000);
		clickOnElement(locators.HowToGuide);
		Thread.sleep(1000);
		clickOnElement(locators.ServiceLevels);
		Thread.sleep(1000);
		clickOnElement(locators.ProductInformation);
		Thread.sleep(1000);
		clickOnElement(locators.UnitTrust);
		Thread.sleep(1000);
		clickOnElement(locators.Wealth);
	}
	
	public void Cancell() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.Cancell);
	}
	
	
	public void INeedToClaim() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.INeedToClaim);
	}
	
	public void GenerateForm() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.GenerateForm);
	}
	
	public void NextActions() throws InterruptedException 
	{   Thread.sleep(6000);
		clickOnElement(locators.NextActionsDrp);
		Thread.sleep(6000);
		clickOnElement(locators.NextActionValue);
	}
	
	
	public void NextAction() throws InterruptedException 
	{   Thread.sleep(6000);
		clickOnElement(locators.NextActionsDrp);
		Thread.sleep(6000);
		clickOnElement(locators.NextActionValue);
	}
	
	
	public void SelecTickBox() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SelecTickBox);
	}
	public void ADHOC_SaveButton() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ADHOC_SaveButton);
	}
	public void AccountBelongToPolicy() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.AccountBelongToPolicy);
	}
	
	
	public void SelectCapture() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SelectCapture);
	}
	
	public void FlexiText() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.FlexiText,"FLEXI A part surrender is taking a part of the available money and continuing paying premiums.  An automatic policy change (APC) quote is required before processing a part surrender (Min part-surrender amount = R4 000). GROUP SCHEMES:  A part withdrawal is taking a part of the available money and continuing paying premiums.  No automatic policy change (APC) quote is required before processing a part withdrawal (Min part-withdrawal amount = R590) ");
	}
	
	public void LifeCoveredDetail() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.LifeCoveredDetail,"Lives Covered");
	}
	
	
	public void SelectBoolean() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SelectBoolean);
	}
	
	
	public void SelectGenerateForm() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.SelectGenerateForm);
	}
	

	public void VerifyRequiredValue() throws InterruptedException {		
		Thread.sleep(1000);	
		retrieveTextAndCompare(locators.VerifyRequiredValue,"Required value");
	}

	public void NewBank() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.NewBank);
	}
	
	public void ADHOC_BankName() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ADHOC_BankName);
		Thread.sleep(1000);
		clickOnElement(locators.ADHOC_BankNameValue);
	}
	
	public void NextButtonADHOC() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.NextButtonADHOC);
		
	}
	public void ADHOC_AccountType() throws InterruptedException 
	{   Thread.sleep(1000);
		clickOnElement(locators.ADHOC_AccountType);
		Thread.sleep(1000);
		clickOnElement(locators.ADHOC_AccountValue);
	}
	
	public void ADHOC_AccountNumber() throws InterruptedException 
	{   
		Thread.sleep(1000);
		System.out.println("ADHOC_AccountNumber - " + testData.get("ADHOC_AccountNumber"));
//		enterText(locators.NewComment,"like", "Enter NewComment");
		enterText(locators.ADHOC_AccountNumber,testData.get("ADHOC_AccountNumber"), "Enter ADHOC_AccountNumber");
	}
	
	public void ADHOC_AccountHolder() throws InterruptedException 
	{   
		Thread.sleep(1000);
		System.out.println("ADHOC_AccountHolder - " + testData.get("ADHOC_AccountHolder"));
//		enterText(locators.NewComment,"like", "Enter NewComment");
		enterText(locators.ADHOC_AccountHolder,testData.get("ADHOC_AccountHolder"), "Enter ADHOC_AccountHolder");
	}
	
	
	public void ValueRequired() throws InterruptedException 
	{   
		Thread.sleep(1000);
		System.out.println("ValueRequired - " + testData.get("ValueRequired"));
//		enterText(locators.NewComment,"like", "Enter NewComment");
		enterText(locators.ValueRequired,testData.get("ValueRequired"), "Enter ValueRequired");
	}
	
	public void MessageBody() throws InterruptedException 
	{   
		Thread.sleep(6000);
		System.out.println("MessageBody - " + testData.get("MessageBody"));
		enterText(locators.MessageBody,"like", "Enter MessageBody");
//		enterText(locators.MessageBody,testData.get("MessageBody"), "Enter MessageBody");
	}
	public void SummaryForADHOCScreen() throws InterruptedException {		

		Thread.sleep(4000);
		caseNO = retrieveTextAttribute(locators.SummaryForADHOCScreen);
		
	}
	
}


