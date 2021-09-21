package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.EnquiryAndInformation_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class EnquiryAndInformation extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	EnquiryAndInformation_Locators locators;
	String error = "";
	String caseNO = "";
	
	public EnquiryAndInformation(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new EnquiryAndInformation_Locators();
	}

	/*=================================TC_10========================================*/
	
	
	public void I_Need_General_Information() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.I_Need_General_Information);
	}
	
	public void INeedToSubmitDcuments() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.INeedToSubmitDcuments);
	}
	public void GeneralNextButon() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.GeneralNextButon);
		clickOnElement(locators.GeneralNextButon);		
	}
	
	public void SelectErrorsAndIssuesDrpDwn() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectErrorsAndIssuesType);	
		Thread.sleep(3000);
		clickOnElement(locators.SelectErrorsAndIssuesValue);
	}
	
	
	public void PaymentInformation() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.PaymentInformationType);	
		Thread.sleep(3000);
		clickOnElement(locators.PaymentInformationValue);
	}
	
	public void PolicyInformationDrpDwn() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.PaymentInformationType);	
		Thread.sleep(3000);
		clickOnElement(locators.PolicyInformationValue);
	}
	
	public void PremiumInformationDrpDwn() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.PaymentInformationType);	
		Thread.sleep(3000);
		clickOnElement(locators.PremiumInformationValue);
	}
	public void TransactionType() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.GeneralNextButon);
		clickOnElement(locators.Type);
//		waitForElementToAppear(locators.GeneralNextButon);
		Thread.sleep(3000);
		clickOnElement(locators.SelectValue);
		
	}
	
	public void Transaction_Type() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Value);
		clickOnElement(locators.Value);
		
	}
	public void TransactionTypes() throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Valuez);
		clickOnElement(locators.Valuez);
		
	}
	public void Transaction() throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Values);
		clickOnElement(locators.Values);
		
	}
	
	public void AdditionalInfo() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("AdditionalInfo - " + testData.get("AdditionalInfo"));
//		enterText(locators.AdditionalInfo, testData.get("AdditionalInfo"), "Enter AdditionalInfo");
		enterText(locators.AdditionalInfo, "Additional Information provided", "Enter AdditionalInfo");
		
	}

	public void ReasonRadioButton() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.ReasonRadioButton);
		clickOnElement(locators.ReasonRadioButton);
	}
	public void Generate_Document_Button() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Generate_Document_Button);
		clickOnElement(locators.Generate_Document_Button);
	}
	public void Select_Proceed_Button() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Select_Proceed_Button);
		clickOnElement(locators.Select_Proceed_Button);
	}
	public void I_Need_Agreement_Information() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.I_Need_Agreement_Information);
		clickOnElement(locators.I_Need_Agreement_Information);
	}
	
	
	public void _360_View_Tab() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators._360_View_Tab);
		clickOnElement(locators._360_View_Tab);
	}
	public void I_Need_To_Follow_Up() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.I_Need_To_Follow_Up);
		clickOnElement(locators.I_Need_To_Follow_Up);
		waitForElementToAppear(locators.I_Need_To_Follow_Up);
	}
	public void Reason_For_FollowUp() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Reason_For_FollowUp);
		System.out.println("Reason_For_FollowUp - " + testData.get("Reason_For_FollowUp"));
		enterText(locators.Reason_For_FollowUp, testData.get("Reason_For_FollowUp"), "Enter Reason_For_FollowUp");
		
	}
	public void Select_Transaction_Checkbox() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Select_Transaction_Checkbox);
		clickOnElement(locators.Select_Transaction_Checkbox);
//		waitForElementToAppear(locators.Select_Transaction_Checkbox);
	}
	public void I_Need_My_Document() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.I_Need_My_Document);
		clickOnElement(locators.I_Need_My_Document);
//		waitForElementToAppear(locators.Select_Transaction_Checkbox);
	}
	public void No_Further_Process_Needed_Button() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.No_Further_Process_Needed_Button);
		clickOnElement(locators.No_Further_Process_Needed_Button);
//		waitForElementToAppear(locators.Select_Transaction_Checkbox);
	}
	public void I_Need_Specific_Service_Button() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.I_Need_Specific_Service_Button);
		clickOnElement(locators.I_Need_Specific_Service_Button);
//		waitForElementToAppear(locators.Select_Transaction_Checkbox);
	}
	public void Reason_TextBox() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.Reason_TextBox);
		System.out.println("Reason_TextBox - " + testData.get("Reason_TextBox"));
		enterText(locators.Reason_TextBox, testData.get("Reason_TextBox"), "Enter Reason_TextBox");
		
	}
	public void Service_Group_Type() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
		waitForElementToAppear(locators.ValueType);
//		Thread.sleep(3000);
		clickOnElement(locators.ValueType);
		
		
	}
	public void Service_Catalog_Drp() throws InterruptedException 
	{
//		Thread.sleep(3000);
		waitForElementToAppear(locators.SelectType);
		clickOnElement(locators.SelectType);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.ValueTypeSelected);
		clickOnElement(locators.ValueTypeSelected);	
	}
	
	
	 public void GeneralInfoLandingScreen() throws InterruptedException 
	{
		retrieveTextAndCompare(locators.GeneralInfoLandingScreen,"Enquiry");
	}
	 public void M65Report() throws InterruptedException 
		{
			retrieveTextAndCompare(locators.M65Report,"M65 Report");
		}
	 
	 public void TransactionTypeDropDown() throws InterruptedException 
		{
			Thread.sleep(2000);
//		 waitForElementToAppear(locators.Type);
			clickOnElement(locators.Type);
			waitForElementToAppear(locators.RefundInformation);
//			Thread.sleep(3000);
			clickOnElement(locators.RefundInformation);			
		}
	 
	 public void SpecificServiceLandingScreen() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.SpecificServiceLandingScreen);
			
		}
	 
	 public void EnquiryDocumentsLandingScreen() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.EnquiryDocumentsLandingScreen);
			
		}
	 
	 public void EnquiryFollowUpLandingScreen() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.EnquiryFollowUpLandingScreen);
			
		}
	 
	 
	 public void EnquiryAgreementInformation() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.EnquiryAgreementInformation);
			
		}
	 public void EnquiryGeneralInfoLandingScreen() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.EnquiryGeneralInfoLandingScreen);
			
		}
	 public void VerifyEnquirySubmitDocuments() {		
			
//			retrieveTextAndCompare(locators.ConfirmAndUpdateCustomerlandingScreen,"Update customer details");
			caseNO = retrieveTextAttribute(locators.VerifyEnquirySubmitDocuments);
			
		}
}