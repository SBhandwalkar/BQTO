
package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.NOAuthTransactions_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class NOAuthTransactions extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	NOAuthTransactions_Locators locators;
	String error = "";
	
	public NOAuthTransactions(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new NOAuthTransactions_Locators();
	}

	/*=================================TC_01========================================*/
	
	public void General_Enquiry_Only_Button() throws InterruptedException 
	{   
//		Thread.sleep(4000);
		waitForElementToAppear(locators.General_Enquiry_Only_Button );
		clickOnElement(locators.General_Enquiry_Only_Button);
//		waitForElementToAppear(locators.General_Enquiry_Only_Button );

	}
	public void Additional_Processing_Button() throws InterruptedException 
	{   
		waitForElementToAppear(locators.Additional_Processing_Button);
//		Thread.sleep(4000);
		clickOnElement(locators.Additional_Processing_Button);

	}
	public void Other_Transaction_Button() throws InterruptedException 
	{   
//		Thread.sleep(4000);
		waitForElementToAppear(locators.Other_Transaction_Button);
		clickOnElement(locators.Other_Transaction_Button);

	}
	
	public void Authentication_Result_Cancel() throws InterruptedException 
	{   
//		Thread.sleep(4000);
		waitForElementToAppear(locators.Authentication_Result_Cancel);
		clickOnElement(locators.Authentication_Result_Cancel);

	}
	
	public void Cancel_Reason() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.Value);
		clickOnElement(locators.Value);

		
	}
	public void Cancel_Observation() 
	{
		System.out.println("Cancel_Observation - " + testData.get("Cancel_Observation"));
		enterText(locators.Cancel_Observation, testData.get("Cancel_Observation"), "Enter Cancel_Observation");
	}
	
	public void TransactionTypez() throws InterruptedException 
	{
//		Thread.sleep(4000);
		waitForElementToAppear(locators.Type);
		clickOnElement(locators.Type);
//		Thread.sleep(3000);
		waitForElementToAppear(locators.SelectValue);
		clickOnElement(locators.SelectValue);
		
	}
	public void More_Info() throws InterruptedException 
	{
		Thread.sleep(2000);
		waitForElementToAppear(locators.More_Info);
		System.out.println("More_Info - " + testData.get("More_Info"));
		enterText(locators.More_Info, "testing info", "Enter More_Info");

	}
	public void NoAuth_Button() throws InterruptedException 
	{   
//		Thread.sleep(3000);
		waitForElementToAppear(locators.NoAuth_Button );
		
		clickElementUsingJavascript(locators.NoAuth_Button,"test");
//		Thread.sleep(2000);

	}
	
	public void GeneralInfoScreen() throws InterruptedException 
	{
		retrieveTextAndCompare(locators.GeneralInfoScreen,"Enquiry");
	}
	public void CheckIfContinueScreen() throws InterruptedException 
	{
		retrieveTextAndCompare(locators.CheckIfContinueScreen,"Continue");
	}
	public void Authenticate_ComplainOnly() throws InterruptedException 
	{
		clickOnElement(locators.Authenticate_ComplainOnly);
	}
	public void DetailOfCircumstanceFeedback() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.DetailOfCircumstanceFeedback);
		System.out.println("DetailOfCircumstanceFeedback - " + testData.get("DetailOfCircumstanceFeedback"));
//		enterText(locators.DetailOfCircumstanceFeedback, testData.get("DetailOfCircumstanceFeedback"), "Enter DetailOfCircumstanceFeedback");
		enterText(locators.DetailOfCircumstanceFeedback,"Testing", "Enter DetailOfCircumstanceFeedback");
	}
	
	public void DesiredOutcome() throws AWTException 
	{
	
//		waitForElementToAppear(locators.DesiredOutcome );
		System.out.println("DesiredOutcome - " + testData.get("DesiredOutcome"));
//		enterText(locators.DesiredOutcome, testData.get("DesiredOutcome"), "Enter DesiredOutcome");	
		enterText(locators.DesiredOutcome,"Testing", "Enter DesiredOutcome");
		
	}
	public void CopyOfFeedBackButton() throws InterruptedException 
	{
		clickOnElement(locators.CopyOfFeedBackButton);
	}
	public void IConfirmInformedCustomer() throws InterruptedException 
	{
		clickOnElement(locators.IConfirmInformedCustomer);
	}
	
	public void DoYouWantOtherTransactions() throws InterruptedException 
	{
		clickOnElement(locators.DoYouWantOtherTransactions);
	}
	public void CorrespondanceForCustomer() throws InterruptedException 
	{
		clickOnElement(locators.CorrespondanceForCustomer);
	}
	public void NoAuthButton() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.NoAuthButton);
	}
	
	public void IInformedCustomer() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.IInformedCustomer);
	}
	
	
	public void SummaryReport() throws InterruptedException {		

		Thread.sleep(6000);
		retrieveTextAndCompare(locators.SummaryReport,"Transaction Summary Report.pdf");
//		caseNO = retrieveTextAttribute(locators.IncidentCompleteLandingPage);
		
	}
	
	
}
