

package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class NOAuthTransactions_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String General_Enquiry_Only_Button;
	public static String Additional_Processing_Button;
	public static String Other_Transaction_Button;
	public static String Authentication_Result_Cancel;
	public static String Cancel_Reason;
	public static String ValueDrop;
	public static String Type;
	public static String NoAuthButton;
	
	public static String IInformedCustomer;

	public static String Cancel_Observation;
	public static String SelectValue;
	public static String Value;
	public static String More_Info;
	public static String NoAuth_Button;
	public static String GeneralInfoScreen;

	public static String CheckIfContinueScreen;
	public static String Authenticate_ComplainOnly;


	public static String CorrespondanceForCustomer;
	
	public static String DetailOfCircumstanceFeedback;
	public static String DesiredOutcome;

	public static String CopyOfFeedBackButton;
	
	public static String  IConfirmInformedCustomer;

	public static String SummaryReport;
	
	public static String DoYouWantOtherTransactions;
	
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	General_Enquiry_Only_Button = LocatorData.get("General_Enquiry_Only_Button");
	Additional_Processing_Button = LocatorData.get("Additional_Processing_Button");
	Other_Transaction_Button = LocatorData.get("Other_Transaction_Button");
	Authentication_Result_Cancel = LocatorData.get("Authentication_Result_Cancel");
	Cancel_Reason  = LocatorData.get("Cancel_Reason");
	ValueDrop = LocatorData.get("ValueDrop");
	
	SummaryReport= LocatorData.get("SummaryReport");
	
	IInformedCustomer= LocatorData.get("IInformedCustomer");
	Type = LocatorData.get("Type");
	CheckIfContinueScreen= LocatorData.get("CheckIfContinueScreen");
	DoYouWantOtherTransactions= LocatorData.get("DoYouWantOtherTransactions");
	Cancel_Observation = LocatorData.get("Cancel_Observation");
	SelectValue = LocatorData.get("SelectValue");
	Value = LocatorData.get("Value");
	More_Info = LocatorData.get("More_Info");
	NoAuth_Button = LocatorData.get("NoAuth_Button");
	GeneralInfoScreen= LocatorData.get("GeneralInfoScreen");
	Authenticate_ComplainOnly= LocatorData.get("Authenticate_ComplainOnly");
	DesiredOutcome= LocatorData.get("DesiredOutcome");
	CopyOfFeedBackButton= LocatorData.get("CopyOfFeedBackButton");
	DetailOfCircumstanceFeedback= LocatorData.get("DetailOfCircumstanceFeedback");
	IConfirmInformedCustomer= LocatorData.get("IConfirmInformedCustomer");
	CorrespondanceForCustomer= LocatorData.get("CorrespondanceForCustomer");
	NoAuthButton= LocatorData.get("NoAuthButton");




	
	
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "NOAuthTransactions Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
