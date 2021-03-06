package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.HUB_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class HUB extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	HUB_Locators locators;
	String error = "";
	
	public HUB(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new HUB_Locators();
	}

	/*=================================TC_10========================================*/
	
	
	public void Change_Premium_From_Stop_Oder_To_Debit_Oder () throws InterruptedException 
	{
		Thread.sleep(4000);
//		waitForElementToAppear(locators.Change_Premium_From_Stop_Oder_To_Debit_Oder );
		clickOnElement(locators.Change_Premium_From_Stop_Oder_To_Debit_Oder);
	}
	

	public void Select_Option () throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Select_Option);
	}
	
	public void Deduct_Day() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Deduct_Day - " + testData.get("Deduct_Day"));
		enterText(locators.Deduct_Day, "15", "Enter Deduct_Day");
	}
	
	public void Select_Bank () throws InterruptedException 
	{
		Thread.sleep(2000);
		clickOnElement(locators.Select_Bank);
	}
	
	public void Save_Button () throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Save_Button);
	}
	
	public void ManuallySignDocument() throws InterruptedException 
	{
		Thread.sleep(5000);
//		waitForElementToAppear(locators.ManuallySignDocument );
		clickOnElement(locators.ManuallySignDocument);
	}
	
	public void DecissionButton () throws InterruptedException 
	{
		Thread.sleep(4000);
		clickOnElement(locators.DecissionButton);
	}
	
	public void Customer_Supply_Documents_CheckBox() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Customer_Supply_Documents_CheckBox);
	}
	
	public void Complete_Button() throws InterruptedException 
	{
		Thread.sleep(5000);
		clickOnElement(locators.Complete_Button);
	}
	
	public void Admin_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Admin_Drp);
	}
	public void User_Management_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.User_Management_Drp);
	}
	public void Users_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Users_Drp);
	}
	public void Search_User() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Search_User - " + testData.get("Search_User"));
		enterText(locators.Search_User, "Maso", "Enter Search_User");
	}
	public void Edit_Icon() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Edit_Icon);
	}
	public void User_Configuration_Tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.User_Configuration_Tab);
	}
	
	public void New_Case_Tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.New_Case_Tab);
	}
	public void Case_Administration_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Case_Administration_Drp);
	}
	public void Reassign_Case_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Reassign_Case_Button);
	}
	public void Search_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Search_Button);
	}
	public void Select_CEB() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Select_CEB);
	}
	
	public void Me_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Me_Button);
	}
	public void Reason_text() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Reason_text - " + testData.get("Reason_text"));
		enterText(locators.Reason_text, "TESTING", "Enter Reason_text");
	}
	public void CEB_Number() throws AWTException 
	{
	
//		waitForElementToAppear(locators.CEB_Number );
		System.out.println("CEB_Number - " + testData.get("CEB_Number"));
		enterText(locators.CEB_Number, "CEB21013438-2", "Enter CEB_Number");
		
	}
	public void SavesButton() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SavesButton);
	}
	public void Inbox_Tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Inbox_Tab);
	}
	public void Service_Transaction() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Service_Transaction);
	}
	public void Manual_Servicing() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Manual_Servicing);
	}
	public void Register_Call() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Register_Call);
	}
	
	public void Call_Reason() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectedTypes);
		Thread.sleep(3000);
		clickOnElement(locators.SelectedValues);
		
	}
	
	public void Call_Outcome_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectedType);
		Thread.sleep(3000);
		clickOnElement(locators.SelectedValue);
		
	}
	
	public void Comment_Text() throws AWTException 
	{
	
		waitForElementToAppear(locators.Comment_Text );
		System.out.println("Comment_Text - " + testData.get("Comment_Text"));
		enterText(locators.Comment_Text, "TESTING CASE", "Enter Comment_Text");
		
	}
	public void Select_Phone() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Select_Phone);
	}
	
	public void Send_SMS() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Send_SMS);
	}
	public void SMS_Template() throws InterruptedException 
	{
	Thread.sleep(3000);
	clickOnElement(locators.SelectedTyped);
	Thread.sleep(3000);
	clickOnElement(locators.SelectedValued);
	}
	
	public void New_SMS_Text() throws AWTException 
	{
	
		waitForElementToAppear(locators.New_SMS_Text );
		System.out.println("New_SMS_Text - " + testData.get("New_SMS_Text"));
		enterText(locators.New_SMS_Text, "TESTING", "Enter New_SMS_Text");
		
	}
	public void Send_Email() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Send_Email);

	}
	public void Select_Email() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Select_Email);

	}
	public void Email_Body() throws InterruptedException 
	{

		waitForElementToAppear(locators.Email_Body );
		System.out.println("Email_Body - " + testData.get("Email_Body"));
		enterText(locators.Email_Body, "TEST CASE", "Enter Email_Body");
		
	}
	public void Related_Reference_Tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Related_Reference_Tab);

	}
	public void Reference_Type() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectType);
		Thread.sleep(3000);
		clickOnElement(locators.SelectValue);

	}
	public void ReferenceNumber() throws InterruptedException 
	{
//		waitForElementToAppear(locators.Reference_No );
		System.out.println("ReferenceNumber - " + testData.get("ReferenceNumber"));
		enterText(locators.ReferenceNumber, "CE1234", "Enter ReferenceNumber");

	}
	public void Add_Info() throws InterruptedException 
	{

		waitForElementToAppear(locators.Add_Info );
		System.out.println("Add_Info - " + testData.get("Add_Info"));
		enterText(locators.Add_Info, "TEST CASE", "Enter Add_Info");
		
	}
	public void Add_Reference() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Add_Reference);

	}
	public void Complete_Radio_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Complete_Radio_Button);

	}
	public void Complete_Reason() throws InterruptedException 
	{
		Thread.sleep(4000);
		clickOnElement(locators.Complete_Reason);

	}
	public void Service_Transaction_Tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Service_Transaction_Tab);

	}
	
	public void AddSkill() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.AddSkill);

	}
	
	public void HubMoneyOutRAFNGP() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.HubMoneyOutRAFNGP);

	}
	
}
