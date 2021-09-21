package com.cucumber.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.CreateNewCase_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class CreateNewCase extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	CreateNewCase_Locators locators;
	String error = "";
	
	public CreateNewCase(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new CreateNewCase_Locators();
	}

	/*=================================TC_10========================================*/
	
	public void Case() 
	{
		System.out.println("Case - " + testData.get("Case"));
		enterText(locators.Case, "CEB@#$%^&", "Enter Case");
	}
		
}
