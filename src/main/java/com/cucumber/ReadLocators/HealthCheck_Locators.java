package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class HealthCheck_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String NewDropDownButton;
	public static String SelectTestBench;
	public static String Select360;
	public static String GCSID;
	public static String ValidatebankDetails;
	public static String Get360View;
	public static String Auto360Text;
	public static String NextButon;
	public static String VerifyCaseNo;
	public static String Inbox;
	public static String Get360ViewSearchBar;
	public static String View360LandingPage;
	public static String WorkOnItButton;
	public static String CustomerTab;
	public static String Tab360;
	public static String ProductsDataTab;
	public static String DocumentsTab;
	public static String LoopBackAndTestAgain;
	public static String RunGCSValidationService;
	public static String CaseNumber;
	public static String NoGCSValidationErrors;
	
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	NewDropDownButton = LocatorData.get("NewDropDownButton");
	SelectTestBench= LocatorData.get("SelectTestBench");
	Select360= LocatorData.get("Select360");
	GCSID= LocatorData.get("GCSID");
	NextButon= LocatorData.get("NextButon");
	VerifyCaseNo= LocatorData.get("VerifyCaseNo");
	Tab360= LocatorData.get("Tab360");
	ValidatebankDetails= LocatorData.get("ValidatebankDetails");
	CustomerTab= LocatorData.get("CustomerTab");
	ProductsDataTab= LocatorData.get("ProductsDataTab");
	DocumentsTab= LocatorData.get("DocumentsTab");
	Inbox= LocatorData.get("Inbox");
	Get360ViewSearchBar= LocatorData.get("Get360ViewSearchBar");
	View360LandingPage= LocatorData.get("View360LandingPage");
	WorkOnItButton= LocatorData.get("WorkOnItButton");
	LoopBackAndTestAgain= LocatorData.get("LoopBackAndTestAgain");
	RunGCSValidationService= LocatorData.get("RunGCSValidationService");
	CaseNumber= LocatorData.get("CaseNumber");
	Auto360Text= LocatorData.get("Auto360Text");
	Get360View= LocatorData.get("Get360View");

	NoGCSValidationErrors= LocatorData.get("NoGCSValidationErrors");
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "HealthCheck Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
