package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.HealthCheck_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class HealthCheck extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	HealthCheck_Locators locators;
	String error = "";
	String caseNO = "";
	String strDataFile = "";
	String strDataSheets = "";
	
	public HealthCheck(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("strDataFile " + strDataFile);
		System.out.println("strDataSheets " + strDataSheet);
		System.out.println("TestID " + System.getProperty("TestID"));
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		
		locators = new HealthCheck_Locators();
	}

	/*=================================TC_TestBench========================================*/
	
	public void OpenUrl(){
//		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		HealthCheckUrl(testData.get("URL"));
	}
	
	public void NewDropDownButton()
	{
		clickOnElement(locators.NewDropDownButton);
	}
	
	public void SelectTestBench()
	{
		clickOnElement(locators.SelectTestBench);
	}
	public void Select360() throws InterruptedException
	{
//		clickOnElement(locators.ValidatebankDetails);
		Thread.sleep(2000);
		clickOnElement(locators.Select360);
	}
	public void GCSID() 
	{
		System.out.println("GCSID - " + testData.get("GCSID"));
		enterValidationText(locators.GCSID,testData.get("GCSID"), "Enter GCSID");
	}
	public void NextButon()
	{
		clickOnElement(locators.NextButon);
	}
	public void VerifyCaseNo() throws AWTException, InterruptedException
	{
		caseNO = retrieveTextAttribute(locators.VerifyCaseNo);
		enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");				
		pressEnterKey();
List<WebElement> wb = driver.findElements(By.xpath("//span[@id='ui-bizagi-wp-app-inbox-cases-ico-state-lock']"));
		do { 
			enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");				
			pressEnterKey();
			
			// code block to be executed
			}while (wb.size()<0);
					
//			
//		while((!driver.findElement(By.xpath("//span[@id='ui-bizagi-wp-app-inbox-cases-ico-state-lock']")).isDisplayed()));
//		{
//			enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");				
//			pressEnterKey();
//			//code to be executed  } }
//		}
//					
		
//		 Element info: {Using=xpath, value=xpath|||//span[@id='ui-bizagi-wp-app-inbox-cases-ico-state-lock']}
//		WebElement webelement;
//		if(driver.findElement(By.xpath(locators.Get360View))!= null){
//
//			enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");				
//			pressEnterKey();
//
//			}
//
//			else{
//
//			System.out.println("Element is Absent"); 
//
//			}
		
	
		
		
		
		
//		waitForElementToAppear(locators.Auto360Text);
//		enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");
//		pressEnterKey();
//		waitForElementNoLongerPresent(locators.Auto360Text);
//		Thread.sleep(2000);
//		enterText(locators.CaseNumber,caseNO, "Enter CaseNumber");
//				pressEnterKey();
//				waitForElementNoLongerPresent(locators.Auto360Text);
//		Thread.sleep(4000);
	}
	
	public void Get360ViewSearchBar()  throws AWTException, InterruptedException
	{
		Thread.sleep(3000);
		clickOnElement(locators.Get360ViewSearchBar);
		
		}
	
	public void View360LandingPage()
	{
		retrieveTextAndCompare(locators.View360LandingPage,"View 360 output");
	}
	public void WorkOnItButton() throws InterruptedException
	{
		waitForElementToAppear(locators.WorkOnItButton );
		clickOnElement(locators.WorkOnItButton);
	}
	public void ActiveAgreements()
	{
		clickOnElement(locators.Tab360);
		clickOnElement(locators.ProductsDataTab);
		clickOnElement(locators.DocumentsTab);
		clickOnElement(locators.CustomerTab);
	}
	public void LoopBackAndTestAgain()
	{
		clickOnElement(locators.LoopBackAndTestAgain);
	}
	public void RunGCSValidationService()
	{
		clickOnElement(locators.RunGCSValidationService);
	}
	
	public void NoGCSValidationErrors()
	{
		retrieveTextAndCompare(locators.NoGCSValidationErrors,"There were no GCS validation errors");
	}
	
	
}
