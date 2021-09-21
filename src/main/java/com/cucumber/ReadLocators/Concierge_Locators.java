package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class Concierge_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	
	public static String Select_CustomerEngagementTelephony;
	public static String Identifications;
	public static String TaxRegistrations;
	public static String Nationalities;
	public static String Permits;
	public static String Addresses;
	public static String PosibbleFraud;
	public static String AuthenticationQuestions;
	public static String Decission;
	public static String Pass1;
	public static String Pass2;
	public static String Pass3;
	public static String Pass4;
	public static String LandingScreen;
	public static String ReferanceLibraryLink;
	public static String ChangeStatusTab;
	public static String EnquiriesTab;
	public static String ComplaintsFeedbackTab;
	public static String CloseReferanceLibraryScreen;
	public static String CreateStepOutTransaction;
	public static String ServiceGroupType;
	public static String ServiceGroupValue;
	public static String ServiceCatalogType;
	public static String ServiceCatalogValue;
	public static String Note;
	public static String TransactionType;
	public static String TransactionTypeValue;
	public static String SaveButon;
	public static String RelatedCasesTab;
	public static String DecissionRadioBtn;
	public static String EmailPreview;
	public static String Tier2Tab;
	public static String RelatedCasesBtn;
	public static String EnterCommentsBox;
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");

	Select_CustomerEngagementTelephony= LocatorData.get("Select_CustomerEngagementTelephony");
	Identifications= LocatorData.get("Identifications");
	TaxRegistrations= LocatorData.get("TaxRegistrations");
	Nationalities= LocatorData.get("Nationalities");
	Permits= LocatorData.get("Permits");
	Addresses= LocatorData.get("Addresses");
	PosibbleFraud= LocatorData.get("PosibbleFraud");
	AuthenticationQuestions= LocatorData.get("AuthenticationQuestions");
	Decission= LocatorData.get("Decission");
	Pass1= LocatorData.get("Pass1");
	Pass2= LocatorData.get("Pass2");
	Pass3= LocatorData.get("Pass3");
	Pass4= LocatorData.get("Pass4");
	LandingScreen= LocatorData.get("LandingScreen");
	ReferanceLibraryLink= LocatorData.get("ReferanceLibraryLink");
	ChangeStatusTab= LocatorData.get("ChangeStatusTab");
	CloseReferanceLibraryScreen= LocatorData.get("CloseReferanceLibraryScreen");
	ComplaintsFeedbackTab= LocatorData.get("ComplaintsFeedbackTab");
	EnquiriesTab= LocatorData.get("EnquiriesTab");
	CreateStepOutTransaction= LocatorData.get("CreateStepOutTransaction");
	ServiceGroupValue= LocatorData.get("ServiceGroupValue");
	ServiceGroupType= LocatorData.get("ServiceGroupType");
	ServiceCatalogType= LocatorData.get("ServiceCatalogType");
	ServiceCatalogValue= LocatorData.get("ServiceCatalogValue");
	Note= LocatorData.get("Note");
	TransactionType= LocatorData.get("TransactionType");
	TransactionTypeValue= LocatorData.get("TransactionTypeValue");
	SaveButon= LocatorData.get("SaveButon");
	RelatedCasesTab= LocatorData.get("RelatedCasesTab");
	DecissionRadioBtn= LocatorData.get("DecissionRadioBtn");
	EmailPreview= LocatorData.get("EmailPreview");
	Tier2Tab= LocatorData.get("Tier2Tab");
	RelatedCasesBtn= LocatorData.get("RelatedCasesBtn");
	EnterCommentsBox= LocatorData.get("EnterCommentsBox");
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "Concierge Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
