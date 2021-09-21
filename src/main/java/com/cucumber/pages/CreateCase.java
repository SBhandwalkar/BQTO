package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumber.ReadLocators.CreateCase_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class CreateCase extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	CreateCase_Locators locators;
	String error = "";
	
	public CreateCase(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new CreateCase_Locators();
	}

	/*=================================TC_11========================================*/
	
	
//	public void CEB() throws AWTException 
//	{
//		System.out.println("CEB - " + testData.get("CEB"));
//		enterText(locators.CEB, "CEB20121325", "Enter CEB");
//		
//		pressEnterKey();
//	}
	
	public void StartCase() throws InterruptedException
	{
		Thread.sleep(2000);
		waitForElementToAppear(locators.StartCase );
		clickOnElement(locators.StartCase);
	}
	
	public void ConfirmCheckBox() throws InterruptedException 
	{
		 Thread.sleep(2000);
		 checkIfSelectedanSelect(locators.ConfirmCheckBox);
		 clickOnElement(locators.ConfirmCheckBox );
		
	}
		
	public void NextButton() 
	{
		waitForElementToAppear(locators.NextButton );
		clickOnElement(locators.NextButton);
	}
	
}
