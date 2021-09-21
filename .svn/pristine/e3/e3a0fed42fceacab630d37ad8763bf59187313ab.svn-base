package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.ComplaintsAndFeedBack_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class ComplaintsAndFeedBack extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	ComplaintsAndFeedBack_Locators locators;
	String error = "";
	String caseNO = "";
	
	public ComplaintsAndFeedBack(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new ComplaintsAndFeedBack_Locators();
	}

	/*=================================TC_05========================================*/
	
	
	public void I_Want_To_Complain() throws InterruptedException 
	{
	Thread.sleep(2000);
//		waitForElementToAppear(locators.I_Want_To_Complain);
		clickOnElement(locators.I_Want_To_Complain);
		
	}
	
	public void CorrespondanceToCustomer() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.I_Want_To_Complain);
		clickOnElement(locators.CorrespondanceToCustomer);
		
	}
	
	

	public void FormLinkForCustomer() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.FormLinkForCustomer);
		clickOnElement(locators.FormLinkForCustomer);
		
	}

	public void PrintedCorespondanceForCustomer() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.PrintedCorespondanceForCustomer);
		clickOnElement(locators.PrintedCorespondanceForCustomer);
		
	}
	
	

	public void ConfirmCustomerIsInformed() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.ConfirmCustomerIsInformed);
		clickOnElement(locators.ConfirmCustomerIsInformed);
		
	}
	
	
	public void CustomerInformed() throws InterruptedException 
	{
//		Thread.sleep(3000);
//		waitForElementToAppear(locators.I_Want_To_Complain);
		clickOnElement(locators.CustomerInformed);
		
	}
	
	
	
	public void CustomerCorrespondance() throws InterruptedException 
	{
		Thread.sleep(3000);
//		waitForElementToAppear(locators.CustomerCorrespondance);
		clickOnElement(locators.CustomerCorrespondance);
		
	}
	
	
	public void NextButton_4() throws InterruptedException 
	{
//		waitForElementToAppear(locators.NextButton_4);
//		Thread.sleep(4000);
		clickOnElement(locators.NextButton_4);
	}
	
	public void Complain_FeedBack() throws InterruptedException 

	{
//		waitForElementToAppear(locators.Complain_FeedBack);
		Thread.sleep(5000);
		System.out.println("Complain_FeedBack - " + testData.get("Complain_FeedBack"));
		enterText(locators.Complain_FeedBack, testData.get("Complain_FeedBack"), "Enter Complain_FeedBack");	
	}
	
	public void Outcome() throws InterruptedException
	{
//		waitForElementToAppear(locators.Outcome);
//		Thread.sleep(3000);
		System.out.println("Outcome - " + testData.get("Outcome"));
		enterText(locators.Outcome, testData.get("Outcome"), "Enter Outcome");
		
	}
	
	public void Correspondance() throws InterruptedException
	{
//		waitForElementToAppear(locators.Correspondance);
//		Thread.sleep(3000);
//		 checkIfSelectedanSelect(locators.Correspondance);
		 clickOnElement(locators.Correspondance );
	}
	
	public void PrintedCorrespondanceToCustomer() throws InterruptedException
	{
//		waitForElementToAppear(locators.Correspondance);
//		Thread.sleep(3000);
//		 checkIfSelectedanSelect(locators.Correspondance);
		 clickOnElement(locators.PrintedCorrespondanceToCustomer );
	}
	
	

	public void FormLinkCustomer() throws InterruptedException
	{
//		waitForElementToAppear(locators.Correspondance);
//		Thread.sleep(3000);
//		 checkIfSelectedanSelect(locators.Correspondance);
		 clickOnElement(locators.FormLinkCustomer );
	}
	
	
	
	public void CustomerInformedAbove() throws InterruptedException
	{
//		waitForElementToAppear(locators.Correspondance);
		Thread.sleep(3000);
//		 checkIfSelectedanSelect(locators.Correspondance);
		 clickOnElement(locators.CustomerInformedAbove );
	}
	


	public void ConfirmCheckBox() throws InterruptedException
	{
//		Thread.sleep(3000);
//		waitForElementToAppear(locators.ConfirmCheckBox);
		 checkIfSelectedanSelect(locators.ConfirmCheckBox);
		 clickOnElement(locators.ConfirmCheckBox );
	}
	
	
	public void Button() throws InterruptedException 
	{
//		Thread.sleep(4000);
//		waitForElementToAppear(locators.Button);
		clickOnElement(locators.Button);
	}
	public void Select_Agreement() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.Select_Agreement);
		clickOnElement(locators.Select_Agreement);
	}
	public void Copy_Feedback_Button() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.Copy_Feedback_Button);
		clickOnElement(locators.Copy_Feedback_Button);
	}
	public void View_Add_documents_Link() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.View_Add_documents_Link);
		clickOnElement(locators.View_Add_documents_Link);
	}
	public void I_Want_To_Compliment() throws InterruptedException 
	{
	Thread.sleep(2000);
//		waitForElementToAppear(locators.I_Want_To_Compliment);
		clickOnElement(locators.I_Want_To_Compliment);
	}
	public void I_Want_To_Report_Fraud() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.I_Want_To_Report_Fraud);
		clickOnElement(locators.I_Want_To_Report_Fraud);
	}
	

	public void Customer_Informed_Box() throws InterruptedException 
	{
//		Thread.sleep(2000);
//		waitForElementToAppear(locators.Customer_Informed_Box);
		clickOnElement(locators.Customer_Informed_Box);
	}
	public void Complain_Next() throws InterruptedException 
	{
//		Thread.sleep(4000);
//		waitForElementToAppear(locators.Complain_Next);
		clickOnElement(locators.Complain_Next);
	}

	public void CaptureFeedBackScreen() throws InterruptedException 
	{
		caseNO = retrieveTextAttribute(locators.CaptureFeedBackScreen);
//		retrieveTextAndCompare(locators.CaptureFeedBackScreen,"Feedback");
	}
	public void PrintedCorrespondance() throws InterruptedException 
	{
//		Thread.sleep(4000);
//		waitForElementToAppear(locators.PrintedCorrespondance);
		clickOnElement(locators.PrintedCorrespondance);
	}
	public void InformedCustomer() throws InterruptedException 
	{
//		Thread.sleep(4000);
//		waitForElementToAppear(locators.InformedCustomer);
		clickOnElement(locators.InformedCustomer);
	}
	
}
