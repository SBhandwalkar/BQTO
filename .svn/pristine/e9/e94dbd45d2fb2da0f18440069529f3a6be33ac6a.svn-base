package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.Concierge_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class Concierge extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	Concierge_Locators locators;
	String error = "";
	String caseNO = "";
	
	public Concierge(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new Concierge_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void Select_CustomerEngagementTelephony() throws InterruptedException 
	{   
		Thread.sleep(1000);
		clickOnElement(locators.Select_CustomerEngagementTelephony);
	}
	
	public void UpdateCustomerDetailTab() throws InterruptedException 
	{	
		Thread.sleep(10000);
		retrieveTextAndCompare(locators.Identifications,"Identifications");
		retrieveTextAndCompare(locators.TaxRegistrations,"Tax registrations");
		retrieveTextAndCompare(locators.Nationalities,"Nationalities");
		retrieveTextAndCompare(locators.Permits,"Permits");
		retrieveTextAndCompare(locators.Addresses,"Addresses/Emails/Phones");
		retrieveTextAndCompare(locators.PosibbleFraud,"Possible fraud");
		retrieveTextAndCompare(locators.AuthenticationQuestions,"Authentication questions");
		retrieveTextAndCompare(locators.Decission,"Decision");
		
	}
	
	public void AuthenticateQuestionPass() throws InterruptedException 
	{   
		Thread.sleep(1000);
		clickOnElement(locators.Pass1);
		clickOnElement(locators.Pass2);
		clickOnElement(locators.Pass3);
		clickOnElement(locators.Pass4);
	}
	
      public void LandingScreen() throws InterruptedException {	
    	  Thread.sleep(5000);
		caseNO = retrieveTextAttribute(locators.LandingScreen);
		
	}
      public void ReferanceLibraryLink() throws InterruptedException 
  	{   
  		Thread.sleep(5000);
  		clickOnElement(locators.ReferanceLibraryLink);
  	}
      
      public void ChangeStatusTab() throws InterruptedException 
    	{   
    		Thread.sleep(1000);
    		clickOnElement(locators.ChangeStatusTab);
    	}
      
      public void EnquiriesTab() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.EnquiriesTab);
  	}
      public void ComplaintsFeedbackTab() throws InterruptedException 
    	{   
    		Thread.sleep(1000);
    		clickOnElement(locators.ComplaintsFeedbackTab);
    	}
      
      public void CloseReferanceLibraryScreen() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.CloseReferanceLibraryScreen);
  	}
      public void CreateStepOutTransaction() throws InterruptedException 
    	{   
    		Thread.sleep(1000);
    		clickOnElement(locators.CreateStepOutTransaction);
    	}
      
      public void ServiceGroup() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.ServiceGroupType);
  		Thread.sleep(1000);
  		clickOnElement(locators.ServiceGroupValue);
  	}
      public void ServiceCatalog() throws InterruptedException 
    	{   
    		Thread.sleep(4000);
    		clickOnElement(locators.ServiceCatalogType);
    		Thread.sleep(4000);
    		clickOnElement(locators.ServiceCatalogValue);
    	}
      
      public void Note() 
  	{
  		System.out.println("Note - " + testData.get("Note"));
  		enterText(locators.Note, testData.get("Note"), "Enter Note");
  	}
      public void SelectTransactionType() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.TransactionType);
  		Thread.sleep(1000);
  		clickOnElement(locators.TransactionTypeValue);
  	}
      public void SaveButon() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.SaveButon);
  	}
      public void RelatedCasesTab() throws InterruptedException 
    	{   
    		Thread.sleep(3000);
    		clickOnElement(locators.RelatedCasesTab);
    	}
      
      public void DecissionRadioBtn() throws InterruptedException 
  	{   
  		Thread.sleep(1000);
  		clickOnElement(locators.DecissionRadioBtn);
  	}
      
      public void EmailPreview() throws InterruptedException 
    	{   
    		Thread.sleep(2000);
    		clickOnElement(locators.EmailPreview);
    		Thread.sleep(2000);
    	}
      
      public void Tier2Tab() throws InterruptedException 
  	{   
  		Thread.sleep(3000);
  		clickOnElement(locators.Tier2Tab);
  		Thread.sleep(2000);
  	}
      
      public void RelatedCasesBtn() throws InterruptedException 
    	{   
    		Thread.sleep(2000);
    		clickOnElement(locators.RelatedCasesBtn);
    	
    	}
      
      
      public void EnterCommentsBox() throws InterruptedException 
    	{
    	  Thread.sleep(5000);
    		System.out.println("EnterCommentsBox - " + testData.get("EnterCommentsBox"));
    		enterText(locators.EnterCommentsBox, testData.get("EnterCommentsBox"), "Enter EnterCommentsBox");
    	}
}