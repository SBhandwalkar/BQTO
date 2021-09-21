package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class BizagiLogin_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String UserName;

	public static String Login;
	
	public static String Case;
	
	public static String OMEM_CST;
	
	public static String StartCase;
	
	public static String ConfirmCheckBox;
	
	public static String NextButton;
	
	public static String SelectEmail;
	public static String SelectAdress;
	
	public static String SelectMobile;
	public static String NextButton_2;
	public static String Password;
	public static String Select_Domain;

	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	UserName = LocatorData.get("UserName");
	Login = LocatorData.get("Login");
	Case  = LocatorData.get("Case");
	StartCase  = LocatorData.get("StartCase");
	ConfirmCheckBox = LocatorData.get("ConfirmCheckBox");
	NextButton = LocatorData.get("NextButton");
	SelectEmail = LocatorData.get("SelectEmail");
	SelectMobile = LocatorData.get("SelectMobile");
	NextButton_2 = LocatorData.get("NextButton_2");
	SelectAdress = LocatorData.get("SelectAdress");
	Password = LocatorData.get("Password");
	Select_Domain = LocatorData.get("Select_Domain");
	OMEM_CST= LocatorData.get("OMEM_CST");

} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "Bizagi login Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
