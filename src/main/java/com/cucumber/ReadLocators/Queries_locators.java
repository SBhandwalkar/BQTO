package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class Queries_locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String Queries_Drp;
	public static String Appication;
	public static String Branch_Search;
	public static String ReferanceNo;
	public static String ReferanceNumber;
	public static String SearchCEB;
	public static String CloseButton;
	public static String AgreementNo;
	public static String Agreement;
	public static String GCS;
	public static String CEBranchAndTelephonyScreen;
	public static String GCS_ID;
	public static String IDNumber;
	public static String ID_No;
	public static String TC_Tier_2_Search;
	public static String CaseNo;
	public static String Bizagi_Inbox;
	public static String OMEM_CST_Drp;

	public static String CloseSearch;
	public static String EmailFrom;
	
	
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	Queries_Drp = LocatorData.get("Queries_Drp");
	Appication = LocatorData.get("Appication");
	Branch_Search = LocatorData.get("Branch_Search");
	ReferanceNo = LocatorData.get("ReferanceNo");
	SearchCEB = LocatorData.get("SearchCEB");
	CloseButton = LocatorData.get("CloseButton");
	AgreementNo = LocatorData.get("AgreementNo");
	GCS = LocatorData.get("GCS");
	IDNumber = LocatorData.get("IDNumber");
	TC_Tier_2_Search = LocatorData.get("TC_Tier_2_Search"); 
	CaseNo = LocatorData.get("CaseNo");
	Bizagi_Inbox = LocatorData.get("Bizagi_Inbox");
	OMEM_CST_Drp = LocatorData.get("OMEM_CST_Drp");
	ID_No= LocatorData.get("ID_No");
	GCS_ID= LocatorData.get("GCS_ID");
	Agreement= LocatorData.get("Agreement");
	ReferanceNumber= LocatorData.get("ReferanceNumber");
	
	CloseSearch= LocatorData.get("CloseSearch");
	EmailFrom= LocatorData.get("EmailFrom");
	CEBranchAndTelephonyScreen= LocatorData.get("CEBranchAndTelephonyScreen");
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "AdviceAndSales Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
