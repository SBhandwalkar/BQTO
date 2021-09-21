package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.Queries_locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class Queries extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	Queries_locators locators;
	String error = "";
	
	public Queries(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new Queries_locators();
	}

	/*=================================TC_02========================================*/
	
	public void Queries_Drp() throws InterruptedException 
	{
		waitForElementToAppear(locators.Queries_Drp);
		
		clickOnElement(locators.Queries_Drp);
	}
	
	public void Appication() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Appication);
	}
	
	
	public void Tier_2_Search() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.TC_Tier_2_Search);
	}
	
	
	public void CaseNo() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("CaseNo - " + testData.get("CaseNo"));
		enterText(locators.CaseNo,  testData.get("CaseNo"), "Enter CaseNo");		
	}
	
	public void Branch_Search() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Branch_Search);
	}
	
	
	public void ReferanceNo() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("ReferanceNo - " + testData.get("ReferanceNo"));
		enterValidationText(locators.ReferanceNo, testData.get("ReferanceNo"), "Enter ReferanceNo");
//		enterText(locators.ReferanceNo,  testData.get("ReferanceNo"), "Enter ReferanceNo");
		
	}
	
	public void ReferanceNumber() throws InterruptedException 
	{
		System.out.println("ReferanceNumber - " + testData.get("ReferanceNumber"));
//		enterValidationText(locators.ReferanceNumber, testData.get("ReferanceNumber"), "Enter ReferanceNumber");
		enterText(locators.ReferanceNumber,  testData.get("ReferanceNumber"), "Enter ReferanceNumber");
		
	}
	
	public void SearchCEB() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.SearchCEB);
	}
	
	public void Bizagi_Inbox() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.Bizagi_Inbox);
	}
	
	public void CloseButton() throws InterruptedException 
	{
	
		Thread.sleep(1000);
		clickOnElement(locators.CloseButton);
	}
	
	
	public void AgreementNo() throws InterruptedException 
	{
		System.out.println("AgreementNo - " + testData.get("AgreementNo"));
		enterText(locators.AgreementNo,  testData.get("AgreementNo"), "Enter AgreementNo");
	}
	
	
	public void Agreement() throws InterruptedException 
	{
		System.out.println("Agreement - " + testData.get("Agreement"));
		enterText(locators.Agreement,  testData.get("Agreement"), "Enter Agreement");
	}
	public void GCS() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("GCS - " + testData.get("GCS"));
		enterText(locators.GCS,  testData.get("GCS"), "Enter GCS");
	}

	public void GCS_ID() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("GCS_ID - " + testData.get("GCS_ID"));
		enterText(locators.GCS_ID,  testData.get("GCS_ID"), "Enter GCS_ID");
		
	}
	
	public void IDNumber() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("IDNumber - " + testData.get("IDNumber"));
		enterText(locators.IDNumber,  testData.get("IDNumber"), "Enter IDNumber");
		
	}
	
	public void ID_No() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("ID_No - " + testData.get("ID_No"));
		enterText(locators.ID_No,  testData.get("ID_No"), "Enter ID_No");
		
	}
	public void OMEM_CST_Drp() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.OMEM_CST_Drp);
	}
	
	public void CloseSearch() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(locators.CloseSearch);
	}
	public void EmailFrom() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("EmailFrom - " + testData.get("EmailFrom"));
		enterText(locators.EmailFrom,  testData.get("EmailFrom"), "Enter EmailFrom");
			
	}
	
	public void CEBranchAndTelephonyScreen() throws InterruptedException {		
		Thread.sleep(1000);
		retrieveTextAndCompare(locators.CEBranchAndTelephonyScreen,"CE Branch and Telephony Search");	
	}
		
}
