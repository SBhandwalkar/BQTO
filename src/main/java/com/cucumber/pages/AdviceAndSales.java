package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.AdviceAndSales_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class AdviceAndSales extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	AdviceAndSales_Locators locators;
	String error = "";
	String caseNO = "";
	
	public AdviceAndSales(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new AdviceAndSales_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void I_Want_To_Buy() throws InterruptedException 
	{   
		clickOnElement(locators.I_Want_To_Buy);
		waitForElementToAppear(locators.I_Want_To_Buy );

	}
	
	
	public void NextButton() throws InterruptedException 
	{
		
		clickOnElement(locators.NextButton);
		waitForElementToAppear(locators.NextButton);
	}
	
	public void Complete() throws InterruptedException 
	{
		Thread.sleep(2000);
		clickOnElement(locators.Complete);
		
	}
	public void SolutionType() throws InterruptedException {
		
		Thread.sleep(5000);
		 clickOnElement(locators.SolutionType );
		 Thread.sleep(3000);
			clickOnElement(locators.Type);		 
		 Thread.sleep(1000);
			 clickOnElement(locators.SelectValue );
	}
	public void IntermediaryContact() throws InterruptedException 
	{
//        Thread.sleep(1000);
		clickOnElement(locators.IntermediaryContact);
	}
	
	
	
	public void Type() throws InterruptedException 
	{
Thread.sleep(2000);
		clickOnElement(locators.Type);
		Thread.sleep(1000);
		clickOnElement(locators.SelectValue);
		

		
	}
	
	public void SelectValue() throws InterruptedException 
	{
		
		clickOnElement(locators.SelectValue);
	}
	
	public void NextButton_2() 
	{
		waitForElementToAppear(locators.NextButton_2 );
		clickOnElement(locators.NextButton_2);
	}
	
	public void NextButton_3() 
	{
		waitForElementToAppear(locators.NextButton_3 );
		clickOnElement(locators.NextButton_3);
	}
	
	public void Customer_Supply_Documents_Select() throws InterruptedException 
	{
		Thread.sleep(4000);
		clickOnElement(locators.Customer_Supply_Documents_Select);
	}
	
	public void Default_Selected_Proceed() throws InterruptedException 
	{
		
		clickOnElement(locators.Default_Selected_Proceed);
	}
	
	
	public void EmploymentPositionDropDown() throws InterruptedException 
	{
		
		clickOnElement(locators.EmploymentPositionType);
		Thread.sleep(1000);
		clickOnElement(locators.EmploymentPositionValue);
		Thread.sleep(1000);
	}
	
	public void I_Need_Advice() throws InterruptedException 
	{   
		Thread.sleep(2000);
		clickOnElement(locators.I_Need_Advice);

	}
	public void GatherDocumentslandingPage() {		
		caseNO = retrieveTextAttribute(locators.GatherDocumentslandingPage);
	}
	
	public void ProceedButtonSelected() {		

		checkIfSelectedanSelect(locators.ProceedButtonSelected);
		
	}
	public void ConfirmAndUpdateCustomerlandingScreen() throws InterruptedException {		
		Thread.sleep(2000);
//		retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
		caseNO = retrieveTextAttribute(locators.ConfirmAndUpdateCustomerlandingScreen);
		
	}
	
public void MoneyOutOptionsLandingScreen() {		
		
//		retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
		caseNO = retrieveTextAttribute(locators.MoneyOutOptionsLandingScreen);
		
	}
	

public void MoneyOutReviewLandingScreen() {		
	
//	retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
	caseNO = retrieveTextAttribute(locators.MoneyOutReviewLandingScreen);
	
}

	
	public void ManageTransactionLandingPgae() throws InterruptedException {		
		Thread.sleep(5000);
		caseNO = retrieveTextAttribute(locators.ManageTransactionLandingPgae);
//		retrieveTextAndCompare(locators.ManageTransactionLandingPgae,"Transactions");
		
	}
	public void TransactionAddedToServiceList() {		

		retrieveTextAndCompare(locators.TransactionAddedToServiceList,"I Need Advice");
		
	}
	public void CaptureTransactionDefaultSelection() {		

		checkIfSelectedanSelect(locators.CaptureTransactionDefaultSelection);
		
	}
	public void CaptureLeadLandingPage() {		

//		retrieveTextAndCompare(locators.CaptureLeadLandingPage,"Lead");
		caseNO = retrieveTextAttribute(locators.CaptureLeadLandingPage);
		
		
	}
	public void SummitLandingPage() {		

//		retrieveTextAndCompare(locators.SummitLandingPage,"Back to Summit");
		caseNO = retrieveTextAttribute(locators.SummitLandingPage);
		
	}
	public void GatherEvidenceLandingPage() {		

//		retrieveTextAndCompare(locators.GatherEvidenceLandingPage,"Documents for Requirements");
		caseNO = retrieveTextAttribute(locators.GatherEvidenceLandingPage);
		
	}
	public void ResolutionLandingPage() throws InterruptedException {		
Thread.sleep(2000);
//		retrieveTextAndCompare(locators.ResolutionLandingPage,"Resolution");
		caseNO = retrieveTextAttribute(locators.ResolutionLandingPage);
		
	}
	public void TransactionSummaryReportIsAvailable() throws InterruptedException {	
		Thread.sleep(2000);

//		waitForElementToAppear(locators.TransactionSummaryReportIsAvailable);
		retrieveTextAndCompare(locators.TransactionSummaryReportIsAvailable,"Transaction Summary Report.pdf");
		
	}
	
	public void IncidentCompleteLandingPage() {		

//		retrieveTextAndCompare(locators.IncidentCompleteLandingPage,"The incident has been completed.");
		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);
		
	}
	public void IwantToBuyAddedToTransactionList() {		

		retrieveTextAndCompare(locators.IwantToBuyAddedToTransactionList,"I Want to Buy");
		
	}
	public void ResultText() throws InterruptedException {		

		Thread.sleep(1000);
		retrieveTextAndCompare(locators.ResultText,"Please click \"Next\" and refer the customer to a PF in-house adviser");
		
	}
	
	public void GatherDocumentslandingScreen() throws InterruptedException {		

		Thread.sleep(4000);
		caseNO = retrieveTextAttribute(locators.GatherDocumentslandingScreen);
		
	}
		
	
	public void VerifyHomePage() throws InterruptedException {		

		Thread.sleep(10000);
		retrieveTextAndCompare(locators.VerifyHomePage,"Inbox");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);
		
	}
	
//	public void UnknownCustomerLanguage() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerLanguageType);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerLanguageValue);
//		Thread.sleep(1000);
//	}
//	
//	public void UnknownCustomerGender() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerGenderType);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerGenderValue);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerIDCountry() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerIDCountryType);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerIDCountryValue);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerID() throws InterruptedException 
//	{
//		System.out.println("UnknownCustomerID - " + testData.get("UnknownCustomerID"));
//		enterText(locators.UnknownCustomerID, "3701105103080", "Enter UnknownCustomerID");
//	}
//	public void UnknownCustomerAdress1() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerAdress1Type);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerAdress1Value);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerAdress2() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerAdress2Type);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerAdress2Value);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerAdressCountry() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerAdressCountryType);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerAdressCountryValue);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerAddPhone1() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerAddPhone1Type);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerAddPhone1Value);
//		Thread.sleep(1000);
//	}
//	public void UnknownCustomerAddPhone2() throws InterruptedException 
//	{
//		
//		clickOnElement(locators.UnknownCustomerAddPhone2Type);
//		Thread.sleep(1000);
//		clickOnElement(locators.UnknownCustomerAddPhone2Value);
//		Thread.sleep(1000);
//	}
}
