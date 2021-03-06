package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.BizagiLogin_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class BizagiLogin extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	BizagiLogin_Locators locators;
	String error = "";
	
	public BizagiLogin(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("strDataFile " + strDataFile);
		System.out.println("strDataSheets " + strDataSheet);
		System.out.println("TestID " + System.getProperty("TestID"));
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		
		locators = new BizagiLogin_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void UserName() 
	{
		System.out.println("UserName - " + testData.get("UserName"));
		enterText(locators.UserName, testData.get("UserName"), "Enter UserName");
	}
	 
	public void Password() 
	{
		System.out.println("Password - " + testData.get("Password"));
		enterText(locators.Password, testData.get("Password"), "Enter Password");
	}
	
	
	public void Login()
	{
		
		clickOnElement(locators.Login);
	}
	
	public void Case() throws AWTException, InterruptedException 
	{
	Thread.sleep(2000);
		System.out.println("Case - " + testData.get("Case"));
		enterText(locators.Case, testData.get("Case"), "Enter Case");		
		pressEnterKey();
	}
	

	public void StartCase() throws InterruptedException
	{
		 Thread.sleep(5000);
		
//		waitForElementToAppear(locators.StartCase );
		clickOnElement(locators.StartCase);
	}
	
	public void ConfirmCheckBox() throws InterruptedException 
	{
		Thread.sleep(2000);
//		waitForElementToAppear(locators.ConfirmCheckBox );
//		 checkIfSelectedanSelect(locators.ConfirmCheckBox);
		 clickOnElement(locators.ConfirmCheckBox );
		
	}
	
	public void NextButton() throws InterruptedException
	{
		Thread.sleep(5000);
//		waitForElementToAppear(locators.NextButton);
		clickOnElement(locators.NextButton);
	}
	
	public void SelectEmail() throws InterruptedException {
		Thread.sleep(3000);
//		 checkIfSelectedanSelect(locators.SelectEmail);
		 clickOnElement(locators.SelectEmail );
		
	}
	
	public void SelectAdress() throws InterruptedException {
//		waitForElementToAppear(locators.SelectAdress);
		 checkIfSelectedanSelect(locators.SelectAdress);
        clickOnElement(locators.SelectAdress);
		
	}
	
	public void SelectMobile() throws InterruptedException {
//		waitForElementToAppear(locators.SelectMobile );
		 checkIfSelectedanSelect(locators.SelectMobile);
		 clickOnElement(locators.SelectMobile );
		
		
	}
	
	public void NextButton_2() throws InterruptedException
	{

        Thread.sleep(3000);
		clickOnElement(locators.NextButton_2);
		
	}
	public void Select_Domain() throws InterruptedException
	{

        Thread.sleep(3000);
		clickOnElement(locators.Select_Domain);
		
	}
	
	public void OMEM_CST() throws InterruptedException
	{

        Thread.sleep(3000);
		clickOnElement(locators.OMEM_CST);
		
	}
	
}
